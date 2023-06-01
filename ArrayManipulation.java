import java.util.Scanner; 
public class ArrayManipulation 
{  
    public static void main(String[] args) 
    { 
        int n,sum=0;
        int[] array = new int[50];
        System.out.print("\nOperations in One-Dimensional Array.");
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the size of Array: ");  
        n=sc.nextInt();
        System.out.print("Enter the Elements of Array: ");
        for(int i=0; i<n; i++)
                array[i]=sc.nextInt();

        System.out.print("1. Array in reverse order: ");  // Reversing the Array
        for (int i=n-1; i>=0; i--)
                System.out.print(array[i] + " ");
        

        for (int i = 0; i < n; i++)  // Sum of All Elements of Array
                sum = sum + array[i];
        System.out.println("\n2. Sum of all the elements of an array: " + sum);

        
        int max = array[0],min=array[0]; // Largest and Smallest Element in Array
        for (int i = 0; i <n; i++)
            {
                if(array[i] > max)
                    max = array[i];
                if(array[i] < min)
                    min = array[i];
            }  
        System.out.println("3. Largest element in given array: " + max);
        System.out.println("4. Samllest element in given array: " + min);

        int temp = 0;                            // Sorting Array
        for (int i = 0; i < n; i++) 
        {     
            for (int j = i+1; j < n; j++) 
            {     
                if(array[i] > array[j]) 
                {    
                    temp = array[i];    
                    array[i] = array[j];    
                    array[j] = temp;    
                }     
            }     
        }  
        System.out.print("5. Sorted Elements of array in ascending order: ");    
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");


        System.out.print("\n\nOperations in Multi-Dimensional Array.");
        int R1, C1,R2,C2;              //Addition on Multidimensonal Array
        int[][] A1,A2;
        System.out.print("\nEnter the Row and Coloumn for 1st Array: ");
        R1 = sc.nextInt();
        C1 = sc.nextInt();
        A1 = new int[R1][C1];
        System.out.print("Enter the Row and Coloumn for 2nd Array: ");
        R2 = sc.nextInt();
        C2 = sc.nextInt();
        A2 = new int[R2][C2];
        
        System.out.print("Enter the values of 1st Array: ");
        for(int i=0; i<R1; i++)
        {
            for(int j=0; j<C1; j++)
            {
                int x = sc.nextInt();
                A1[i][j] = x;
            }
        }
        System.out.print("Enter the values of 2nd Array: ");
        for(int i=0; i<R2; i++)
        {
            for(int j=0; j<C2; j++)
            {
                int x = sc.nextInt();
                A2[i][j] = x;
            }
        }

        if(R1==R2 && C1==C2)
        {
            int[][] Sum = new int[R1][C1];
            for(int i = 0; i < R1; i++)
                for (int j = 0; j < C2; j++)
                    Sum[i][j] =A1[i][j] + A2[i][j];

            System.out.println("1. Sum of the given matrices is: ");
            for(int i = 0; i < R1; i++){
                for (int j = 0; j < C2; j++)
                    System.out.print(Sum[i][j]+"  ");
                System.out.println();
            }
        }
        else
            {
                System.out.println("Can't Find the Sum of Matrices.");
            }
        
        int C[][]=new int[R1][C2];  //Multiplication on Multidimensonal Array
        
        if(C1==R2)
        {
            System.out.println("2. Product of the given matrices is: ");
            for(int i=0; i<R1; i++)
            {
                for(int j=0; j<C1; j++)
                {
                    for(int k=0; k<C2; k++)
                        C[i][j] += A1[i][k]*A2[k][j];
                    System.out.print(C[i][j]+" ");   
                }
                System.out.println();
            }
        }
        sc.close();
    } 
}