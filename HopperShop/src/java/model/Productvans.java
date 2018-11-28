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
@Table(name = "PRODUCTVANS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productvans.findAll", query = "SELECT p FROM Productvans p")
    , @NamedQuery(name = "Productvans.findByProductid", query = "SELECT p FROM Productvans p WHERE p.productid = :productid")
    , @NamedQuery(name = "Productvans.findByProductno", query = "SELECT p FROM Productvans p WHERE p.productno = :productno")
    , @NamedQuery(name = "Productvans.findByProductname", query = "SELECT p FROM Productvans p WHERE p.productname = :productname")
    , @NamedQuery(name = "Productvans.findByBrand", query = "SELECT p FROM Productvans p WHERE p.brand = :brand")
    , @NamedQuery(name = "Productvans.findByColor", query = "SELECT p FROM Productvans p WHERE p.color = :color")
    , @NamedQuery(name = "Productvans.findByPrice", query = "SELECT p FROM Productvans p WHERE p.price = :price")})
public class Productvans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTID")
    private Integer productid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRODUCTNO")
    private String productno;
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
    @Column(name = "PRICE")
    private Double price;

    public Productvans() {
    }

    public Productvans(Integer productid) {
        this.productid = productid;
    }

    public Productvans(Integer productid, String productno, String productname) {
        this.productid = productid;
        this.productno = productno;
        this.productname = productname;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        if (!(object instanceof Productvans)) {
            return false;
        }
        Productvans other = (Productvans) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Productvans[ productid=" + productid + " ]";
    }
    
}
