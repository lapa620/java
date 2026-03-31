package aplication;

import java.util.Scanner;

public class Crud {
	public static void main(String[] args) {
		String menu = """
  |         CRUD SISTEMA  JAVA         |
  |  1-Adicione cadastro               |
  |  2-sair                            |
  --------------------------------------
				""";
		int op=0;
		
		Scanner sc = new Scanner(System.in);
		while(op != 2) {
		System.out.println(menu);
		op =sc.nextInt();
		switch (op) {
		
		case 1:
		
		System.out.println("quantos cadastros voce quer fazer: ");
		int cadastros = sc.nextInt();
		String lista[] = new String[cadastros];
	
	for(int i = 0;i<cadastros; i++) {
		System.out.println("quem voce quer cadastrar na posição º"+ (i+1));
		lista[i] = sc.next(); 
	}
	for(int i = 0;i<cadastros; i++) {
		//CRUD
		System.out.println("O sistema deve permitir fazer cadastro "+lista[i]);
		System.out.println("O sistema deve permitir fazer leitura "+lista[i]);
		System.out.println("O sistema deve permitir fazer atualização "+lista[i]);
		System.out.println("O sistema deve permitir fazer delete "+lista[i]);
		
	}
	
		
		}
	}}
	
}
