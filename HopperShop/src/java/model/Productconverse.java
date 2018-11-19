/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PANUPONG INTHILAD
 */
@Entity
@Table(name = "PRODUCTCONVERSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productconverse.findAll", query = "SELECT p FROM Productconverse p")
    , @NamedQuery(name = "Productconverse.findByProductno", query = "SELECT p FROM Productconverse p WHERE p.productno = :productno")
    , @NamedQuery(name = "Productconverse.findByBrand", query = "SELECT p FROM Productconverse p WHERE p.brand = :brand")
    , @NamedQuery(name = "Productconverse.findByColor", query = "SELECT p FROM Productconverse p WHERE p.color = :color")
    , @NamedQuery(name = "Productconverse.findByPrice", query = "SELECT p FROM Productconverse p WHERE p.price = :price")
    , @NamedQuery(name = "Productconverse.findByProductname", query = "SELECT p FROM Productconverse p WHERE p.productname = :productname")
    , @NamedQuery(name = "Productconverse.findByQuantity", query = "SELECT p FROM Productconverse p WHERE p.quantity = :quantity")
    , @NamedQuery(name = "Productconverse.findBySizeno", query = "SELECT p FROM Productconverse p WHERE p.sizeno = :sizeno")})
public class Productconverse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PRODUCTNO")
    private String productno;
    @Size(max = 255)
    @Column(name = "BRAND")
    private String brand;
    @Size(max = 255)
    @Column(name = "COLOR")
    private String color;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Size(max = 255)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "SIZENO")
    private Double sizeno;

    public Productconverse() {
    }

    public Productconverse(String productno) {
        this.productno = productno;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSizeno() {
        return sizeno;
    }

    public void setSizeno(Double sizeno) {
        this.sizeno = sizeno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productno != null ? productno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productconverse)) {
            return false;
        }
        Productconverse other = (Productconverse) object;
        if ((this.productno == null && other.productno != null) || (this.productno != null && !this.productno.equals(other.productno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Productconverse[ productno=" + productno + " ]";
    }
    
}
