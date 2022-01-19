package PhoneCall;

import java.util.*;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("123");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("333", 29);

        System.out.println(incomingPhoneCall);
        System.out.println(outgoingPhoneCall);
    }
}