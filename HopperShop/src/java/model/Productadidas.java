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
 * @author INT303
 */
@Entity
@Table(name = "PRODUCTADIDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productadidas.findAll", query = "SELECT p FROM Productadidas p")
    , @NamedQuery(name = "Productadidas.findByProductno", query = "SELECT p FROM Productadidas p WHERE p.productno = :productno")
    , @NamedQuery(name = "Productadidas.findByPicno", query = "SELECT p FROM Productadidas p WHERE p.picno = :picno")
    , @NamedQuery(name = "Productadidas.findByProductname", query = "SELECT p FROM Productadidas p WHERE p.productname = :productname")
    , @NamedQuery(name = "Productadidas.findByBrand", query = "SELECT p FROM Productadidas p WHERE p.brand = :brand")
    , @NamedQuery(name = "Productadidas.findByColor", query = "SELECT p FROM Productadidas p WHERE p.color = :color")
    , @NamedQuery(name = "Productadidas.findBySizeno", query = "SELECT p FROM Productadidas p WHERE p.sizeno = :sizeno")
    , @NamedQuery(name = "Productadidas.findByPrice", query = "SELECT p FROM Productadidas p WHERE p.price = :price")
    , @NamedQuery(name = "Productadidas.findByQuantity", query = "SELECT p FROM Productadidas p WHERE p.quantity = :quantity")})
public class Productadidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRODUCTNO")
    private String productno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PICNO")
    private String picno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Size(max = 50)
    @Column(name = "BRAND")
    private String brand;
    @Size(max = 50)
    @Column(name = "COLOR")
    private String color;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SIZENO")
    private Double sizeno;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "QUANTITY")
    private Integer quantity;

    public Productadidas() {
    }

    public Productadidas(String productno) {
        this.productno = productno;
    }

    public Productadidas(String productno, String picno, String productname) {
        this.productno = productno;
        this.picno = picno;
        this.productname = productname;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getPicno() {
        return picno;
    }

    public void setPicno(String picno) {
        this.picno = picno;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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

    public Double getSizeno() {
        return sizeno;
    }

    public void setSizeno(Double sizeno) {
        this.sizeno = sizeno;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        if (!(object instanceof Productadidas)) {
            return false;
        }
        Productadidas other = (Productadidas) object;
        if ((this.productno == null && other.productno != null) || (this.productno != null && !this.productno.equals(other.productno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Productadidas[ productno=" + productno + " ]";
    }
    
}
