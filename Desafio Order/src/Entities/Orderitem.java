package Entities;

public class Orderitem {
    private Integer quantity;
    private Double price;

    private Product product;

    public Orderitem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, %d, preço: $ %.2f",
                product.getName(), quantity, price
        );
    }
}
