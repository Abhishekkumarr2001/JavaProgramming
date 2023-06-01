import java.io.*;
import java.lang.Math;

class Complex
    {
        double Real, Imaginary;
        Complex()
            {
                this.Real = 0;
                this.Imaginary = 0;
            }
        Complex(double Real, double Imaginary)
            {
                this.Real = Real;
                this.Imaginary = Imaginary;
            }
        Complex(int Real, int Imaginary)
            {
                this.Real = (double)Real;
                this.Imaginary = (double)Imaginary;
            }
        public String display()
            {
                if(this.Imaginary>0)
                    return String.format("(%.2f + %.2fi)", this.Real, this.Imaginary);
                else
                    return String.format("(%.2f - %.2fi)", this.Real, -1*this.Imaginary);
            }
    }

public class ComplexNumbers
    {
        public static Complex Addition(Complex C1, Complex C2)
        {
            Complex Result = new Complex();
            Result.Real = C1.Real + C2.Real;
            Result.Imaginary = C1.Imaginary + C2.Imaginary;
            return Result;
        }
        public static Complex Difference(Complex C1, Complex C2)
        {
            Complex Result = new Complex();
            Result.Real = C1.Real - C2.Real;
            Result.Imaginary = C1.Imaginary - C2.Imaginary;
            return Result;
        }

        public static Complex Multiplication(Complex C1, Complex C2)
        {
            Complex Result = new Complex();
            Result.Real = (C1.Real * C2.Real) - (C1.Imaginary * C2.Imaginary);
            Result.Imaginary = (C1.Real * C2.Imaginary) + (C2.Real * C1.Imaginary);
            return Result;
        }

        public static Complex Division(Complex C1, Complex C2)
        {
            Complex Result = new Complex();
            Result.Real = ((C1.Real * C2.Real) + (C1.Imaginary * C2.Imaginary)) / ((C2.Real * C2.Real) + (C2.Imaginary * C2.Imaginary));
            Result.Imaginary = ((C2.Real * C1.Imaginary) - (C1.Real * C2.Imaginary)) / ((C2.Real * C2.Real) + (C2.Imaginary * C2.Imaginary));
            return Result;
        }

        public static void main(String[] args) throws IOException
        {
            double a,b,c,d;

            a = (int)(Math.random()*100);
            b = (int)(Math.random()*100);          
            c = (int)(Math.random()*100);
            d = (int)(Math.random()*100);

            Complex C1 = new Complex(a,b);
            Complex C2 = new Complex(c,d);
            Complex Result = new Complex();

            File file = new File("ComplexNumbersOperations.txt");
            if( !file.exists() )
                file.createNewFile();
            FileWriter F = new FileWriter(file);
            Result = Addition(C1, C2);
            F.write("\nOperations on Complex Numbers:\n\n" );
            F.write("Addition: " );
            F.write( C1.display() + " + " + C2.display() + " = " + Result.display() + "\n" );
            Result = Difference(C1, C2);
            F.write("Difference: " );
            F.write( C1.display() + " - " + C2.display() + " = " + Result.display() + "\n");
            Result = Multiplication(C1, C2);
            F.write("Multiplication: " );
            F.write( C1.display() + " * " + C2.display() + " = " + Result.display() + "\n");
            Result = Division(C1, C2);
            F.write("Division: " );
            F.write( C1.display() + " / " + C2.display() + " = " + Result.display() + "\n");
            F.close();
            System.out.println("\nData is succesfully Written in File.");
        }
    }