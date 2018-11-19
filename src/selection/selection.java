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
        int[] vet50 = new int[50];
        int[] vet100 = new int[100];
        int[] vet1000 = new int[1000];
        int[] vet10000 = new int[10000];
        
        //vet5 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet5.length; i++) {
        	vet5[i] = r.nextInt(5);
		}
        
        //vet10 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet10.length; i++) {
        	vet10[i] = r.nextInt(10);
		}
        
        //vet50 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet50.length; i++) {
        	vet50[i] = r.nextInt(50);
		}
        
        //vet100 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet100.length; i++) {
        	vet100[i] = r.nextInt(100);
		}
        
        //vet1000 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet1000.length; i++) {
        	vet1000[i] = r.nextInt(1000);
		}
        
        //vet10000 não ordenados
        System.out.println("Vetores não ordenados: ");
        for (int i = 0; i < vet10000.length; i++) {
        	vet10000[i] = r.nextInt(10000);
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
        
        //vet50 ordenados
        int[] arr4 = doSelectionSort(vet50);
        int cont50 = 0;
        System.out.println("\nVetores com 50 ordenados: ");
        for(int i:arr4){
            System.out.print(i);
            System.out.print(", ");
            cont50++;
        }
        System.out.println("\nTotal de comparações com 50: "+cont50);
        
        //vet100 ordenados
        int[] arr5 = doSelectionSort(vet100);
        int cont100 = 0;
        System.out.println("\nVetores com 100 ordenados: ");
        for(int i:arr5){
            System.out.print(i);
            System.out.print(", ");
            cont100++;
        }
        System.out.println("\nTotal de comparações com 100: "+cont100);
        
        //vet1000 ordenados
        int[] arr6 = doSelectionSort(vet1000);
        int cont1000 = 0;
        System.out.println("\nVetores com 1000 ordenados: ");
        for(int i:arr6){
            System.out.print(i);
            System.out.print(", ");
            cont1000++;
        }
        System.out.println("\nTotal de comparações com 1000: "+cont1000);
        
        //vet10000 ordenados
        int[] arr7 = doSelectionSort(vet10000);
        int cont10000 = 0;
        System.out.println("\nVetores com 10000 ordenados: ");
        for(int i:arr7){
            System.out.print(i);
            System.out.print(", ");
            cont10000++;
        }
        System.out.println("\nTotal de comparações com 10000: "+cont10000);
        
        double mediaTotal = ((cont5 + cont10 + cont50 + cont100 + cont1000 + cont10000)/6);
	    System.out.println("Número médio de comparações entre 5, 10, 50, 100, 1000 e 1000: \n"
	    		+ ""+mediaTotal);
    }
}
