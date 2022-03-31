package exercicios;

public class ExerciciosJava {
	public static void main(String[] args) {
	//unidimensional = vetor	
		int [] idades = {1,2,3,4,5,6,7};//já está inicializado
		int [] idades2 = new int[8]; // não possui dados escritos pelo usuário
		
		String [] nomes = {"Janaina", "Neidinha", "billy"};
		System.out.println(idades[5]);
		
		for (int i = 0;i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		//multidimensionais => matriz
				int[][] numeros = new int[3][3];
				int valor = 1;

				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
						numeros[linha][coluna] = valor++;
					}
				}
				
				
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
					System.out.print(numeros[linha][coluna] + "\t");
					}
					System.out.println();
				}

		}
	}

