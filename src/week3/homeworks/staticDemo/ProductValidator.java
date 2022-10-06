public class ProductValidator {

    static {
        System.out.println("Static constructor çalıştı.");
    }

    static {
        System.out.println("Static constructor 2 çalıştı.");
    }

    public ProductValidator() {
        System.out.println("Constrcutor çalıştı.");
    }


    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void birSey() {

    }
}
