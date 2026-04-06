package aplication;
import java.util.ArrayList;
import java.util.Scanner;

public class codificador {

    public static void main(String[] args) {

        ArrayList<Integer> Binarios = new ArrayList<>();
        char[] letras = "xyzabcdefghijklmnopqrstuvw".toCharArray();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while(op != 3) {
            System.out.println("codificador");
            System.out.println("[1]-codificar texto");
            System.out.println("[2]-descodificar texto");
            System.out.println("[3]-sair");
            System.out.println("(Enter para poder seleconar as opçoes: )");
            sc.nextLine();//para limpar o scanner
            System.out.println("escolha uma das opçoes");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Binarios.clear(); // limpa a lista

                    System.out.println("escolha uma palavra para criptografar");
                    String palavra = sc.next();

                    for(int i = 0; i < palavra.length(); i++) {//para percorrer cada letra da palavra
                         //para comparar as letras com o alfabeto
                        for(int j = 0; j < letras.length; j++) {
                            if (palavra.charAt(i) == letras[j]) {
                                Binarios.add(j + 1);
                            }}}
                    System.out.println(Binarios);
                    break;
                case 2:
                    System.out.println("Ainda não foi feito");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            System.out.println();
        }

    }}
