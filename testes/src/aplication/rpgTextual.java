package aplication;

import java.util.Random;
import java.util.Scanner;

public class rpgTextual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menu= """
				[1]-atacar 
				[2]-curar
				
							""";
		 int opl = 0;
		Random rand = new Random();
		int hpPlayer = rand.nextInt(40);
		int hpInimigo = rand.nextInt(30);
		Scanner sc = new Scanner(System.in);
		System.out.println("bem vindo a sua aventura ");
		System.out.println("escolha um dos lados: [1]-esquerda ou [2]-direita");
		int lado = sc.nextInt();
		//caminho da esquerda
		if (lado == 1) {
			
			System.out.println("voce foi para esquerda voce encontrou um loboo");
			System.out.println("a luta comçou ");
			do {
				int atkPlayer = rand.nextInt(9);
				 int atkInimigo = rand.nextInt(9);
		
			System.out.println(menu);
			System.out.println("sua vida atual é "+hpPlayer);
			System.out.println("vida atual do lobo é "+hpInimigo);
			
			opl = sc.nextInt();
			switch(opl) {
			case 1: 
				hpInimigo = hpInimigo - atkPlayer ;
				System.out.println(" voce deu "+atkPlayer +" de dano");
				if (hpInimigo < 0) {
					hpInimigo = 0;
			    }
				System.out.println("seu inimigo esta com "+ hpInimigo +" de vida");break;
			case 2:
				hpPlayer = hpPlayer + rand.nextInt(10);
				System.out.println("voce esta com "+hpPlayer +" de vida");
				break;
				
			
			}
			if(hpInimigo >0) {
			System.out.println("vez do inimigo: ");
			System.out.println("ele te corta com suas garras");
			hpPlayer = hpPlayer - atkInimigo;
			if (hpPlayer < 0) {
				hpPlayer = 0;
		    }
			System.out.println("seu inimigo te deu: "+atkInimigo +" de dano");
			
			}
					}while(hpInimigo > 0 && hpPlayer > 0);
			System.out.println("a aventura terminou");
		}
		//voce foi para direita
		else {System.out.println("voce foi para direita");
		System.out.println("você não encontra nada alem de uma largatixa fofa");
			
			
		}
		
		
		
		
	}

}
