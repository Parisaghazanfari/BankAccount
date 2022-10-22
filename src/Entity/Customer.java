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
}

