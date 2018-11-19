package selection;

import java.util.Random;

public class selection {//reaproveitando o método como uma função
    public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
    	Random r = new Random();//util para chamar os números aletórios
    	
        int[] vet5 = new int[5];
        int[] vet10 = new int[10];
        
        //vet5 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet5.length; i++) {
        	vet5[i] = r.nextInt(5);
        	System.out.println(vet5[i]);
		}
        
        //vet10 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet10.length; i++) {
        	vet10[i] = r.nextInt(10);
        	System.out.println(vet10[i]);
		}
        
        //--------------------------------------------//
        
        //vet5 ordenados
        int[] arr2 = doSelectionSort(vet5);
        int cont5 = 0;
        System.out.println("\nVetores com 5 ordenados: ");
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
            cont5++;
        }
        System.out.println("\nTotal de comparações com 5: "+cont5);
        
        //vet10 ordenados
        int[] arr3 = doSelectionSort(vet10);
        int cont10 = 0;
        System.out.println("\nVetores com 10 ordenados: ");
        for(int i:arr3){
            System.out.print(i);
            System.out.print(", ");
            cont10++;
        }
        System.out.println("\nTotal de comparações com 10: "+cont10);
    }
}
