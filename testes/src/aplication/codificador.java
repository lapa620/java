package aplication;
import java.util.ArrayList;
import java.util.Scanner;

public class codificador {

        public static void main(String[] args) {
            ArrayList<Integer> codigo = new ArrayList<>();
            char[] letras = "xyzabcdefghijklmnopqrstuvw".toCharArray();
            Scanner sc = new Scanner(System.in);
            int op = 0;
            int ops;
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
                        codigo.clear(); // limpa a lista
                        System.out.println("escolha uma palavra para criptografar");
                        String palavra = sc.next();

                        for(int i = 0; i < palavra.length(); i++) {//para percorrer cada letra da palavra
                            //para comparar as letras com o alfabeto
                            for(int j = 0; j < letras.length; j++) {
                                if (palavra.charAt(i) == letras[j]) {
                                    codigo.add(j);
                                }}}
                        System.out.println(codigo);
                        break;
                    case 2:
                        System.out.println("deseja escrever uma mensgem ou decodificar a mensagem feita aqui");
                        System.out.println("[1]-mensagem anterior   [2]-nova mensagem");
                        ops = sc.nextInt();
                        switch (ops){
                            case 1:
                        for(int i = 0; i < codigo.size(); i++) {
                            int num = codigo.get(i);
                            System.out.print(letras[num]);
                        }
                        System.out.println();
                        break;
                            case 2:
                            System.out.print("em processo...");
                                break;

                        }break;
                    case 3:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                System.out.println();
            }

        }}
