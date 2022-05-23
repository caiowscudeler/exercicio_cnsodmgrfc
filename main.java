import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //inicializar Scanner 
		int i, genero, igr=0, idade=0; //Declarar variaveis 
		double outros=0; // Declarar variavel
		float altura, midh=0, maml=0, migp=0, contMidh=0, contMaml=0, contMigp=0, contOutros=0, contIdade=0; //Declarar variaveis
		for (i=0; i < 1000; i++) { // for para repeticao
		
		System.out.println("Digite 1 se for do genero feminino, 2 para masculino e 3 para outros: ");//Texto mostrado ao usuario
		genero = ler.nextInt(); // Associa a variavel ao Scanner e ao texto
		System.out.println("Qual e a sua idade? "); //Texto mostrado ao usuario
		idade = ler.nextInt(); // Associa a variavel ao Scanner e ao texto
		igr = igr + idade; // calculo da idade 
		System.out.println("Qual e a sua altura? ");//Texto mostrado ao usuario
		altura = ler.nextFloat();//Associa a variavel ao Scanner e ao texto 
		
		if ( genero==1) { //if para adicionar condicao 
			midh = midh + idade; // calcular idade
			contMidh++;// contador 
		}
		else if (genero==0) { // Else if para outra condicao
			maml = maml + altura;// calculo da altura 
			contMaml++;// contador 
		}
		else if (genero==2) { // Else if para outra condicao
			outros = outros +0;// calculo de pessoas de outros generos
			contOutros++;// contador 
		}

		}


migp = igr / contIdade;// contador da idade media do grupo
maml = maml / contMaml;// contador de altura das mulheres 
midh = midh / contMidh;// contador de idade dos homens
outros = contOutros + 0;// contador de pessoas de outros generos
System.out.printf("Media idade do grupo: %f\n", +migp); //Texto mostrado ao usuario
System.out.printf("Media altura das mulheres: %f\n", +maml);//Texto mostrado ao usuario
System.out.printf("Media idade dos homens: %f\n", +midh);//Texto mostrado ao usuario
System.out.printf("Pessoas identificadas como 'outros': %f\n", + outros);//Texto mostrado ao usuario

}
	
}
 
