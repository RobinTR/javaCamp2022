public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;
    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void save() {
        System.out.println("Müşteri kaydedildi: " + customer.getId());
    }

    public void delete() {
        System.out.println("Müşteri silindi: " + customer.getId());
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}
