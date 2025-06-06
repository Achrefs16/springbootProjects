package com.example.orderservice.model;

public class Order {
    private Long id;
    private Long productId;
    private int quantity;
    private double totalPrice;
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order(Long id, Product product, double totalPrice, int quantity, Long productId) {
        this.id = id;
        this.product = product;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.productId = productId;
    }
}
