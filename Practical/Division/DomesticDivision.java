package Division;

public class DomesticDivision extends Division{
    private String state;

    public DomesticDivision(String companyName, int accountNumber, String state) {
        super(companyName, accountNumber);
        SetState(state);
    }

    public String GetState() {
        return state;
    }

    public void SetState(String state) {
        this.state = state;
    }

    public void display()
    {
        System.out.println("DomesticDivision{" +
                "companyName='" + GetCompanyName() + '\'' +
                ",accountNumber='" + GetAccountNumber() + '\'' +
                ",state='" + state + '\'' +
                '}');
    }
}