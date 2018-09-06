import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesi ime fajla:");
		String ime = unos.next();

		FileReader file = new FileReader(ime);

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			
			String line = input.nextLine();

			for (int i = 0; i < line.length(); i++) {

				char c = Character.toUpperCase(line.charAt(0));
				line = c + line.substring(1);

				if (line.charAt(i) == ' ') {

					c = Character.toUpperCase(line.charAt(i + 1));
					line = line.substring(0, i) + " " + c + line.substring(i + 2);
				}

			}

			System.out.println(line);
		}

		unos.close();
		input.close();
	}

}
