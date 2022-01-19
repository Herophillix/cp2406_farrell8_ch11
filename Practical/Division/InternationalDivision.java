package Division;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String companyName, int accountNumber, String country, String language) {
        super(companyName, accountNumber);
        SetCountry(country);
        SetLanguage(language);
    }

    public String GetCountry() {
        return country;
    }
    public String GetLanguage() {
        return language;
    }

    public void SetCountry(String country) {
        this.country = country;
    }
    public void SetLanguage(String language) {
        this.language = language;
    }

    public void display()
    {
        System.out.println(
                "InternationalDivision{" +
                "companyName='" + GetCompanyName() + '\'' +
                ",accountNumber='" + GetAccountNumber() + '\'' +
                ",country='" + country + '\'' +
                ", language='" + language + '\'' +
                '}');
    }
}