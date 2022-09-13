package exercicio2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class EX18ContaBancaria {

		//cria uma função conversão() que retorna um valor já formatado com a moeda BRL (R$)
		static String conversão(double valor) {
			//conversão para BRL
			Locale brazil = new Locale("pt", "BR");
			NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
			return nf.format(valor); //retorna o valor formatado
		}

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");

        //variável
		Scanner ler = new Scanner(System.in);
		String nc, toperacao;
		Double saldo, voperacao;

        //leitura
		System.out.println("Digite o número da conta: ");
		nc = ler.nextLine();
		System.out.println("Digite o saldo atual: ");
		saldo = ler.nextDouble();
		System.out.println("Digite o tipo de operação (D - depósito)|(R - retirada): ");
		toperacao = ler.next();
		System.out.println("Digite o valor da operação: ");
		voperacao = ler.nextDouble();
		

		System.out.println("---------------------------------------------");
		//-->> Comparação
		//depositar
		if (voperacao > 0 && toperacao.equalsIgnoreCase("D")) {
			saldo = saldo + voperacao;
			System.out.println("Número da Conta: " + nc);
			System.out.println("Operação: DEPOSITAR");
			System.out.println("Saldo atual: " + conversão(saldo));
		//retirar
		} else if (voperacao > 0 && toperacao.equalsIgnoreCase("R") && saldo >= voperacao) {
			saldo = saldo - voperacao;
			System.out.println("Número da Conta: " + nc);
			System.out.println("Operação: RETIRAR");
			System.out.println("Saldo atual: " + conversão(saldo));
		//estourado
		} else if (voperacao > 0 && toperacao.equalsIgnoreCase("R") && saldo < voperacao) {
			System.out.println("Conta Estourada");
		//valor negativo
		} else if (voperacao < 0 ) {
			System.out.println("Valor Negativo");
		}
		System.out.println("---------------------------------------------");
        //fechar scanner
        ler.close();
	}
}