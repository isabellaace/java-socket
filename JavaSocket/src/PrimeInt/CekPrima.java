package PrimeInt;

import java.util.*;

public class CekPrima {
	public static void main(String[] args) {
	       
	       System.out.println("Masukkan bilangan yang akan diuji: ");
	       Scanner scanner = new Scanner(System.in);
	       int uji = scanner.nextInt();
	       
	       // Instansiasi objek dari class PenentuPrima
	       // Dengan parameter bilangan Uji
	       PenentuPrima penentuprima = new PenentuPrima(uji);
	       
	       // Mengembalikan hasil apakah prima atau bukan
	       String hasil = penentuprima.getPrima();
	       System.out.println(hasil);        
	} 
}
