import java.util.*;

public class MyClass {
    public static void main(String args[]) {
Random rand = new Random(); 
 int valueA1[]=new int[100];
  int valueB1[]=new int[100];
 int valueA[]=new int[100];
  int valueB[]=new int[100];
   int valueC[]=new int[200];


 for(int i=0;i<100;i++){
valueA1[i] = rand.nextInt(500);
valueB1[i] = rand.nextInt(500); 
          }
          
          System.out.println("before Sorting");
            System.out.println("Array A");

          for(int i=0;i<100;i++){
        System.out.print(valueA1[i]+" ");

          }
          System.out.println("\n Array B");
          for(int i=0;i<100;i++){
              System.out.print(valueB1[i]+" ");
          }
          
          sort(valueA1,valueA);
          sort(valueB1,valueB);
          
   
          System.out.println("\n\nAfter Sorting"); 
    System.out.println("\nArray A\n");
        for (int i=0; i < 100; i++)
            System.out.print(valueA[i] + " ");
            System.out.println("\n");
            
            System.out.println("Array B");
        for (int i=0; i < 100; i++)
            System.out.print(valueB[i] + " ");
            
            System.out.println("\n");
mergeArrays(valueA,valueB, 100,100, valueC);
 
   System.out.println("Array after merging");
        for (int i=0; i < 200; i++)
            System.out.print(valueC[i] + " ");
            
   
    }
    static void sort(int arrin[],int[] arrfinal){
         int temp=0;
          
        for(int i=0;i<arrin.length-1;i++){
            
           for(int j=i+1;j<arrin.length;j++){
               if(arrin[i]>arrin[j]){
                  
                   temp=arrin[i];
                   arrin[i]=arrin[j];
                   arrin[j]=temp;
                   
               }
           }
           for(int k=0;k<arrin.length;k++)
           arrfinal[k]=arrin[k];
    }
    }
    
    
  static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
    
        int i = 0, j = 0, k = 0;
     
        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
     
        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];
     
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
}
