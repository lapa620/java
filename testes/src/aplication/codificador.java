package aplication;
import java.util.ArrayList;
import java.util.Scanner;

public class codificador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lista que sera percorrida
		ArrayList<Integer> Binarios = new ArrayList<>();
		char[] letras = "xyzabcdefghijklmnopqrstuvw".toCharArray();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		while(op !=3) {
			System.out.println("codificador");
			System.out.println("[1]-codificar texto");
			System.out.println("[2]-descodificar texto");
			System.out.println("[3]-sair");
			op = sc.nextInt();
		switch (op) {
		case 1:
		System.out.println("escolha uma palavra para criptografar de forma simples");
		String palavra =sc.next();
		
		for(int i = 0;i < palavra.length();i++) {
			for(int j = 0;j < letras.length;j++) {
				if (palavra.charAt(i) == letras[j]) {
					Binarios.add((j+1));
					int codificado = j+1;
					
				}
			}}
			
		System.out.print(Binarios);}
		System.out.println(" ");
		}
	}}
