import java.util.Objects;

public class Adress {
    private String street = null;
    private String city = null;
    private int zip;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return zip == adress.zip && Objects.equals(street, adress.street) && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zip);
    }
}