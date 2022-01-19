package PhoneCall;

import Book.Book;

import java.util.*;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneArray = new PhoneCall[10];
        for(int i = 0; i < phoneArray.length; ++i)
        {
            if(i % 2 == 0)
            {
                phoneArray[i] = new IncomingPhoneCall("99" + i);
            }
            else
            {
                phoneArray[i] = new OutgoingPhoneCall("99" + i, i * 3);
            }
        }
        for(PhoneCall phoneCall: phoneArray)
        {
            System.out.println(phoneCall);
        }
    }
}