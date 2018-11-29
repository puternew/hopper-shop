package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Account;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2561-11-29T20:01:26")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> province;
    public static volatile SingularAttribute<Address, Integer> addressno;
    public static volatile SingularAttribute<Address, String> addresstext;
    public static volatile SingularAttribute<Address, Account> accountno;
    public static volatile SingularAttribute<Address, String> postcode;

}