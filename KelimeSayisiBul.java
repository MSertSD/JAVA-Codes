import java.util.Scanner;

public class KelimeSayisiBul {

	static void kacKelimeVar(String cumle) {

		int kelimeSayisi = 0;

		// c�mlede 1'den fazla bo�luk var ise bu bo�luklar� tek bo�lu�a indirir, art
		// arda 1'den fazla bo�luk olmaz
		String buCumle = cumle;

		for (;;) {

			buCumle = buCumle.replaceAll("  ", " ");

			if (buCumle.indexOf("  ") == -1) {
				break;
			}

		}

		

		if (buCumle.charAt(0) == ' ') {
			buCumle = buCumle.substring(1);
		}
		if (buCumle.charAt(buCumle.length() - 1) == ' ') {
			buCumle = buCumle.substring(0, buCumle.length() - 1);
		}
		// burada bo�luk ile ilgili i�lemler bitiyor
		
		// ---------------------

		// kelime say�s�n�n hesapland��� yer

		if (buCumle.indexOf(" ") == -1 && buCumle.length() > 0) {
			kelimeSayisi++;
		}

		while (buCumle.indexOf(" ") != -1) {

			kelimeSayisi++;
			buCumle = buCumle.substring(buCumle.indexOf(" ") + 1);
			if (buCumle.indexOf(" ") == -1 && buCumle.length() > 0) {
				kelimeSayisi++;
			}

		}

		System.out.println("Kelime Say�s�: " + kelimeSayisi);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir �eyler yaz�n�z:");
		String metin = input.nextLine();

		kacKelimeVar(metin);
		
		input.close();

	}

}
