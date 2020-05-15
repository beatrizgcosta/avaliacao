import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntd, atraso, scorecompras;
		double ticket, compras;
		char pagamento;
		scorecompras = 0;
		
		//CABEÇALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("---------------------------------");
		
		//VOLUME
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.printf("%nQuantas compras o cliente fez no último ano? ");
		qntd = sc.nextInt();
		System.out.printf("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		
		//OUTROS DADOS
		System.out.printf("%nQuantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		pagamento = sc.next().charAt(0);
		
		//calculo score compras
		compras = qntd * ticket;
		if(compras == 0.00) {
			scorecompras = 0;
		}else {
			if(compras <= 3000.00 && qntd >= 2) {
				scorecompras = 40;
			}else {
				if(compras <= 3000.00) {
					scorecompras = 20;
				}
				else {
					if(compras > 3000.00) {
						scorecompras = 20;
					}
				}
			}
		}
		System.out.printf("%nScore de volume de compras = %d pontos%n", scorecompras);
		

		sc.close();
	}


}