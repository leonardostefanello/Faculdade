package exercicio1;

import java.util.Scanner;

public class EX14CalcSalarioLiquido3 {

	public static void main(String[] args) {

        //variáveis
        Scanner ler = new Scanner(System.in);
        String nome;
        double sb, pd, va, inss, vinss, irrf, virrf, vf, resultado;

        //inicialização de algumas variáveis
        inss = 0;
        vinss = 0;
        irrf = 0;
        virrf = 0;
        
        //informações (inputs)
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite o salário bruto:");
        sb = ler.nextInt();
        System.out.println("Digite o valor de acréscimo:");
        pd = ler.nextDouble();
        
        //valor Adicional
        va = sb+pd;
        
        //valores INSS
        if (va <= 1212) {
        	inss = 7.5;
        	vinss = va*(inss/100);
        } else if ((va <= 2427) & (va >= 1212)) {
        	inss = 9;
        	vinss = va*(inss/100);
        } else if ((va <= 3641) & (va >= 2427)) {
        	inss = 12;
        	vinss = va*(inss/100);
        } else if ((va <= 7087) & (va >= 3641)) {
        	inss = 14;
        	vinss = va*(inss/100);
        }
        
        //valores IRRF
        if (va <= 1903) {
        	irrf = 0;
        	virrf = va*(irrf/100);
        } else if ((va <= 2826) & (va >= 1903)) {
        	irrf = 7.5;
        	virrf = va*(irrf/100);
        } else if ((va <= 3751) & (va >= 2826)) {
        	irrf = 15;
        	virrf = va*(irrf/100);
        } else if ((va <= 4664) & (va >= 3751)) {
        	irrf = 22.5;
        	virrf = va*(irrf/100);
        } else if ((va >= 4665)) {
        	irrf = 27.5;
        	virrf = va*(irrf/100);
        }
		
        //calculos
        vf = vinss+virrf;
        resultado = (va-vf);
        		
        //print
        System.out.println("Nome: " + nome);
	System.out.println("Valor Adicional: " + pd);
        System.out.println("Salario Bruto: " + sb);
        System.out.println("Salario Liquido a receber: " + resultado);
	System.out.println("%INNS: " + inss);
        System.out.println("% IRRF: " + irrf);

        //fechar scanner
        ler.close();
	}

}
