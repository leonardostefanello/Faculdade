package exercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class EX16PreçoMercadoria {
    	public static void main(String[] args) throws Exception {
            //decoração + console info
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");

            //variável
            String str, escolha;

            //escolha
            System.out.println("A. Categoria A");
            System.out.println("B. Categoria B");
            System.out.println("S. Sair");
            System.out.println("\n");
            
            //leitura
            System.out.println("- Digite a sua escolha: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();

            escolha = str.toUpperCase(); //resposta para maiusculo

            // switch == respostas diferentes executam codigos diferentes
            switch (escolha) {
                case "A": //valor == A
                	categoriaA();
                    break;
                case "B": //valor == B
                	categoriaB();
                    break;
                case "S": //valor == S
                    System.out.println("Até logo...");
                    break;
                default:
                    System.out.println("Letra Inválida");
            }
            System.out.println("---------------------------------------------");
    }

    //--> Categoria A
    public static void categoriaA() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String nome, preço;
        double p2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o Nome do Produto: ");
        nome = br.readLine();
        System.out.println("Digite o Preço do Produto: ");
        preço = br.readLine();

        p2 = Integer.parseInt(preço); //string para inteiro
        
        //conversão para BRL
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        if (p2 >= 100) {
            //calculo
        	resultado = p2 - (0.5 * p2);

            //print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: A");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        } else if (p2 <= 100) {
            //calculo
        	resultado = p2 - (0.8 * p2);

            //print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: A");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        }
    }

    //--> Categoria B
    public static void categoriaB() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String nome, preço;
        double p2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o Nome do Produto: ");
        nome = br.readLine();
        System.out.println("Digite o Preço do Produto: ");
        preço = br.readLine();

        p2 = Integer.parseInt(preço); //string para inteiro
        
        //converte para BRL
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        if (p2 >= 50) {
            //calculo
        	resultado = p2 - (0.10 * p2);

            //print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: B");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));

        } else if (p2 <= 50) {
            //calculo
        	resultado = p2 - (0.12 * p2);

            //print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: B");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        }
    }
}
