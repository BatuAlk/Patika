import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String isim, parola;

		int hak = 3, para = 1500, select;

		while (hak > 0) {
			System.out.println("Kullanıcı adınız: ");
			isim = sc.nextLine();

			System.out.println("Parolanız: ");
			parola = sc.nextLine();

			if (isim.equals("Patika") && parola.equals("java101")) {
				main: do {
					System.out.println("Bankaya hoşgeldiniz. Yapmak istediğiniz işlemi seçiniz:" + "\n1 - Para yatırma"
							+ "\n2 - Para çekme" + "\n3 - Bakiye sorgusu" + "\n4 - Çıkış");
					select = sc.nextInt();

					switch (select) {
					case 1:

						System.out.println("Eklenecek para miktarı: ");
						int ek = sc.nextInt();
						if (ek > 0) {
							para += ek;
						}
						System.out.println("Yeni bakiye: " + para);
						break;

					case 2:
						System.out.println("Çekilecek para miktarı: ");
						int cek = sc.nextInt();
						if (cek > 0) {
							int yeni_para = para -= cek;
							if (yeni_para < 0) {
								System.out.println("Yetersiz bakiye.");
								para = yeni_para += cek;
							} else {
								para = yeni_para;
								System.out.println("Yeni bakiye: " + para);
							}
						} else {
							System.out.println("Yeni bakiye: " + para);
						}
						break;
					case 3:
						System.out.println("Bakiye:" + para);
						break;
					case 4:
						System.out.println("Çıkış yapılıyor.");
						break main;

					}

				} while (select == 1 || select == 2 || select == 3 || select == 4);
				if (select != 1 && select != 2 && select != 3 && select != 4) {
					System.out.println("Yanlış işlem yapıldı! Sistem kapatılıyor.");
					break;
				}
			} else {
				hak--;
				System.out.println("Kullanıcı adı ve/veya parola yanlış! Kalan giriş hakkı: " + hak);
			}
		}
		if (hak == 0) {
			System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
		}

		sc.close();
	}
}
