package ProvaHeltonA1;

import javax.swing.JOptionPane;

public class ex02 {

	public static class Aluno {
		String nome;
		Double nota;
		String situacao;

		public Aluno() {
			this.nome = new String();
			this.situacao = new String();
		}

		public void setNome(String _nome) {
			this.nome = _nome;
		}

		public void setNota(Double _nota) {
			this.nota = _nota;
			if (this.nota >= 7) {
				situacao = "aprovado";
			} else if (this.nota < 2) {
				situacao = "reprovado";
			} else {
				situacao = "pfinal";
			}
		}
	}

	public static void main(String[] args) {

		// declarações
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
		Aluno[] alunos = new Aluno[quantidade];
		int aprovados = 0;
		int reprovados = 0;
		int avfinal = 0;

		// nome dos alunos
		for (int i = 0; i < quantidade; i++) {
			if (alunos[i] == null) {
				alunos[i] = new Aluno();
			}

			alunos[i].setNome(JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + " aluno"));
			alunos[i].setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + alunos[i].nome)));

			if (alunos[i].situacao == "aprovado") {
				aprovados++;
			} else if (alunos[i].situacao == "reprovado") {
				reprovados++;
			} else if (alunos[i].situacao == "pfinal") {
				avfinal++;
			}
		}
		System.out.println("----------------- RESULTADO -----------------");
		System.out.println("\n");
		System.out.println("Aprovados: " + aprovados);
		System.out.println("Avalicação Final: " + avfinal);
		System.out.println("Reprovados: " + reprovados);
		System.out.println("\n");
		System.out.println("---------------------------------------------");
	}
}
