import java.util.Scanner;

public class Atividade3
{
	public static void main(String[] args) {
	    
    Scanner ler = new Scanner(System.in);
    Scanner lar = new Scanner(System.in);

    int retangulo1[] = new int[4]; 
    int i, p=0; 
   
    int retangulo2[] = new int[4]; 
    int j; 
    
    for (i=0; i<4; i++) {
      System.out.printf("Informe as coordenadas do primeiro retângulo: ", retangulo1);
      String N = ler.next();
      retangulo1[i] = Integer.parseInt(N);
      if(retangulo1[i]<0 || retangulo1[i]>1000000){
          System.out.println("Não é possível inserir valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
 
    for (j=0; j<4; j++) {
      System.out.printf("Informe as coordenadas do segundo retângulo: ", retangulo2);
      String M = lar.next();
      retangulo2[j] = Integer.parseInt(M);
      if(retangulo2[j]<0 || retangulo2[j]>1000000){
          System.out.println("Não é possível inserir valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
    
    while (p!=1000){
        if(retangulo1[0]==retangulo2[0] || retangulo1[1]==retangulo2[1] || retangulo1[2]==retangulo2[2] || retangulo1[3]==retangulo2[3] ){ 
            System.out.printf("1");
            break;
    	}
    	
    	if(retangulo1[2]>retangulo2[0] && retangulo1[2]<retangulo2[2]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
    	}
    	if(retangulo1[3]>retangulo2[1] && retangulo1[3]<retangulo2[3]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
    	    break;
    	}
	}
	}
}
