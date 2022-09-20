package week1.homeworks;

public class StringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Eleman sayısı: " + mesaj.length());
		 * System.out.println("5. Eleman: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!")); //System.out.println(mesaj);
		 * burada yaşasın gözükmez concat kullanım anında gösterir değişkeni etkilemez.
		 * System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true döndürür.
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * Bugün yazar ekrana. System.out.println(mesaj.indexOf('a'));//7
		 * System.out.println(mesaj.lastIndexOf('e'));//18
		 */
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));//gü yazar 2'den başla 4'e kadar.
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2 = "    Bugün hava çok güzel.   ";
		System.out.println(mesaj2.trim());//Baş ve sondaki boşlukları alır.
		
	}

}
