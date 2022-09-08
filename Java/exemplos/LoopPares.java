package exercicioonline1; //mudar para o nome do package

public class ContagemPar { //mudar para o nome da classe

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 100; i++) { //loop

			Thread.sleep(10); //espera 10 milissengundos
	        if (i % 2 == 0) { //se i divididor por 2 não sobrar resto da divisão então é par caso contrario é impar
	        	System.out.println("O número " + i + " é par!"); //print
	        }
        	
	        /* => Print se é Par ou Impar
	        if (i % 2 == 0) {
	        	System.out.println("O número " + i + " é par!");
	        } else {
	        	System.out.println("O número " + i + " é impar!");
	        } 
	        */
		}
	}
}
