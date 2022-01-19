package NewspaperSubscription;

import java.util.*;

public class DemoSubscriptions {
    public static void main(String[] args) {
        OnlineNewspaperSubscription online = new OnlineNewspaperSubscription("James", "james@gmail.com");
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription("James", "Jame123");

        OnlineNewspaperSubscription wrongOnline = new OnlineNewspaperSubscription("James", "Jame123");
        PhysicalNewspaperSubscription wrongPhysical = new PhysicalNewspaperSubscription("James", "james@gmail.com");

        System.out.println(online);
        System.out.println(physical);

        System.out.println(wrongOnline);
        System.out.println(wrongPhysical);
    }
}