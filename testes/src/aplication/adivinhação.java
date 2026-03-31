package aplication;
import java.util.Scanner;
import java.util.Random;

public class adivinhação {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int n = rand.nextInt(11);
		int n1 = -1;
		String op= "e";
		while(!op.equals("n")){
		System.out.println("escolha um numero de 0 a 10: " );
		 n1 =sc.nextInt();
		
		
		if(n1 == n){
			System.out.print("numero correto");
			break;
		}
		else {
			System.out.println("numero errado");
		}
		
		System.out.println("\n você quer continuar: (s/n)");
     		op =sc.next();
		
		}
			
		
		};
		
	}

