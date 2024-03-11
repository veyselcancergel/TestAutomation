package org.example.designPattern.Odev15;

public class Product {
    private String name;
    private String category;
    private double price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
    }
    public static class Builder {
        private String name;
        private String category;
        private double price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public void displayInfo() {
        System.out.println("Ürün Adı: " + name);
        System.out.println("Kategori: " + category);
        System.out.println("Fiyat: " + price);
    }
}


