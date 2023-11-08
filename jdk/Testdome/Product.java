package jdk.Testdome;

public class Product {

    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        if(quantity < 1)
            this.quantity = 1;
        else
            this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name) {
        this.name = name;
        this.quantity = 1;
    }
}