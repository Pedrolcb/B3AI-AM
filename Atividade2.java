import java.util.Scanner;

public class Atividade2
{
	public static void main(String[] args) {
		 Scanner inputV = new Scanner ( System.in );
		 System.out.println("Digite a quantidade de vendedores: ");
    	 String numeroV = inputV.next();
    	 int V = Integer.parseInt(numeroV);
    	 if (V < 1 || V > 1000){
    	     System.out.println("Não é permitido inserir valores menores que 1 e maiores que 1000. Reinicie o programa, por favor. ");
    	     System.exit(0);
    	 }
    	 
         Scanner inputC = new Scanner ( System.in );
         System.out.println("Digite a quantidade de ligações: ");
    	 String numeroC = inputC.next();
    	 int C = Integer.parseInt(numeroC);
    	 if (C < 1 || C > 1000000){
    	     System.out.println("Não é permitido inserir valores menores que 1 e maiores que 1000. Reinicie o programa, por favor.");
    	     System.exit(0);
    	 }
    	 
    	 Scanner inputP = new Scanner ( System.in );
    	 int P[];
    	 P = new int[C];
    	 
    	 for(int i = 0; i < V; i++){
    	     if(i == 0){
    	         System.out.println("Digite o tempo de ligação: ");
    	     }
    	     if(i > 0){
    	         System.out.println("Digite o próximo tempo de ligação: ");
    	     }
    	     String numeroP = inputP.next();
    	     P[i] = Integer.parseInt(numeroP);
    	     
    	     if (P[i] < 1 || P[i] > 30){
    	     System.out.println("Não é permitido inserir valores menores que 1 e maiores que 1000. Reinicie o programa, por favor.");
    	     System.exit(0);
    	 }
	     
    	 }
    	 int A[][];
    	 A = new int[V][C];
    	 int j = 1, k = 1, b = 0, m = 0;
    	 
    	 for (j = 0; j < V; j++){
    	    A[0][j] = j + 1;
    	    A[1][j] = 0;
    	 }
    	 
    	 for (k = 0; k < C; k++){
    	    m = A[1][0];
    	    for(b = 0; b < V; b++){
    	        if(A[1][b] < A[1][b++]){
    	            m = b;
    	        }
    	        
    	    }
    	    A[1][m] = P[k]; 
    	 }
    	 
    	 for (k = 0; k < V; k++){
    	    System.out.println("  ");
    	    for(b = 0; b < 2; b++){
    	        System.out.println(A[b][k]);
    	    }
    	 }
	}
}
