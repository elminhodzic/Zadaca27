import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException, IllegalStateException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		File file = new File("zadatak1.txt");
		Scanner skaner = new Scanner(new File("zadatak1.txt"));

		System.out.println("broj karektera fajla je: " + file.length());

		System.out.println();
		int brojacRijeci = 0;
		while (skaner.hasNext()) {

			skaner.next();

			brojacRijeci++;
		}
		System.out.println("Broj rijeci u datom fajlu je: " + brojacRijeci);
		System.out.println();

		Scanner skaner2 = new Scanner(new File("zadatak1.txt"));
		int brojacLinija = 0;
		while (skaner2.hasNext()) {

			skaner2.nextLine();

			brojacLinija++;
		}
		System.out.println("Broj linija u datom fajlu je: " + brojacLinija);

		unos.close();
		skaner.close();
		skaner2.close();
	}

}
