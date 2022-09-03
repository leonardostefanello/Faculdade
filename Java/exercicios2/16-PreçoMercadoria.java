package exercicio2;

//Substitui o Scanner :)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class PreçoMercadoria {
    	public static void main(String[] args) throws Exception {
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");

            System.out.println("A. Categoria A");
            System.out.println("B. Categoria B");
            System.out.println("S. Sair");
            System.out.println("\n");
            
            System.out.println("- Digite a sua escolha: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            String escolha = str.toUpperCase(); //resposta para maiusculo

            //Dependendo da resposta o codigo executado muda
            switch (escolha) {
                case "A":
                	categoriaA();
                    break;
                case "B":
                	categoriaB();
                    break;

                case "S":
                    System.out.println("Até logo...");
                    break;

                default:
                    System.out.println("Letra Inválida");
            }

            System.out.println("---------------------------------------------");
    }

    	//Categoria A
    public static void categoriaA() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String nome, preço;
        double p2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o Nome do Produto: ");
        nome = br.readLine();
        System.out.println("Digite o Preço do Produto: ");
        preço = br.readLine();

        //Valores
        p2 = Integer.parseInt(preço);
        
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        if (p2 >= 100) {
        	resultado = p2 - (0.5 * p2);
            //Print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: A");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        } else if (p2 <= 100) {
        	resultado = p2 - (0.8 * p2);
            //Print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: A");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        }
    }

    //Categoria B
    public static void categoriaB() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String nome, preço;
        double p2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o Nome do Produto: ");
        nome = br.readLine();
        System.out.println("Digite o Preço do Produto: ");
        preço = br.readLine();

        //Valores
        p2 = Integer.parseInt(preço);
        
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        if (p2 >= 50) {
        	resultado = p2 - (0.10 * p2);
            //Print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: B");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        } else if (p2 <= 50) {
        	resultado = p2 - (0.12 * p2);
            //Print
            System.out.println("---------------------------------------------");
            System.out.println("Produto: " + nome);
            System.out.println("Categoria: B");
            System.out.println("Preço: " + preço);
            System.out.println("Valor do pagamento: " + nf.format(resultado));
        }
    }
}
