import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite ime fajla ");
		String imeFajla = unos.next();

		FileReader fajl = new FileReader(imeFajla); 
		BufferedReader br = new BufferedReader(fajl);
		String naopako;

		ArrayList<String> rijeci = new ArrayList<>();
		do {
			naopako = br.readLine();
			rijeci.add(naopako);
		} while (naopako != null);

		for (int i = rijeci.size() - 1; i >= 0; i--) {
			System.out.println(rijeci.get(i));
		}
		unos.close();
		br.close();

	}

}
