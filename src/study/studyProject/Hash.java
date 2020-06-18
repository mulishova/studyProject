package study.studyProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book {
    String autor;
    String name;
}

class Ticket {
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

public class Hash {
    public static void main(String[] args) {
        Book book = new Book();
        Ticket ticket = new Ticket();

        book.autor = "Arturo Pérez-Reverte";
        book.name = "La tabla de Flandes";
        ticket.number = 12345;

        Map<Ticket, Book> map = new HashMap<>();
        map.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 12345;

        // Book ArturoBook = map.get(ticket);
        Book ArturoBook = map.get(ticket2);
        System.out.println(ArturoBook.autor);
    }
}
