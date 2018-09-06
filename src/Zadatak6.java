import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		String ime = unos.next();

		String najduza = "";
		String current;

		FileReader file = new FileReader(ime);

		ArrayList<String> lista = new ArrayList<>();
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			current = input.next();
			lista.add(current);

			for (int i = 0; i < lista.size(); i++) {

				if (current.length() > najduza.length()) {
					najduza = current;
				}

			}

		}
		System.out.println(najduza);
		input.close();
		unos.close();

	}

}
