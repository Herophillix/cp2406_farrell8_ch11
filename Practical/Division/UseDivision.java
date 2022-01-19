package Division;

import java.util.*;

public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision shellDomestic = new DomesticDivision("Shell", 23, "Bedok");
        InternationalDivision shellInternational = new InternationalDivision("Shell", 233, "Thailand", "Thai");


        DomesticDivision walmartDomestic = new DomesticDivision("Walmart", 1414, "New York");
        InternationalDivision walmartInternational = new InternationalDivision("Walmart", 4, "France", "French");

        shellDomestic.display();
        shellInternational.display();
        walmartDomestic.display();
        walmartInternational.display();
    }
}