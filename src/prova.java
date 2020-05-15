import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntd;
		double ticket;
		
		//CABEÇALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("---------------------------------");
		
		//VOLUME
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.printf("%nQuantas compras o cliente fez no último ano? ");
		qntd = sc.nextInt();
		System.out.printf("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		
		
		sc.close();
	}


}