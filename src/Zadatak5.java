import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime ");
		String ime = unos.nextLine();

		FileReader file = new FileReader(ime);

		Scanner input = new Scanner(file);

		while (input.hasNext()) {

			String linija = input.nextLine();
			String produzetak = "";
			if (linija.length() < 55) {

				System.out.println(linija);

			}

			else {

				for (int i = 0; i < 40; i++) {

					produzetak += linija.charAt(i);
				}

				System.out.println(produzetak + "...Read More");

			}

		}
		input.close();
		unos.close();

	}

}
