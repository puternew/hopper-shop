/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PANUPONG INTHILAD
 */
public class LineItem {
    private Product product;
    private int quantity;
    private double totalPrice;

    public LineItem() {
    }

    public LineItem(Product product) {
        this.product = product;
        this.quantity++;
    }

    public double TotalPrice() {
        this.totalPrice = product.getPrice() * this.quantity;
        return this.totalPrice;
    }
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    
    public LineItem(Product product, int quantity, double totalPrice) {
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        this.totalPrice = product.getPrice() * this.quantity;
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice=1;
    }
    
    
}
