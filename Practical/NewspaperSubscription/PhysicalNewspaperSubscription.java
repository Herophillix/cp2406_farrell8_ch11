package NewspaperSubscription;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public PhysicalNewspaperSubscription(String name, String address)
    {
        super(name, address);
    }

    public void SetAddress(String address)
    {
        for(int i = 0; i < address.length(); ++i)
        {
            char character = address.charAt(i);
            if(Character.isDigit(character))
            {
                this.address = address;
                SetRate(15);
                return;
            }
        }
        System.out.println("Error in address, no digit is found");
        SetRate(0);
    }
}
