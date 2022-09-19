package exercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
-> I used BufferedReader and InputsStreamReader cause i was trying new ways but you can use the Scanner import! :)
*/

public class EX13AumentoPorClasse {
    public static void main(String[] args) throws Exception {

        //variável
        String str, escolha;

        //decoração + info do console
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n"); //pula 1 linha

        //escolhas
        System.out.println("A. Categoria A");
        System.out.println("B. Categoria B");
        System.out.println("C. Categoria C");
        System.out.println("D. Categoria D");
        System.out.println("E. Outras Categorias");     
        System.out.println("S. Sair");
        System.out.println("\n"); //pula 1 linha
        
        //leitura
        System.out.println("- Digite a sua escolha: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        escolha = str.toUpperCase(); //resposta para maiusculo

        // switch == respostas diferentes executam codigos diferentes
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

        //variáveis
        String salário, nome;
        double s2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //calculos
        s2 = Integer.parseInt(salário); //string para inteiro
        resultado = s2 + (0.1 * s2); //reajuste do salário

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: A");
        System.out.println("Salário reajustado: " + resultado);
    }

    //-->Categoria B
    public static void categoriaB() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome;
        double s2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //calculos
        s2 = Integer.parseInt(salário); //string para inteiro
        resultado = s2 + (0.15 * s2);

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: B");
        System.out.println("Salário reajustado: " + resultado);
    }

    //-->Categoria C
    public static void categoriaC() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome;
        double s2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //calculos
        s2 = Integer.parseInt(salário); //string para inteiro
        resultado = s2 + (0.25 * s2);

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: C");
        System.out.println("Salário reajustado: " + resultado);
    }

    //-->Categoria D
    public static void categoriaD() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome;
        double s2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //calculos
        s2 = Integer.parseInt(salário); //string para inteiro
        resultado = s2 + (0.35 * s2);

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: D");
        System.out.println("Salário reajustado: " + resultado);
    }
        
    //-->Categoria Outros
    public static void categoriaE() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome;
        double s2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();

        //calculos
        s2 = Integer.parseInt(salário); //string para inteiro
        resultado = s2 + (0.5 * s2);

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Categoria: OUTROS");
        System.out.println("Salário reajustado: " + resultado);
    }
}
