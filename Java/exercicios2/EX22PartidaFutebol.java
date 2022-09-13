package exercicio2;

import java.util.Scanner;

//--> não tenho certeza se ta certo!

public class EX22PartidaFutebol {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        //variável
        Scanner ler = new Scanner(System.in);
        String time1, time2;
        int gol1, gol2, penalti1, penalti2;

        //leitura
        System.out.println("Digite o nome do primeiro time: ");
        time1 = ler.next();
        System.out.println("Digite a quantidade de gols do primeiro time: ");
        gol1 = ler.nextInt();
        System.out.println("Digite o nome do segundo time: ");
        time2 = ler.next();
        System.out.println("Digite a quantidade de gols do primeiro time: ");
        gol2 = ler.nextInt();

        //comparação
        System.out.println("---------------------------------------------");
        if (gol1 > gol2 + 1) {
            System.out.println(time1 + " ganhou de goleada!");
        } else if (gol2 > gol1 + 1) {
            System.out.println(time1 + " ganhou de goleada!");
        } else if (gol1 > gol2) {
            System.out.println(time1 + " ganhou!");
        } else if (gol2 > gol1) {
            System.out.println(time2 + " ganhou!");
        } else if (gol1 == gol2) {
            System.out.println("EMPATOU!");
            System.out.println("Digite o resultado da cobrança de pênalti do primeiro time: ");
            penalti1 = ler.nextInt();
            System.out.println("Digite o resultado da cobrança de pênalti do primeiro time: ");
            penalti2 = ler.nextInt();

            if (penalti1 > penalti2) {
                System.out.println(time1 + " ganhou!");
            } else {
                System.out.println(time2 + " ganhou!");
            }
        }
        System.out.println("---------------------------------------------");

        //fechar scanner
        ler.close();
    }
}
