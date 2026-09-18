package s1.builder;

public class Product {
    private final String name;
    private final Double price;
    private final String category;
    private final String brand;
    private final Double discount;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
        this.brand = builder.brand;
        this.discount = builder.discount;
    }
    public static class Builder {
        private final String name;
        private final Double price;
        private String category;
        private String brand;
        private Double discount;

        public Builder(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }


        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder discount(Double discount){
            if (discount < 0 || discount > 100){
                throw new IllegalArgumentException();
            }
            this.discount = discount;
            return this;
        }

        public Product build(){
            if (this.price < 0){
                throw new IllegalArgumentException();
            }
            return new Product(this);
        }
    }

    public static void main(String[] args) {
        Product product = new Builder("Laptop",50000D)
                .category("Electronics")
                .brand("Lenovo")
                .discount(10D)
                .build();
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.category);
        System.out.println(product.brand);
        System.out.println(product.discount);
    }

}
