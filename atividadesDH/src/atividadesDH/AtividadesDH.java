/**
 * 
 */
package atividadesDH;

/**
 * @author Janaina
 *
 */
public class AtividadesDH {
	public static void main(String[] args) {
		System.out.println("Exerc�cio 1: ");
		float valorDaConta = 40.60f;
		float valorDoGarcom = valorDaConta * 10/100;
		float resultado = valorDaConta + valorDoGarcom;
		
		System.out.printf("O valor total a pagar �: R$ " + "%.2f", + resultado);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 2: ");
		int num1 = 25;
		int num2 = 3;
		int resultado2 = num1 % num2;
		
		System.out.print(resultado2);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 3: ");
		float valorDaMercadoria = 50.50f;
		float desconto = valorDaMercadoria *15 / 100;
		float resultado3 = valorDaMercadoria - desconto;
		
		System.out.printf("O valor total com desconto �: R$ " + "%.2f", + resultado3);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 4: ");
		double valorDaMercadoria2 = 60.55;
		double valorPago = 100.0;
		double troco = valorPago - valorDaMercadoria2;
		
		System.out.printf("Troco: R$ " + "%.2f", + troco);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 5: ");
		int numero1 = 17;
		int numero2 = 10;
		int numero3 = 6;
		
		if(numero1 > numero2 && numero1  > numero3) {
			System.out.print(numero1);
		}else if (numero2 > numero1 && numero2 > numero3) {
			System.out.print(numero2);
		}else {
			System.out.print(numero3);
		}
		System.out.println("\n");
		
		System.out.println("Exerc�cio 6: ");
		String matricula = "68434746873";
		String nome = "Janaina";
		String sexo = "Feminino";
		String idade = "25";
		String  endereco = "Rua Roberto Simonsen";
		String estadoCivil = "Casado(a)";
		
		System.out.print("Informa��es do funcion�rio(a)"
				+ " Matr�cula: " + matricula + "\n Nome: " 
				+ nome + "\n Endere�o: " 
				+ endereco + "\n Idade: " 
				+ idade + "\n Sexo: "
				+ sexo + "\n Estado civil: " 
				+ estadoCivil);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 7: ");
		int number1 = 60;
		int number2 = 30;
		int soma = number1 + number2;
		
		System.out.print("O resultado da soma entre " + number1
				+ " e " + number2 + " � " + soma);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 8: ");
		String nomeDoAluno = "Jos�";
		float nota1 = 8.6f;
		float nota2 = 4.5f;
		float nota3  = 7.4f;
		float mediaDoAluno = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("A m�dia do aluno(a) " + nomeDoAluno 
				+ " � " + "%.1f", + mediaDoAluno);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 9: ");
		String nomeDoFuncionario = "Jo�o";
		String departamento = "Finan�as";
		float salario = 3400.60f;
		float abono = salario * 10 / 100;
		float novoSalario = salario + abono;
		
		System.out.print("O novo sal�rio do funcion�rio(a) " 
		+ nomeDoFuncionario + " lotado no departamento de " 
		+ departamento + " \n acrescido do abono de 10% � " 
		+  String.format("%.2f",novoSalario));
		System.out.println("\n");
		
		System.out.println("Exerc�cio 10: ");
		String codigo = "47236464";
		String descricao = "Luvas de borracha";
		int quantidade = 120;
		float precoDeCompra = 2.50f;
		float lucro = (precoDeCompra * 10)/100;
		float precoTotal = (precoDeCompra + lucro) * quantidade ;
		System.out.println("Produto: " + codigo +
		"\nDescri��o: " + descricao + "\nQuantidade: " + quantidade +
		"\nPre�o de compra: R$" + String.format("%.2f",precoDeCompra) + "\nLucro por produto: R$" 
		+ String.format("%.2f", lucro) + "\nPre�o Total: R$" +
		String.format("%.2f",precoTotal));
		
		System.out.println("\n");
		
		System.out.println("Exerc�cio 11: ");
		String nomeDoCidadao = "Francisco";
		int anoDeNasc = 1996;
		int diaNasc = 9;
		int mesNasc = 6;
		
		int diaAtual = 16;
		int mesAtual = 3;
		int anoAtual = 2022;
		
		 int idade2 = 0;

	        if ((mesAtual > mesNasc) || (mesAtual == mesNasc && diaAtual >= diaNasc)){
	            idade2 = anoAtual - anoDeNasc;
	        }else {
	            idade2 = anoAtual - anoDeNasc -1;
	        }

		
		System.out.print(nomeDoCidadao + " nasceu na data de "
		+ diaNasc + " do " + mesNasc + " de " + anoDeNasc + " e tem " 
		+ idade2 + " anos.");
		System.out.println("\n");
		
		System.out.println("Exerc�cio 12: ");
		int a = 1;
		int b = 2;
		int c = 3;
		int auxiliar = 0;
		auxiliar = a;
		a= c;
		c = b;
		b = auxiliar;		
		
		System.out.print(a+ " ");
		System.out.print(b + " ");
		System.out.print(c);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 13: ");
		int dependentes = 3;
		float salarioBase = 3400.50f;
		float desconto2 = salarioBase *10/100;
		float salarioBruto = salarioBase + dependentes * 100;
		float salarioLiquido = salarioBase - desconto2 
		+ dependentes * 100; 
		
		System.out.print("Sal�rio bruto: R$ " + String.format("%.2f", salarioBruto) 
		+ "\n Sal�rio l�quido: R$ " + String.format("%.2f", salarioLiquido));
		System.out.println("\n");
		
		System.out.println("Exerc�cio 14: ");
		float altura = 2.80f;
		float largura = 4.0f;
		float metro = altura  * largura ;
		int consumoDeTintaPorM = 3;
		int tintaPorLata = 2;
		float qtdNecessaria = metro * consumoDeTintaPorM;
		float numDeLatas = qtdNecessaria/tintaPorLata;
		
		System.out.print("Para pintar "+ metro + 
		" metros quadrados,\n � necess�rio " +
		qtdNecessaria + " litros de tinta, \n o equivalente a "
		+ numDeLatas + " latas de tinta." );
		System.out.println("\n");
		
		System.out.println("Exerc�cio 15: ");
		int a1 = 5;
		int b1 = 8;
		int c1 = 10;
		int x = 5;
		int expressao1 = x * a1;
		int expressao2 = a1 + (2 * b1) / (c1 - 6);
		
		System.out.print("O valor da express�o 1 �: "
		+ expressao1 + "\n O valor da express�o 2 �: "
		+ expressao2);
		System.out.println("\n");
		
		System.out.println("Exerc�cio 16: ");
		float pesoDaBagagem = 26.7f;
		if(pesoDaBagagem <= 20) {
		System.out.print("Peso da bagagem: " +
		pesoDaBagagem 
		+ "\n Valor a pagar por quilo em excesso:R$ 0,00 ");}
		else if(pesoDaBagagem <= 40) {System.out.print("Peso da bagagem: " +
				pesoDaBagagem 
				+ "\n Valor a pagar por quilo em excesso:R$ 5.000,00 ");}
		else {System.out.print("Peso da bagagem: " +
				pesoDaBagagem 
				+ "\n Valor a pagar por quilo em excesso:R$ 10.000,00 ");}
		System.out.println("\n");
		
		System.out.println("Exerc�cio 17: ");
		float altura3 = 1.60f;
		String sexo3 = "Feminino";
		double pesoIdealH = (72.7 * altura3)- 58;
		double pesoIdealM = (62.1 * altura3) - 44.7;
		
		if(sexo3 == "Feminino") {
			System.out.println("O peso ideal para voc� �: " + String.format("%.2f", pesoIdealM)+" Kg");
		}else {
			System.out.println("O peso ideal para voc� �: " + String.format("%.2f", pesoIdealH)+" Kg");
		}
		System.out.println("\n");
		
		System.out.println("Exerc�cio 18: ");
		int idadeNadador = 1;
		if(idadeNadador >=5 && idadeNadador <= 7) {
			System.out.print("Categoria: INFANTIL A.");
		}else if( idadeNadador <=4) {
			System.out.print("Categoria: Idade n�o permitida!");
		}else if(idadeNadador <= 10) {
			System.out.print("Categoria: INFANTIL B.");	
		}else if(idadeNadador <= 13) {
			System.out.print("Categoria: JUVENIL A.");
		}else if(idadeNadador <= 17) {
			System.out.print("Categoria: JUVENI B.");
		}else {
			System.out.print("Categoria: S�NIOR.");
		}
		System.out.println("\n");
		//While
        int contador = 1;

            while(contador < 10){
                System.out.println("Numero "+contador);
                //contador = contador + 2;
                contador += 2; // acumulador
                
                double pesoDaBagagem1 = 25.0;
                double valorExcesso = 0;

                if(pesoDaBagagem1 <= 20){
                    valorExcesso = 0;
                }else if (pesoDaBagagem1 > 40){
                   valorExcesso = (pesoDaBagagem1 - 20) * 10000;
                }else{
                   valorExcesso = (pesoDaBagagem1 - 20) * 5000;
                }


                System.out.println("Valor pagamento: " + valorExcesso);


            }

		
		}
		
		
	}
	

