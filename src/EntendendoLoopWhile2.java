import java.util.Scanner;

public class EntendendoLoopWhile2 {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		
		int idade;
		double media=0;
		int quantidadeAlunos = 0 ;
		int quantidadeAlunos2 = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos alunos a serem informados?");
		quantidadeAlunos2 = leitor.nextInt();
		
		while (quantidadeAlunos < quantidadeAlunos2) {
			System.out.println("Informe a idade do " + (quantidadeAlunos +1) +" º do aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos + 1;
			//quantidadeAlunos +=1;
			//quantidadeAlunos++;

		}

		media = media/(double) quantidadeAlunos2;
		
		System.out.println("A Média das idades é " + media);
		
		leitor.close();
			
		
	}

}
