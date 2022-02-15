import java.util.List;

public class Employee {

    private String name;
    private POSITION position;
    private List<String> skilltree;
    private Address address;

    public Employee(String name, POSITION position, List<String> skilltree, Address address) {
        this.name = name;
        this.position = position;
        this.skilltree = skilltree;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public POSITION getPosition() {
        return position;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }

    public List<String> getSkilltree() {
        return skilltree;
    }

    public void setSkilltree(List<String> skilltree) {
        this.skilltree = skilltree;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    // Constructors, Getters, Setters, toString()
}