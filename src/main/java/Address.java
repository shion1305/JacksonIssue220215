public class Address {
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public Address(String street, String streetNo) {
        this.street = street;
        this.streetNo = streetNo;
    }

    private String street;
    private String streetNo;

    // Constructors, Getters and Setters, toString()

}