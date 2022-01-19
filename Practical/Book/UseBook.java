package Book;

import java.util.*;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nonFiction = new NonFiction("National Geographic");

        System.out.println(fiction.toString());
        System.out.println(nonFiction.toString());
    }
}