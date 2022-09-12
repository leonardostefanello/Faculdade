package exercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//SIM, usei switch em vez do metodo Constructor que iria simplificar o processo!

public class EX24CardapioRestaurante {
    public static void main(String[] args) throws Exception {

        //variável
        String str;
        int escolha;

        //decoração + info console
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n"); //pula 1 linha

        //escolhas
        System.out.println("1. CachorroQuente");
        System.out.println("2. BauruSimples");
        System.out.println("3. BauruComOvo");
        System.out.println("4. Hamburger");
        System.out.println("5. Cheeseburger");
        System.out.println("6. Refrigerante");
        System.out.println("0. Sair");
        System.out.println("\n"); //pula 1 linha

        //leitura
        System.out.println("- Digite a sua escolha: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        escolha = Integer.parseInt(str); //string para inteiro

        // switch == respostas diferentes executam codigos diferentes
        switch (escolha) {
            case 100: //valor == 100
                CachorroQuente();
                break;
            case 101: //valor == 101
            	BauruSimples();
                break;
            case 102: //valor == 102
                BauruComOvo();
                break;
            case 103: //valor == 103
                Hamburger();
                break;
            case 104: //valor == 104
                Cheeseburger();
                break;
            case 105: //valor == 105
                Refrigerante();
                break;
            case 0: //valor == 0
                System.out.println("Até logo...");
                break;
            default:
                System.out.println("Valor Inválido");
        }
        System.out.println("------------------- FINAL -------------------");
    }

    //--> CachorroQuente
    public static void CachorroQuente() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.20;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }

    //--> BauruSimples
    public static void BauruSimples() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.30;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }

    //--> BauruComOvo
    public static void BauruComOvo() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.50;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }

    //--> Hamburger
    public static void Hamburger() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.20;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }

    //--> Cheeseburger
    public static void Cheeseburger() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.30;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }

    //--> Refrigerante
    public static void Refrigerante() throws Exception {
        //variável
        String strNo1;
        double n1, resultado, preço;

        //leitura
        System.out.println("Digite a Quantidade: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strNo1 = br.readLine();

        //string para inteiro
        n1 = Double.parseDouble(strNo1);

        //calculo
        preço = 1.00;
        resultado = (n1 * preço);

        //print
        System.out.println("Você deverá pagar: " + resultado);
    }
}
