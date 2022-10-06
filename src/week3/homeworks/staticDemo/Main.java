public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.id = 1;
        product.name = "Mouse";
        product.price = 10;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        //Inner class + static ile gruplama olarak kullanılabilir ama
        //tavsiye edilmez solid uygun değildir.
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
    //Classlar statik olamaz ama Inner Class static olabilir.
    public static class InnerClass {
        public static void sil() {

        }
    }
}