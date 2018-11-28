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
 * @author Student
 */
@Entity
@Table(name = "PRODUCTADIDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productadidas.findAll", query = "SELECT p FROM Productadidas p")
    , @NamedQuery(name = "Productadidas.findByProductid", query = "SELECT p FROM Productadidas p WHERE p.productid = :productid")
    , @NamedQuery(name = "Productadidas.findByBrand", query = "SELECT p FROM Productadidas p WHERE p.brand = :brand")
    , @NamedQuery(name = "Productadidas.findByColor", query = "SELECT p FROM Productadidas p WHERE p.color = :color")
    , @NamedQuery(name = "Productadidas.findByPrice", query = "SELECT p FROM Productadidas p WHERE p.price = :price")
    , @NamedQuery(name = "Productadidas.findByProductname", query = "SELECT p FROM Productadidas p WHERE p.productname = :productname")
    , @NamedQuery(name = "Productadidas.findByProductno", query = "SELECT p FROM Productadidas p WHERE p.productno = :productno")})
public class Productadidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTID")
    private Integer productid;
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
    @Size(max = 255)
    @Column(name = "PRODUCTNO")
    private String productno;

    public Productadidas() {
    }

    public Productadidas(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productadidas)) {
            return false;
        }
        Productadidas other = (Productadidas) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Productadidas[ productid=" + productid + " ]";
    }
    
}
