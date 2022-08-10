import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 kullanıcı girişi
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String kayitliKullaniciAdi = "Patika", kayitliParola = "Java101", kullaniciAdi, parola;

		System.out.println("Kullanıcı adınızı giriniz: ");
		kullaniciAdi = scan.nextLine();

		System.out.println("Parolanızı giriniz: ");
		parola = scan.nextLine();

		if (kayitliKullaniciAdi.equals(kullaniciAdi) && kayitliParola.equals(parola))
			System.out.println("Giriş yaptınız.");

		else if (!kayitliKullaniciAdi.equals(kullaniciAdi))
			System.out.println("Kullanıcı adı yanlış!");

		else if (!kayitliParola.equals(parola)) {
			System.out.println("Parola yanlış. Şifrenizi değiştirmek ister misiniz? (evet veya hayır yazınız)");
			String onay = scan.nextLine();
			if (onay.equalsIgnoreCase("evet")) {
				System.out.println("Yeni şifrenizi giriniz: ");
				String yeniParola = scan.nextLine();

				if (kayitliParola.equals(yeniParola)) {
					System.out.println("Eski şifreniz ile yeni şifreniz aynı olamaz!");
				} else if (onay.equalsIgnoreCase("hayır")) {
					System.out.println("Parola başarıyla değiştirildi.");
					kayitliParola = yeniParola;
				}

			} else {
				System.out.println("Sistem kapatıldı.");
			}
		}
		scan.close();

	}
}
