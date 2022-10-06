package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao  implements ProductDao {
	public void add(Product product) {
		//Sadece db erişim kodları buraya yazılır. (SQL)
		System.out.println(product.getName() + " Hibernate ile veri tabanına eklendi.");
	}
}
