/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PANUPONG INTHILAD
 */
public class Cart{
    private Map<String, LineItem> cart;

    public Cart() {
        cart = new HashMap();
    }

    public void add(Product p) {
        LineItem line = cart.get(p.getProductno());
        if (line == null) {
            cart.put(p.getProductno(), new LineItem(p));
        } else {
            line.setQuantity(line.getQuantity()+1);
        }
    }

    public void reduce(Product p) {
        LineItem line = cart.get(p.getProductno());
        line.setQuantity(line.getQuantity() - 1);
        if (line.getQuantity() == 0) {
            remove(p);
        }
    }

    public void remove(Product p) {
        cart.remove(p.getProductno());
    }

    public int getTotalQuantity() {
        int all = 0;
        Collection<LineItem> lineItem = this.cart.values();
        for (LineItem lineitem : lineItem) {
            all += lineitem.getQuantity();
        }
        return all;
    }
    
    public double getTotalPayment() {
        double all = 0;
        Collection<LineItem> lineItem = this.cart.values();
        for (LineItem lineitem : lineItem) {
            all += lineitem.getTotalPrice();
        }
        return all;
    }
    
    

    public Map<String, LineItem> getCart() {
        return cart;
    }

    public void setCart(Map<String, LineItem> cart) {
        this.cart = cart;
    }

    public List<LineItem> getLineItem() {
        return new ArrayList(cart.values());
    }
}
