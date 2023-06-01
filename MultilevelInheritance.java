class Box 
    {
        private double width,height,depth;
        Box(double w, double h, double d) 
            {
                width = w;
                height = h;
                depth = d;
            }
        double volume() // Calculating Volume
            {
                return width * height * depth;
            }
    }

class Weight extends Box 
    {
        double weight; 
        Weight(double w, double h, double d, double m) 
        {
            super(w, h, d);
            weight = m;
        }
    }

class Shipment extends Weight 
    {
        double cost;
        Shipment(double w, double h, double d, double m, double c) 
        {
        super(w, h, d, m);
        cost = c;
        }
    }

public class MultilevelInheritance
    {
        public static void main(String args[]) 
        {
            Shipment S1 = new Shipment(15,12,17,45,21.36);
            Shipment S2 = new Shipment(10,11,15,21,14.74);
            double vol;
            vol = S1.volume();
            System.out.println("\n\nVolume of Shipment 01 is: " + vol);
            System.out.println("Weight of Shipment 01 is: " + S1.weight);
            System.out.println("Shipping cost: Rs " + S1.cost);
            System.out.println();
            vol = S2.volume();
            System.out.println("Volume of Shipment 02 is " + vol);
            System.out.println("Weight of Shipment 02 is " + S2.weight);
            System.out.println("Shipping cost: Rs " + S2.cost +"\n");
        }
    }
        
