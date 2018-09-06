import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {

		Scanner unos = new Scanner(System.in);

		System.out.println("unesi string:");
		// String string = unos.nextLine();

		//ArrayList<String> lista = new ArrayList<>();

		File file = new File("naopako.txt");

		PrintWriter ispis = new PrintWriter(file);
		String rijec = unos.nextLine();

		String naopako = "";

		for (int i = rijec.length() - 1; i >= 0; i--) {

			naopako = naopako + rijec.charAt(i);

		}

		ispis.print(naopako + " ");

		System.out.println("gotovo:");

		unos.close();
		ispis.close();

	}

}
