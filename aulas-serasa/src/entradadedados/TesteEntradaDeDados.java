package entradadedados;

import java.util.Scanner;

public class TesteEntradaDeDados {
	public static void main(String[] args) {
		Scanner entradadedados = new Scanner(System.in);
				
		System.out.println("Informe um nome completo: ");
		String nome = entradadedados.nextLine();
		
		System.out.println("Nome  informado é: "+ nome);
		
		System.out.println("Informe sua idade: ");
		int idade = entradadedados.nextInt();
		
		System.out.println("A idade informada é: "+  idade);
	}
}
