package week1.homeworks;

public class SesliHarfler {

	public static void main(String[] args) {
		
		char harf='1';
		
		switch(harf) {
			case 'A':
			case 'a':
			case 'I':
			case 'ı':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println("Kalın sesli harf.");
				break;
			case 'E':
			case 'e':
			case 'İ':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println("İnce sesli harf.");
				break;
			default:
				System.out.println("Geçersiz harf.");
		}

	}

}
