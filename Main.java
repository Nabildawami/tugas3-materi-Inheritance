public class Main {
    public static void main(String[] args) {
        var produk1 = new Product("Kulkas",1500000, "Panasonic");
        var produk2 = new Electronics("Radio", 500000,"Sony", 2015);

        produk1.printDetails();
        System.out.println("====================================");
        produk2.printDetails();
    }
}
