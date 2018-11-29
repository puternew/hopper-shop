package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2561-11-30T04:44:21")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> accountpassword;
    public static volatile SingularAttribute<Account, String> accountname;
    public static volatile ListAttribute<Account, Address> addressList;
    public static volatile SingularAttribute<Account, Integer> accountno;
    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, String> telno;

}