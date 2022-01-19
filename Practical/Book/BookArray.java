package Book;

import java.util.*;

public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        for(int i = 0; i < bookArray.length; ++i)
        {
            if(i % 2 == 0)
            {
                bookArray[i] = new Fiction("Fiction " + i);
            }
            else
            {
                bookArray[i] = new NonFiction("Non Fiction " + i);
            }
        }
        for(Book book: bookArray)
        {
            System.out.println(book);
        }
    }
}