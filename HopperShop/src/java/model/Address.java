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
@Table(name = "ADDRESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
    , @NamedQuery(name = "Address.findByAddressno", query = "SELECT a FROM Address a WHERE a.addressno = :addressno")
    , @NamedQuery(name = "Address.findByAddresstext", query = "SELECT a FROM Address a WHERE a.addresstext = :addresstext")
    , @NamedQuery(name = "Address.findByPostcode", query = "SELECT a FROM Address a WHERE a.postcode = :postcode")
    , @NamedQuery(name = "Address.findByProvince", query = "SELECT a FROM Address a WHERE a.province = :province")
    , @NamedQuery(name = "Address.findByAccountno", query = "SELECT a FROM Address a WHERE a.accountno = :accountno")})
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ADDRESSNO")
    private String addressno;
    @Size(max = 255)
    @Column(name = "ADDRESSTEXT")
    private String addresstext;
    @Size(max = 255)
    @Column(name = "POSTCODE")
    private String postcode;
    @Size(max = 255)
    @Column(name = "PROVINCE")
    private String province;
    @Size(max = 255)
    @Column(name = "ACCOUNTNO")
    private String accountno;

    public Address() {
    }

    public Address(String addressno) {
        this.addressno = addressno;
    }

    public String getAddressno() {
        return addressno;
    }

    public void setAddressno(String addressno) {
        this.addressno = addressno;
    }

    public String getAddresstext() {
        return addresstext;
    }

    public void setAddresstext(String addresstext) {
        this.addresstext = addresstext;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressno != null ? addressno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressno == null && other.addressno != null) || (this.addressno != null && !this.addressno.equals(other.addressno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Address[ addressno=" + addressno + " ]";
    }
    
}
