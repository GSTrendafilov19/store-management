public class Customer {
    private String name;
    private String address;
    private int PIN;

    public Customer() {
        this.name = "";
        this.address = "";
        this.PIN = 0;
    }

    public Customer(String name, String address, int PIN) {
        this.name = name;
        this.address = address;
        this.PIN = PIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + '\'' + "Address: " + this.address + '\'' + "EGN: " + this.PIN;
    }
}
