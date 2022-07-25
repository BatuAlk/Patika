import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mat, fizik, kimya, turkce, tarih, muzik;

		System.out.println("Matematik notu giriniz: ");
		mat = scan.nextInt();

		System.out.println("Fizik notu giriniz: ");
		fizik = scan.nextInt();

		System.out.println("Kimya notu giriniz: ");
		kimya = scan.nextInt();

		System.out.println("Türkçe notu giriniz: ");
		turkce = scan.nextInt();

		System.out.println("Tarih notu giriniz: ");
		tarih = scan.nextInt();

		System.out.println("Müzik notu giriniz: ");
		muzik = scan.nextInt();

		scan.close();

		int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		String sonuc = (ortalama >= 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
		System.out.println("Ortalama: " + ortalama + ".  " + sonuc);

	}
}