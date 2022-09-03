package exercicio2;

//Substitui o Scanner :)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AumentoPorClasse {
    	public static void main(String[] args) throws Exception {
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");

            System.out.println("A. Categoria A");
            System.out.println("B. Categoria B");
            System.out.println("C. Categoria C");
            System.out.println("D. Categoria D");
            System.out.println("E. Outras Categorias");     
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
                case "C":
                	categoriaC();
                    break;
                case "D":
                	categoriaD();
                    break;
                case "E":
                	categoriaE();
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
        String salário, nome;
        double s2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //Valores
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.1 * s2); //reajuste do salário

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: A");
        System.out.println("Salário reajustado: " + resultado);
    }

    //Categoria B
    public static void categoriaB() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome;
        double s2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //Valores
        s2 = Integer.parseInt(salário);
        resultado = s2 + (0.15 * s2);

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: B");
        System.out.println("Salário reajustado: " + resultado);
    }

    //Categoria C
    public static void categoriaC() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome;
        double s2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //Valores
        s2 = Integer.parseInt(salário);
        resultado = s2 + (0.25 * s2);

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: C");
        System.out.println("Salário reajustado: " + resultado);
    }

    //Categoria D
    public static void categoriaD() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome;
        double s2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //Valores
        s2 = Integer.parseInt(salário);
        resultado = s2 + (0.35 * s2);

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: D");
        System.out.println("Salário reajustado: " + resultado);
    }
    
    //Categoria Outros
    public static void categoriaE() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome;
        double s2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //Valores
        s2 = Integer.parseInt(salário);
        resultado = s2 + (0.5 * s2);

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: OUTROS");
        System.out.println("Salário reajustado: " + resultado);
    }
    

}
