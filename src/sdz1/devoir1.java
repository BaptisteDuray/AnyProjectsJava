package sdz1;

import java.util.Scanner;
public class devoir1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Double prix;
		Double prixA = 0.80;
		Double prixB= 0.70;
		Double prixC = 0.60;
		System.out.println("Bonjour");
		System.out.print("Combien de kilos avez-vous ? ");Double kilos=sc.nextDouble();
		System.out.println("Vous avez "+kilos+" kilos.");

		if((1<kilos)&&(kilos<=50)){
		prix=kilos*prixA;
		System.out.print("Vous devez payer : ");
		System.out.format("%.2f\n",prix);
		System.out.format("Votre prix au kilos est de :%.2f euros\n",prixA);
		System.out.println(prixA +" x "+kilos+" = "+prix);
		}

		else if((51<=kilos)&&(kilos<=100)){
		prix=kilos*prixB;
		System.out.format("Vous devez payer :%.2f euros\n",prix);
		System.out.print("Votre prix au kilos est de :");
		System.out.format("%.2f\n",prixB);
		System.out.print(prixB +" x "+ kilos);
		System.out.print(" = ");
		System.out.format("%.2f\n",prix);

		}

		else {
		prix=kilos*prixC;
		System.out.format("Vous devez payer %.2f euros\n",prix);
		System.out.print("Votre prix au kilos est de :");
		System.out.format("%.2f\n",prixC);
		System.out.print(prixC +" x "+ kilos);
		System.out.print(" = ");
		System.out.format("%.2f\n",prix);
		}
		System.out.println("Merci de votre visite");
		System.out.println("Au revoir");



		}

	}


