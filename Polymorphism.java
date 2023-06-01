class Point 
    {
        int x,y;
        Point(int x,int y)
        {
            this.x = x;
            this.y = y;
        }
        float distance(int x, int y)   
        {
            int dx = this.x - x;
            int dy = this.y - y;
            return (float) Math.sqrt ( dx* dx + dy * dy );
        }
        float distance(Point p)
        {
            return distance(p.x,p.y);
        }
    }

class Plane extends Point 
    {
        int z ;
        Plane ( int x, int y, int z )
        {
            super ( x, y );
            this.z = z;
        }
        float distance (int x,int y, int z )
        {
            int dx = this.x - x;
            int dy = this.y - y;
            int dz = this.z - z ;
            return (float)Math.sqrt( dx * dx + dy*dy + dz*dz );
        }
        float distance (Plane pt) 
        {
        return distance (pt.x, pt.y, pt.z );
        }
    }

class Polymorphism
    {
        public static void main ( String args [ ] ) 
        {
            Point p1 = new Point (10,20);
            Point p2 = new Point (11,41);
            Point p3 = new Plane (11,15,19);
            Point p4 = new Plane (7,15,21); 

            float d0 = p1.distance(0,0);
            float d1 = p1.distance(p2);
            System.out.println("\n\nDistance from P2 to Origin = " + d0);
            System.out .println("Distance from P2 to P1 = " + d1);
            d1=p4.distance(p3);
            System.out.println ("Distance from P3 to P4= "+ d1);
        }
    }