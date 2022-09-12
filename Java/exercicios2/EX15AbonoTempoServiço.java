package exercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX15AbonoTempoServiço {
    public static void main(String[] args) throws Exception {

        //variável
        String tserviço;
        int escolha;

        //decoração + info do console
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n"); //pula 1 linha

        //escolhas
        System.out.println("1. Menos de 5 Anos");
        System.out.println("2. Entre 5 a 10 Anos");
        System.out.println("3. Mais de 10 Anos");
        System.out.println("0. Sair");
        System.out.println("\n"); //pula 1 linha

        //leitura
        System.out.println("- Digite a sua escolha: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tserviço = br.readLine();
        
        escolha = Integer.parseInt(tserviço); //string para inteiro

        // switch == respostas diferentes executam codigos diferentes
        switch (escolha) {
            case 1: //valor == 1
            	menos5();
                break;
            case 2: //valor == 2
            	mais5();
                break;
            case 3: //valor == 3
            	mais10();
                break;
            case 0: //valor == 0
                System.out.println("Até logo...");
                break;
            default:
                System.out.println("Valor Inválido");
        }
        System.out.println("---------------------------------------------");
    }

        //--> Menos de 5 Anos
    public static void menos5() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: "); //nome do funcionário
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: "); //apenas por informação
        tserviço = br.readLine();
        System.out.println("Digite seu salário: "); //salário bruto
        salário = br.readLine();
        
        //valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.05 * s2); //reajuste do salário

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
        
    //--> Mais de 5 Anos
    public static void mais5() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: ");
        tserviço = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();
        
        //valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.1 * s2); //reajuste do salário

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
        
    //--> Mais de 10 Anos
    public static void mais10() throws Exception {
        System.out.println("---------------------------------------------");

        //variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: ");
        tserviço = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();
        
        //valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.15 * s2); //reajuste do salário

        //print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
}
