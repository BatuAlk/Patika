public class Employee {

	String name;
	double maas;
	int workHours;
	int basYil;

	public Employee(String n, int m, int wH, int bY) {
		this.name = n;
		this.maas = m;
		this.workHours = wH;
		this.basYil = bY;
	}

	public double tax() {
		if (maas >= 1000) {
			return maas * 0.03;
		} else {
			return 0;
		}
	}

	public double bonus() {
		if (workHours > 40) {
			return 30 * (workHours - 40);
		} else {
			return 0;
		}
	}

	public double raiseSalary() {
		double increment = 0;
		if (workHours < 10) {
			increment = maas * 0.05;
		} else if (9 < workHours && workHours < 20) {
			increment = maas * 0.1;
		} else if (workHours > 19) {
			increment = maas * 0.15;
		}

		return increment;
	}

	@Override
	public String toString() {
		double vergi = tax();
		double bonus = bonus();
		double artis = raiseSalary();
		return "Adı: " + name + "\nMaaşı: " + maas + "\nÇalışma Saati: " + workHours + "\nBaşlama yılı: " + basYil
				+ "\nVergi: " + vergi + "\nBonus: " + bonus + "\nMaaş Artışı: " + artis + "\nVergi ve bonus ile maaş: "
				+ (maas - vergi + bonus) + "\nToplam Maaş: " + (maas - vergi + bonus + artis);

	}
}
