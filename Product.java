class Product {
    String name;
    int price;
    String brand;

    Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    void printDetails(){
        System.out.println("Nama Produk \t: "+ name);
        System.out.println("Harga Produk \t: "+ price);
        System.out.println("Perusahaan \t: "+ brand);
    }
}

class Electronics extends Product{
    int tahunProduksi;

    Electronics(String name, int price, String brand, int tahunProduksi){
        super(name, price, brand);
        this.tahunProduksi = tahunProduksi;
    }

    void printDetails(){
        super.printDetails();
        System.out.println("Tahun Produksi \t: "+ tahunProduksi);
    }
}