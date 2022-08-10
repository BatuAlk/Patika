import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, tutar;
		double armut = 2.14, elma = 3.67, dom = 1.11, muz = 0.95, patlican = 5.00;

		System.out.println("Kaç kilo armut? : ");
		armutKilo = scan.nextDouble();

		System.out.println("Kaç kilo elma? : ");
		elmaKilo = scan.nextDouble();

		System.out.println("Kaç kilo domates? : ");
		domatesKilo = scan.nextDouble();

		System.out.println("Kaç kilo muz? : ");
		muzKilo = scan.nextDouble();

		System.out.println("Kaç kilo patlıcan? : ");
		patlicanKilo = scan.nextDouble();

		tutar = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * dom) + (muzKilo * muz)
				+ (patlicanKilo * patlican);
		System.out.println("Toplam tutar: " + tutar + " TL");

		scan.close();

	}
}
