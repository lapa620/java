package aplication;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int senha= 0;
		String login;
		int senhaL= 1;
		
		String menu ="""
				escolha uma das opçoes abaixo
				
				[1]-crie login
				[2]-logar
				[3]-sair
				""";
		
		Scanner sc = new Scanner(System.in);
		int op= 0;
		while(op!=3) {
		
		System.out.println(menu);
		op = sc.nextInt();
		switch (op) {
		case 1:
		System.out.println("crie um nome");
		nome = sc.next();
		
		System.out.println("crie uma senha");
		senha = sc.nextInt();
		break;
		case 2:
		System.out.println("digite seu nome");
		login = sc.next();
		
		System.out.println("digite sua senha");
		senhaL = sc.nextInt();
		if(senha == senhaL) {
			System.out.println("login efetuado com sucesso");
		}
		else {System.out.println("login falho tente novamente");
		}
		break;
		};
		
		;
		}}
		
		
		
	}


