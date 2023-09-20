package Java8;

import java.util.*;
public class MapFunction {

    static class Book {
        public String name;
        public int year;
        public String description;

        public Book(String name, int year, String description) {
            this.name = name;
            this.year = year;
            this.description = description;
        }
    }

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

    }
}
