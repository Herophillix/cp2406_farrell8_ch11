package PhoneCall;

public abstract class PhoneCall {
    private String phoneNumber;
    private double price;

    public PhoneCall(String phoneNumber, double price) {
        this.phoneNumber = phoneNumber;
        SetPrice(price);
    }

    public String GetPhoneNumber() {
        return phoneNumber;
    }
    public double GetPrice() {
        return price;
    }

    private void SetPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", price=" + price +
                '}';
    }
}