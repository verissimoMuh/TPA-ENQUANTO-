package tpa;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in) ;
		int numero, fatorial = 1;
        int contador = 1;

        do{
            System.out.println("Digite um nº");
            numero = in.nextInt();
            
            for(int i = 1;i <= numero; i++){
                fatorial = fatorial * i;
            }
            
            System.out.println("!" + numero+ " = " + fatorial);
            contador++;
            
       }while(contador < 2);
    }
}