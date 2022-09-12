package exercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX14Calculadora {
    public static void main(String[] args) throws Exception {

        //variável
        String str;
        int escolha;

        //decoração + info console
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n"); //pula 1 linha

        //escolhas
        System.out.println("1. Adição");
        System.out.println("2. Multiplicação");
        System.out.println("3. Subtração");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.println("\n"); //pula 1 linha

        //leitura
        System.out.println("- Digite a sua escolha: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        escolha = Integer.parseInt(str); //string para inteiro

        // switch == respostas diferentes executam codigos diferentes
        switch (escolha) {
            case 1: //valor == 1
                doAddition();
                break;
            case 2: //valor == 2
            	doSubstraction();
                break;
            case 3: //valor == 3
                doMultiplication();
                break;
            case 4: //valor == 4
                doDivision();
                break;
            case 0: //valor == 0
                System.out.println("Até logo...");
                break;
            default:
                System.out.println("Valor Inválido");
        }
        System.out.println("------------------- FINAL -------------------");
    }

    //--> Adição
    public static void doAddition() throws Exception {
        System.out.println("// Modo de Adição //");

        //variável
        String strNo1, strNo2;
        int n1, n2, resultado;

        //leitura
        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();
        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        //string para inteiro
        n1 = Integer.parseInt(strNo1);
        n2 = Integer.parseInt(strNo2);

        //calculo
        resultado = n1 + n2;

        //print
        System.out.println("A Adição entre " + n1 + " e " + n2 + " é " + resultado);
    }

    //--> Subtração
    public static void doSubstraction() throws Exception {
        System.out.println("// Modo de Subtração //");

        //variável
        String strNo1, strNo2;
        int n1, n2, resultado;

        //leitura
        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();
        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        //string para inteiro
        n1 = Integer.parseInt(strNo1);
        n2 = Integer.parseInt(strNo2);

        //calculo
        resultado = n1 - n2;

        //print
        System.out.println("A Subtração entre " + n1 + " e " + n2 + " é " + resultado);
    }

    //--> Multiplicação
    public static void doMultiplication() throws Exception {
        System.out.println("// Modo de Multiplicação");

        //variável
        String strNo1, strNo2;
        int n1, n2, resultado;  

        //leitura
        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();
        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        //string para inteiro
        n1 = Integer.parseInt(strNo1);
        n2 = Integer.parseInt(strNo2);

        //calculo
        resultado = n1 * n2;

        //print
        System.out.println("A Multiplicação entre " + n1 + " e " + n2 + " é " + resultado);
    }

    //--> Divisão
    public static void doDivision() throws Exception {
        System.out.println("// Modo de Divisão //");

        //variável
        String strNo1, strNo2;
        int n1, n2;
        float resultado;

        //leitura
        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();
        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        //string para inteiro
        n1 = Integer.parseInt(strNo1);
        n2 = Integer.parseInt(strNo2);

        //calculo
        resultado = n1 / n2;

        //print
        System.out.println("A Divisão entre " + n1 + " e " + n2 + " é " + resultado);
    }
}
