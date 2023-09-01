package tpa;
import java.util.Scanner;
public class seuquenciaF {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in) ;
	int n, anterior=0, atual=1, proximo=1;
	Scanner ler= new Scanner (System.in);
	System.out.println("Informe um enésimo:");
	n = ler.nextInt();
	while (n>0) {
		System.out.println(atual);
		proximo= atual+anterior;
		anterior=atual;
		atual= proximo;
		n=n-1;
		
	}
	ler.close();
}
}
