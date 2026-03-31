package aplication;
import java.util.ArrayList;
import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
// Conversor de numeros para binario
		String menu = """
				-----------------------------
				    Escolha uma das opçoes
				   [1]-decimal para binario
				   [3]-Sair
				-----------------------------

				""";
		ArrayList<Integer> Binarios = new ArrayList<>();
		System.out.println(menu);
		int op = 0;
		Scanner sc = new Scanner(System.in);
		op =sc.nextInt();
		
	switch (op) {
	
	case 1:System.out.println("escolha um numero para transformar em Binario: ");
	int N_Decimal = sc.nextInt();
		
		for( ;N_Decimal != 0; ){
			if(N_Decimal !=0) { 
				int N_Binario = N_Decimal %2;
			   N_Decimal =N_Decimal/2;
			   Binarios.add(N_Binario);
			
			 
			}
			
				
		}
		int tamanho = Binarios.size();
		for(int i = tamanho - 1;i !=-1; i--) {
		System.out.print(Binarios.get(i)); }
		
		
	}}}
