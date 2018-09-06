import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime fajla ");
		String ime = unos.next();

		FileReader file = new FileReader(ime);

		ArrayList<String> lista = new ArrayList<>();

		Scanner skaner = new Scanner(file);

		String predzadnja = "";

		while (skaner.hasNextLine()) {

			String line = skaner.nextLine();

			lista.add(line);

			for (int i = 0; i < lista.size(); i++) {

				String[] words = line.split("[ ]+");

				predzadnja = words[words.length - 2];

			}
			System.out.println("Predzadnja rijec je: " + predzadnja);

		}

		skaner.close();
		unos.close();

	}

}
