package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		Product product2 = new Product(2,"Laptop","Monster Laptop",15555, 11, "siyah");
		product.setId(1);
		product.setDescription("Laptop");
		product.setName("Asus Laptop");
		product.setPrice(14500);
		product.setStockAmount(5);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
