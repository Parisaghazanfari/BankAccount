package Entity;

public class Customer {
    String name;
    String lastName;
    String nationalCode;
    String address;
    String phoneNo;
    String postCode;

    public Customer() {
    }


    public Customer(String name, String lastName, String nationalCode, String address, String phoneNo, String postCode) {
        this.name = name;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.address = address;
        this.phoneNo = phoneNo;
        this.postCode = postCode;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}

