import java.util.Locale;
import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qntd, atraso, scorecompras, scoreinadimplencia, scorepagamento, total;
		double ticket, compras;
		char pagamento;
		scorecompras = 0;
		scoreinadimplencia = 0;
		scorepagamento = 0;
		
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
			if(compras <= 3000.00 && qntd > 2) {
				scorecompras = 40;
			}else {
				if(compras <= 3000.00) {
					scorecompras = 20;
				}
				else {
					if(compras > 3000.00) {
						scorecompras = 60;
					}
				}
			}
		}
		System.out.printf("%nScore de volume de compras = %d pontos%n", scorecompras);

		//score inadimplencia
		
		if(atraso > 1 || qntd == 0) {
			scoreinadimplencia = 0;
		}else {
			if(qntd > 0 && atraso == 1) {
				scoreinadimplencia = 15;
			}else {
				if(qntd > 0 && atraso == 0) {
					scoreinadimplencia = 30;
				}
			}
		}
		System.out.printf("%nScore de inadimplência = %d pontos%n", scoreinadimplencia);
		
		//score de pagamento
		if (pagamento == 'd' || pagamento == 'D') {
			scorepagamento = 5;
		}else {
			scorepagamento = 10;
		}
		System.out.printf("Score de forma de pagamento = %d pontos%n", scorepagamento);
		
		//resultado final
		total = scorecompras + scoreinadimplencia + scorepagamento;
		if(total <= 25) {
			System.out.printf("%nClassificação final = CLIENTE BRONZE");
		}else {
			if(total > 25 && total <= 75) {
				System.out.printf("%nClassificação final = CLIENTE PRATA");
			}else {
				System.out.printf("%nClassificação final = CLIENTE OURO");
			}
		}
		sc.close();
	}


}