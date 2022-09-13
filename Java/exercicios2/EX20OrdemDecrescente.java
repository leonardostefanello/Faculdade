package exercicio2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX20OrdemDecrescente {

    public static void main(String[] args) {
        //scanner
        Scanner ler = new Scanner(System.in);

        //arraylist
        List<Double> numlist = new ArrayList<>();

        //loop para gerar as perguntas e ao mesmo tempo adicionar a resposta dentro da arraylist
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            Double num = ler.nextDouble();

            //adiciona o valor na arraylist
            numlist.add(num);
        }

        //Collections.Sort --> organiza o array em ordem crescente
        //Collections.reverseOrder() --> organiza em ordem decrescente
        Collections.sort(numlist, Collections.reverseOrder());

        //print
        System.out.println("Valores em ordem Decrescente: " + numlist);

        //fechar scanner
        ler.close();
    }
}