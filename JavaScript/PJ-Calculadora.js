package projetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculadoraSimples {
    	public static void main(String[] args) throws Exception {
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");

            System.out.println("1. Adição");
            System.out.println("2. Multiplicação");
            System.out.println("3. Subtração");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.println("\n");

            System.out.println("- Digite a sua escolha: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            int usrChoice = Integer.parseInt(str);

            switch (usrChoice) {
                case 1:
                    doAddition();
                    break;
                case 2:
                    doMultiplication();
                    break;
                case 3:
                    doSubstraction();
                    break;
                case 4:
                    doDivision();
                    break;

                case 0:
                    System.out.println("Até logo...");
                    break;

                default:
                    System.out.println("Valor Inválido");
            }

            System.out.println("------------------- FINAL -------------------");
    }

    public static void doAddition() throws Exception {
        System.out.println("// Modo de Adição //");

        String strNo1, strNo2;

        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        int no1 = Integer.parseInt(strNo1);
        int no2 = Integer.parseInt(strNo2);

        int result = no1 + no2;

        System.out.println("A Adição entre " + no1 + " e " + no2 + " é " + result);
    }

    public static void doSubstraction() throws Exception {
        System.out.println("// Modo de Subtração //");

        String strNo1, strNo2;

        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        int no1 = Integer.parseInt(strNo1);
        int no2 = Integer.parseInt(strNo2);

        int result = no1 - no2;

        System.out.println("A Subtração entre " + no1 + " e " + no2 + " é " + result);
    }

    public static void doMultiplication() throws Exception {
        System.out.println("// Modo de Multiplicação");

        String strNo1, strNo2;

        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        int no1 = Integer.parseInt(strNo1);
        int no2 = Integer.parseInt(strNo2);

        int result = no1 * no2;

        System.out.println("A Multiplicação entre " + no1 + " e " + no2 + " é " + result);
    }

    public static void doDivision() throws Exception {
        System.out.println("// Modo de Divisão //");

        String strNo1, strNo2;

        System.out.println("Digite o Primeiro Valor: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        System.out.println("Digite o Segundo Valor: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        strNo2 = br1.readLine();

        int no1 = Integer.parseInt(strNo1);
        int no2 = Integer.parseInt(strNo2);

        float result = no1 / no2;

        System.out.println("A Divisão entre " + no1 + " e " + no2 + " é " + result);
    }

}
