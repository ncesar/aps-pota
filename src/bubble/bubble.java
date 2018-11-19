package bubble;

import java.util.Random;

public class bubble {
	public static void main(String args[]){
		//criação dos vetores com tamanhos fixos, porém não preenchidos
	    int[] vet5 = new int[5];
	    int[] vet10 = new int[10];
	    int[] vet50 = new int[50];
	    int[] vet100 = new int[100];
	    int[] vet1000 = new int[1000];
	    int[] vet10000 = new int[10000];

	    
	    Random r = new Random();//util para chamar os números aletórios
	    
	    int aux = 0;
	    int i = 0;
	     
	    //for com 5
    	System.out.println("Vetor desordenado com 5: ");
	    for(i = 0; i<5; i++){
	    	vet5[i] = r.nextInt(5);//preenchendo com números aleatorios
	        System.out.println(" "+vet5[i]); //imprimindo números aleatórios
	    }
	    
	    //for com 10
    	System.out.println("\nVetor desordenado com 10: ");
	    for(i = 0; i<10; i++){
	    	vet10[i] = r.nextInt(10);
	        System.out.println(" "+vet10[i]);
	    }
	    System.out.println(" ");
	    
	    //for com 50
    	System.out.println("\nVetor desordenado com 50: ");
	    for(i = 0; i<50; i++){
	    	vet50[i] = r.nextInt(50);
	        System.out.println(" "+vet50[i]);
	    }
	    System.out.println(" ");
	    
	    //for com 100
    	System.out.println("\nVetor desordenado com 100: ");
	    for(i = 0; i<100; i++){
	    	vet100[i] = r.nextInt(100);
	        System.out.println(" "+vet100[i]);
	    }
	    System.out.println(" ");
	    
	    //for com 1000
    	System.out.println("\nVetor desordenado com 1000: ");
	    for(i = 0; i<1000; i++){
	    	vet1000[i] = r.nextInt(1000);
	        System.out.println(" "+vet1000[i]);
	    }
	    System.out.println(" ");
	    
	    //for com 10000
    	System.out.println("\nVetor desordenado com 10000: ");
	    for(i = 0; i<10000; i++){
	    	vet10000[i] = r.nextInt(10000);
	        System.out.println(" "+vet10000[i]);
	    }
	    System.out.println(" ");
	     
	    //--------------------------------------------------//
	    
	    //vet5
	    int cont5 = 0;
	    for(i = 0; i<5; i++){
	        for(int j = 0; j<4; j++){
	            if(vet5[j] > vet5[j + 1]){
	                aux = vet5[j];
	                vet5[j] = vet5[j+1];
	                vet5[j+1] = aux;
	                cont5++;
	            }
	        }
	    }
	    
	    //vet10
	    int cont10 = 0;
	    for(i = 0; i<10; i++){
	        for(int j = 0; j<9; j++){
	            if(vet10[j] > vet10[j + 1]){
	                aux = vet10[j];
	                vet10[j] = vet10[j+1];
	                vet10[j+1] = aux;
	                cont10++;
	            }
	        }
	    }
	    
	    //vet50
	    int cont50 = 0;
	    for(i = 0; i<50; i++){
	        for(int j = 0; j<49; j++){
	            if(vet50[j] > vet50[j + 1]){
	                aux = vet50[j];
	                vet50[j] = vet50[j+1];
	                vet50[j+1] = aux;
	                cont50++;
	            }
	        }
	    }
	    
	    //vet100
	    int cont100 = 0;
	    for(i = 0; i<100; i++){
	        for(int j = 0; j<99; j++){
	            if(vet100[j] > vet100[j + 1]){
	                aux = vet100[j];
	                vet100[j] = vet100[j+1];
	                vet100[j+1] = aux;
	                cont100++;
	            }
	        }
	    }
	    
	    //vet1000
	    int cont1000 = 0;
	    for(i = 0; i<1000; i++){
	        for(int j = 0; j<999; j++){
	            if(vet1000[j] > vet1000[j + 1]){
	                aux = vet1000[j];
	                vet1000[j] = vet1000[j+1];
	                vet1000[j+1] = aux;
	                cont1000++;
	            }
	        }
	    }
	    
	    //vet10000
	    int cont10000 = 0;
	    for(i = 0; i<10000; i++){
	        for(int j = 0; j<9999; j++){
	            if(vet10000[j] > vet10000[j + 1]){
	                aux = vet10000[j];
	                vet10000[j] = vet10000[j+1];
	                vet10000[j+1] = aux;
	                cont10000++;
	            }
	        }
	    }
	    
	    //--------------------------------------------------//
	    
	    //imprimir organizados com 5
    	System.out.println("Vetor organizado com 5:");  
	    for(i = 0; i<5; i++){
	        System.out.println(" "+vet5[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 5: "+cont5);
	    
	    //imprimir organizados com 10
    	System.out.println("\nVetor organizado com 10:");
	    for(i = 0; i<10; i++){
	        System.out.println(" "+vet10[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 10: "+cont10);
	    
		//imprimir organizados com 50
    	System.out.println("\nVetor organizado com 50:");
	    for(i = 0; i<50; i++){
	        System.out.println(" "+vet50[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 50: "+cont50);
	    
		//imprimir organizados com 100
    	System.out.println("\nVetor organizado com 100:");
	    for(i = 0; i<100; i++){
	        System.out.println(" "+vet100[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 100: "+cont100);
	    
		//imprimir organizados com 1000
    	System.out.println("\nVetor organizado com 1000:");
	    for(i = 0; i<1000; i++){
	        System.out.println(" "+vet1000[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 1000: "+cont1000);
	    
		//imprimir organizados com 10000
    	System.out.println("\nVetor organizado com 10000:");
	    for(i = 0; i<10000; i++){
	        System.out.println(" "+vet10000[i]);
	    }
	    System.out.println("\nQuantidade de comparações com 10000: "+cont10000);
	    
	    int mediaTotal = ((cont5 + cont10 + cont50 + cont100 + cont1000 + cont10000)/6);
	    System.out.println("Número médio de comparações entre 5, 10, 50, 100, 1000 e 1000: \n"
	    		+ ""+mediaTotal);
	}
}
