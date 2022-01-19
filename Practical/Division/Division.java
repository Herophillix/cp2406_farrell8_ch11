package Division;

public abstract class Division {
    private String companyName;
    private int accountNumber;

    public Division(String companyName, int accountNumber) {
        SetCompanyName(companyName);
        SetAccountNumber(accountNumber);
    }

    public String GetCompanyName() {
        return companyName;
    }
    public int GetAccountNumber() {
        return accountNumber;
    }

    public void SetCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void SetAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}