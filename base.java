package tpa;
import java.util.Scanner;
public class base {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int b, e,p=1, i=1;
	System.out.println("informe a base");
	b=in.nextInt();
	
	System.out.println("Informe o expoente");
	e=in.nextInt();
	
	while(i<=e) {
		p=b*p;
		
		i++;
	}
	System.out.println("O resultado da potenciação é: " +p);
}
}
