package exercicio1;

import java.util.Scanner;

public class CalcSalarioLiquido2 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        double inss = 0;
        double vinss = 0;
        double irrf = 0;
        double virrf = 0;
        
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite o salário bruto:");
        double sb = ler.nextInt();
        
        System.out.println("Digite o valor de acréscimo:");
        double pd = ler.nextDouble();
        
        //Valor Adicional
        double va = sb+pd;
        
        //Valores INSS
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
        
        //Valores IRRF
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
		
        //Resultado
        double vf = vinss+virrf;
        double resultado = (va-vf);
        		
        System.out.println("Nome: " + nome);
	System.out.println("Valor Adicional: " + pd);
        System.out.println("Salario Liquido a receber: " + resultado);
	System.out.println("%INNS: " + inss);
        System.out.println("% IRRF: " + irrf);
	}

}
