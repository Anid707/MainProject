package lesson11;

public class Address {
    private String street;
    private String city;
    private String zip;
    private State state;

    public Address(String street, String city, String zip, State state) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state=" + state +
                '}';
    }
}
