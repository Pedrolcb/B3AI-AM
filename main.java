import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner ( System.in );
	    Scanner input1 = new Scanner ( System.in );
	    Scanner input2 = new Scanner ( System.in );
        String n, n2;
		    int p = 1, s = 1, v[], j, k, menor = 0;
		
		
		while (p < 1 || p >10000){
    		System.out.println("Informe quantas pessoas há na festa: ");
    		n = input.next();
    		p = Integer.parseInt(n);
		}
		
		while (s < 1 || s > 10000){
    		System.out.println("Informe quantos sanduiches foram pedidos: ");
    		n = input1.next();
    		s = Integer.parseInt(n);
		}
		
		v = new int[s];
		
		for (k = 0 ;  k < s ; k++){
		    v [k] = 1;
		    while (v [k] < 1 || v [k] > 10000){
    		    System.out.println("Informe o tamanho dos sanduiches que foram pedidos: ");
    		    n2 = input2.next();
    		    v [k] = Integer.parseInt(n2);
		    }
		}
		
		
		
		int soma = 0, b = 0 ;
		while (soma != p){
		    soma = 0;
		    b ++;
		    for (j = 0 ; j < s ; j++){
		        soma = soma + (v [j] / b);
		        if ((v [j] / b) <= 0){
		            break;
		        }
		    }
		}
		soma = 0;
		b =  (b * 2) + 1;
		while (soma != p){
		    soma = 0;
		    b --;
		    for (j = 0 ; j < s ; j++){
		        soma = soma + (v [j] / b);
		        if ((v [j] / b) <= 0){
		            break;
		        }
		    }
		}
		System.out.println(b);
		
	}
}
