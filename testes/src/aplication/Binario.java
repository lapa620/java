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
				   [2]-Binario para decimal
				   [3]-sair
				-----------------------------
				""";
        ArrayList<Integer> Binarios = new ArrayList<>();
        int op = 0;
       double soma = 0;
        int N_Binario = 0;
        while(op != 3){
            System.out.println("");
            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            op =sc.nextInt();
            switch (op) {
                case 1:System.out.println("escolha um numero para transformar em Binario: ");
                    int N_Decimal = sc.nextInt();
                    for( ;N_Decimal != 0; ){
                         N_Binario = N_Decimal %2;//para pegar o resto do numero dividio por 2
                        N_Decimal =N_Decimal/2; // para diviir o numero por 2 antes de pegar o resto na proxima vez que esse for rodar
                        Binarios.add(N_Binario);//para adicionar na lista
                    }
                    int tamanho = Binarios.size();
                    System.out.print("O seu numero em Binario é: ");
                    //para rodar a lista de forma invertida ja que em binario voce tem que inverter a ordem dos valores
                    for(int i = tamanho - 1;i !=-1; i--) {
                        System.out.print("\n"+Binarios.get(i)); }

                case 2:
                    System.out.println("qual numero binario você quer converter para decimal: ");
                    N_Binario = sc.nextInt();
                    String N_Btext = String.valueOf(N_Binario);//para tranformar em texto o numero

                    //para percorrer a lista e ver o que esta em cada caracthere
                    for(int i= 0; i < N_Btext.length()  ; i++){
                    if (N_Btext.charAt(i) == '1'){
                        int expoente = N_Btext.length() - 1 - i;
                         double calc =Math.pow(2, expoente);
                           soma = soma + calc; };

                    }
                    System.out.println(soma);
            }}}}

