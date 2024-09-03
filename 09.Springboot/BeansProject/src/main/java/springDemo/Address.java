package springDemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// @ToString

public class Address {

    private String city;

    private String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Address(){

    }

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }
}