class Rectangle
    {
        int Length,Breadth;
        void Sval(int a,int b)
            {
                Length=a;
                Breadth=b;
            }
        int GetR()
            {
                return Length*Breadth;
            }
    }
class Triangle extends Rectangle
    {
        int Breadth,Height;
        float Area;
        void Sdata(int q,int r)
            {
                Breadth=r;
                Height=q;
            }
        float GetT()
            {
                Area=(float)Length/2*Breadth*Height;
                return (Area);
            }
    }

class SingleInheritance
    {
    public static void main(String args[])
        {
            Triangle T=new Triangle();
            T.Sval(30,20);
            T.Sdata(10,20);
            System.out.println("\n\nArea of Rectangle is calculated as :" +T.GetR());
            System.out.println("Area of Triangle is calculated As :"+T.GetT()+"\n");
        }
    }