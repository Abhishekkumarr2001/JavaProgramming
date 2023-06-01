class X 
    {
        protected int i = 10;
        public void print() 
        { 
            System.out.println("\nInside Class X with Value: "+i);
        }
    }
interface W
    {
        public static int j=20;
        void printInterfaceW();
    }
interface Z
    {   
        public static int k=30;
        void printInterfaceZ();
    }

class Y extends X implements W, Z
    {
        public int a=15;
        public void printInterfaceW()
            {
                System.out.println("\nFrom Interface W with Value: " + j);
            }
        public void printInterfaceZ()
            {
                System.out.println("\nFrom interface Z with Value: " + k +"\n");
            }
        public void printY() 
            {
                System.out.println("\n\nInside Class Y with Value: " + a);
                super.print();
                printInterfaceW();
                printInterfaceZ();
            }
    }
class MultipleInheritance 
    {
        public static void main (String[] args)
        {
            Y Obj = new Y();
            Obj.printY();
        }
    }
