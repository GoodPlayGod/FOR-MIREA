
package com.company;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Not Steve", 2000, 1998);
        Book b2 = new Book("Steve the greatest", 786);
        Book b3 = new Book("Ugly Steve");
        b1.setAuthor("Another Steve");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}