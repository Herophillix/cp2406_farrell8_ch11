package NewspaperSubscription;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    public OnlineNewspaperSubscription(String name, String address)
    {
        super(name, address);
    }

    public void SetAddress(String address)
    {
        for(int i = 0; i < address.length(); ++i)
        {
            char character = address.charAt(i);
            if(character == '@')
            {
                this.address = address;
                SetRate(9);
                return;
            }
        }
        System.out.println("Error in address, no @ is found");
        SetRate(0);
    }
}
