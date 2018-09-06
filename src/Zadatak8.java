import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi ime fajla:");
		String ime = unos.next();

		FileReader fajl = new FileReader(ime);
		Scanner skaner = new Scanner(fajl);
		//String a = "";
		while (skaner.hasNext()) {

			String tekst = skaner.nextLine();

			for (int i = 0; i < tekst.length(); i++) {

				tekst = tekst.trim();
				tekst = tekst.replaceAll("\\s+","");

			}

			System.out.println(tekst);

		}

		unos.close();
		skaner.close();
	}

}
