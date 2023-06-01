class Overloading
{
    public String operator(String a, String b, String c) //Operator Overloading
    {
        return a+b+c;
    }
    
    public double operator(double x, double y, double z) 
        {
            return x+y+z;
        }
}
    
public class OperatorOverloading 
{
    public static void main(String[] args) 
        {
            Overloading obj = new Overloading();
            System.out.println("\n");
            System.out.println(obj.operator("Hello ","It's ","OperatorOverloading."));
            
            double l = obj.operator(1.59,9.67,8.99);
            int m = (int) l;                              //Type Conversion
            float n=m;
            System.out.println("Value of L :"+l);
            System.out.println("Value of M :"+m);
            System.out.println("Value of N :"+n);
        }
}