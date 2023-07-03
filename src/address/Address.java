package address;

public class Address extends Employees{

    Employees name;

    int postalCode;

    String city;
    String street;

    int houseNumber;

    public Address(int postalCode, String city, String street, int houseNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }




    @Override
    public String toString() {
        return "Address{" +
                "postalCode=" + postalCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
