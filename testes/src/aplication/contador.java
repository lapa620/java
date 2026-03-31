package aplication;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int cont;
	String op;
	op="0";
	String menu ="""
------------------------------------
	menu de contagem
------------------------------------
					
	[1]-contagem regresiva
	[2]-contagem progressiva
	[3]-sair
			""";
	do {
	System.out.print(menu);
	System.out.print("qual opçao voce quer: ");
	op = sc.nextLine();
	switch (op){
	case "1":
	System.out.print("digite um numero para fazer contagem regressiva: ");
	cont = sc.nextInt();
	for(int i = cont; i> 0; i--) {
		System.out.println(i);
			    try {
			        Thread.sleep(1000); // Espera 1 segundo entre cada número [2]
			    } catch (InterruptedException e) {
			        // Tratamento de erro obrigatório para o sleep [6]
			    }
		}
		break;
		
	 case"2":
		 System.out.print("digite um numero para fazer contagem progressiva: ");
			cont = sc.nextInt();
			for(int i = 0; i !=cont ; i++) {
				
				System.out.println(i+1);
			
			    try {
			        Thread.sleep(1000); // Espera 1 segundo entre cada número [2]
			    } catch (InterruptedException e) {
			        // Tratamento de erro obrigatório para o sleep [6]
			    
			}}
	
	}
	
	} while (op == "3");
}
}