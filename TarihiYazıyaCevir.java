import java.util.Scanner;

public class TarihiYaz�yaCevir {
	
	    //kullan�c�n�n girece�i tarihi okuyup yaz�yla geri d�nd�rek fonksiyon "tarihOku"
	static void tarihOku(String tarih) {
		//okunu�u yaz�lacak say�n�n birler basama��ndaki rakam�n okunu�unu tutaca��m�z dizi "birler"
		String[] birler = {"", "bir", "iki", "��", "d�rt", "be�", "alt�", "yedi", "sekiz", "dokuz"};
		
		//okunu�u yaz�lacak say�n�n onlar basama��ndaki rakam�n okunu�unu tutaca��m�z dizi "onlar"
		String[] onlar = {"", "on", "yirmi", "otuz", "k�rk", "elli", "altm��", "yetmi�", "seksen", "doksan"};
		
		//aylar�n okunu�lar�
		String[] aylar = {"", "Ocak", "�ubat", "Mart", "Nisan", "May�s", "Haziran", "Temmuz", "A�ustos", "Eyl�l", "Ekim", "Kas�m", "Aral�k"};
		
		
		/*
		 * kullan�c�n girdi�i tarih �zerinde de�i�iklik yapmamak i�in fonksiyon i�erisinde
		 * yeni bir String t�r�nde de�i�ken olu�turup tarih bilgisini "buTarih" de�i�kenine
		 * kopyalad�m. Bu sayede tarih �st�nde yapt���m de�i�iklikler as�l tarihi de�i�tirmeyecek
		 */
		String buTarih = tarih;
		
		String gun = buTarih.substring(0, buTarih.indexOf("."));
		int sayiGun = Integer.parseInt(gun);
		buTarih = buTarih.substring(buTarih.indexOf(".")+1);
		String ay = buTarih.substring(0, buTarih.indexOf("."));
		int sayiAy = Integer.parseInt(ay);
		buTarih = buTarih.substring(buTarih.indexOf(".")+1);
		int yil = Integer.parseInt(buTarih);
		
		if(sayiGun < 10)
			System.out.print(birler[sayiGun]);
		if(sayiGun > 9 && sayiGun < 32) {
			int sayiGunBirler = sayiGun % 10;
			sayiGun = (sayiGun - sayiGunBirler) / 10; 
			System.out.print(onlar[sayiGun] + " " + birler[sayiGunBirler]);
		}
		
		if(sayiAy > 0 && sayiAy < 13)
			System.out.print(" " + aylar[sayiAy]);
		
		if(yil > 999 && yil < 10000) {
			
			int yilBirler, yilOnlar, yilYuzler, yilBinler;
			yilBirler = yil % 10;
			yil = (yil - yilBirler) / 10;
			yilOnlar = yil % 10;
			yil = (yil - yilOnlar) / 10;
			yilYuzler = yil % 10;
			yil = (yil - yilYuzler) / 10;
			yilBinler = yil % 10;
			yil = (yil - yilBinler) / 10;
			
			if(yilBinler == 1)
				System.out.print(" bin");
			else
				System.out.print(" " + birler[yilBinler] + " bin");
			
			if(yilYuzler == 1)
				System.out.print(" y�z");
			else if(yilYuzler == 0)
				System.out.print("");
			else
				System.out.print(" " + birler[yilYuzler] + " y�z");
			
			System.out.print(" " + onlar[yilOnlar] + " " + birler[yilBirler]);
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.print("Bir tarih giriniz (�rne�in: 26.04.1995): ");
		Scanner input = new Scanner(System.in);
		String tarih = input.next();
		tarihOku(tarih);
		input.close();
		
	}
	
}
