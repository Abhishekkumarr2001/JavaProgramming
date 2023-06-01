class Store
    {
    public void MethodStore()
        {
            System.out.println("Inside the Class Store");
        }
    }
class Stationery extends Store
    {
        Stationery()
        {
            System.out.println("\n\nMethod of Class Stationery");
        }
    }
class FoodSupplies extends Store
    {
        FoodSupplies()
        {
            System.out.println("Method of Class FoodSupplies");
        }
    }
class ClensingProducts extends Store
    {
        ClensingProducts()
        {
            System.out.println("Method of Class ClensingProducts");
        }
    }
class HierarchicalInheritance
    {
        public static void main(String args[])
        {
            Stationery obj1 = new Stationery();
            FoodSupplies obj2 = new FoodSupplies();
            ClensingProducts obj3 = new ClensingProducts();

            //All classes can access the method of class Store
            
            obj1.MethodStore();
            obj2.MethodStore();
            obj3.MethodStore();
        }
    }