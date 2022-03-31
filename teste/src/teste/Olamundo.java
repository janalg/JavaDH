package teste;

public class Olamundo {
	public static void main(String[] args) {
		System.out.println(" ================================ ");
	    System.out.println("Operadores Logicos");
	    //Operadores Logicos >>> nota >= 7 frequencia >=75
	    float nota = 8.5f;
	    float frequencia = 74.0f;

	    System.out.println( nota>=7 && frequencia >=75 ); //E
	    System.out.println( nota>=7 || frequencia >=75 ); //OU
	    System.out.println(! (nota>=7 && frequencia >=75) ); //Negacao
	    
	    double salario = 2758.33;
	    //imprimir acima da media caso o salario seja maior que 2500

	    //IF
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    
	    //IF-ELSE
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    else 
	      System.out.println("Abaixo da media");
	    
	    //IF-ELSE-IF
	    if (salario >= 2500)
	        System.out.println("Acima da media");
	    else if(salario < 1000)
	        System.out.println("Muito abaixo da media");
	    else 
	          System.out.println("Na media");    

	    //Forma TERNARIA    
	    String resposta = (salario >= 2500) ? "Acima da media":"Abaixo da media";
	    System.out.println(resposta);

}
	}
