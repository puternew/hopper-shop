/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PANUPONG INTHILAD
 */
@Entity
@Table(name = "ACCOUNT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
    , @NamedQuery(name = "Account.findByAccountno", query = "SELECT a FROM Account a WHERE a.accountno = :accountno")
    , @NamedQuery(name = "Account.findByEmail", query = "SELECT a FROM Account a WHERE a.email = :email")
    , @NamedQuery(name = "Account.findByAccountpassword", query = "SELECT a FROM Account a WHERE a.accountpassword = :accountpassword")
    , @NamedQuery(name = "Account.findByAccountname", query = "SELECT a FROM Account a WHERE a.accountname = :accountname")
    , @NamedQuery(name = "Account.findByTelno", query = "SELECT a FROM Account a WHERE a.telno = :telno")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ACCOUNTNO")
    private Integer accountno;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 50)
    @Column(name = "ACCOUNTPASSWORD")
    private String accountpassword;
    @Size(max = 50)
    @Column(name = "ACCOUNTNAME")
    private String accountname;
    @Size(max = 50)
    @Column(name = "TELNO")
    private String telno;
    @OneToMany(mappedBy = "accountno")
    private List<Address> addressList;

    public Account() {
    }

    public Account(Integer accountno) {
        this.accountno = accountno;
    }

    public Account(Integer accountno, String email) {
        this.accountno = accountno;
        this.email = email;
    }

    public Account(Integer accountno, String email, String accountpassword, String accountname, String telno, List<Address> addressList) {
        this.accountno = accountno;
        this.email = email;
        this.accountpassword = accountpassword;
        this.accountname = accountname;
        this.telno = telno;
        this.addressList = addressList;
    }

    public Account(String email, String password, String name, String telNo, String address, String province, String postalCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    



    public Integer getAccountno() {
        return accountno;
    }

    public void setAccountno(Integer accountno) {
        this.accountno = accountno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountpassword() {
        return accountpassword;
    }

    public void setAccountpassword(String accountpassword) {
        this.accountpassword = accountpassword;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @XmlTransient
    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountno != null ? accountno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountno == null && other.accountno != null) || (this.accountno != null && !this.accountno.equals(other.accountno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Account[ accountno=" + accountno + " ]";
    }
    
}
