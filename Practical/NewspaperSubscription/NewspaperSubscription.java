package NewspaperSubscription;

public abstract class NewspaperSubscription {
    private String name;
    protected String address;
    private double rate;

    public NewspaperSubscription(String name, String address) {
        SetName(name);
        SetAddress(address);
    }

    public String GetName() {
        return name;
    }
    public String GetAddress() {
        return address;
    }
    public double GetRate() {
        return rate;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public abstract void SetAddress(String address);
    protected void SetRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "NewspaperSubscription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rate=" + rate +
                '}';
    }
}