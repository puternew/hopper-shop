/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

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

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        TotalPrice();
    }

    LineItem(Product p) {
         this.product = product;
         this.quantity++;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double TotalPrice() {
        this.totalPrice = this.product.getPrice()*this.quantity;
        return totalPrice;
    }
    
}
