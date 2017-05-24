package model;

/**
 * Created by trixi on 2017.05.23..
 */
public class CustomersAndSuppliers {

    private String city;
    private String companyName;
    private String contactName;
    private String relationship;

    public CustomersAndSuppliers(String city,
                                 String companyName,
                                 String contactName,
                                 String relationship) {
        this.city = city;
        this.companyName = companyName;
        this.contactName = contactName;
        this.relationship = relationship;
    }

    public String getCity() {
        return city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getRelationship() {
        return relationship;
    }
}
