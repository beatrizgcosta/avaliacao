import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntd, atraso;
		double ticket;
		char pagamento;
		
		//CABE�ALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("---------------------------------");
		
		//VOLUME
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.printf("%nQuantas compras o cliente fez no �ltimo ano? ");
		qntd = sc.nextInt();
		System.out.printf("Qual o ticket m�dio? ");
		ticket = sc.nextDouble();
		
		//OUTROS DADOS
		System.out.printf("%nQuantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		pagamento = sc.next().charAt(0);
		
		

		sc.close();
	}


}