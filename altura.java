package tpa;

import java.util.Scanner;

public class altura {
	public static void main(String[] args) {
		double  joaoA=1.35, pedroA=1.45;
		int anos=0;
		while (joaoA<pedroA){
			joaoA+=0.025;
			pedroA+=0.02;
			anos+=1;
		}
		System.out.println("joão sera mais alto que pedro em "+anos+ "anos");
		System.out.println("joão tera " +joaoA);
		System.out.println("perdro tera "+pedroA);
	}

}
