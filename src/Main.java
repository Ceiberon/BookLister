import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        var bookArray = Arrays.asList(
                new Book[]{
                        new Book(100, "EmirhanKitap", date, "Emirhan"),
                        new Book(132, "FurkanKitap", date, "Furkan"),
                        new Book(114, "AhmetKitap", date, "Ahmet"),
                        new Book(181, "TestKitap", date, "Test"),
                        new Book(151, "HayatKitabı", date, "Hayat"),
                });

        Set<Book> bookOrderByPageCount = new HashSet<Book>(bookArray);

        List<Book> bookList = new ArrayList<>(bookOrderByPageCount);
        Collections.sort(bookList);
        System.out.println("Book list ordered by pageCount");
        for (Book book : bookList) {
            System.out.println(book.sayfaSayisi + " " + book.kitapAdi + " " + book.yayinTarihi + " " + book.yazarAdi + " ");
        }

        Set<Book> bookListToOrderName = new HashSet<Book>(bookArray);
        List<Book> bookListToOrderWithName = new ArrayList<>(bookListToOrderName);

        bookListToOrderWithName.sort(new Comparator<Book>() {
            @Override
            public int compare(final Book book1, final Book book2) {
                return book1.kitapAdi.compareTo(book2.kitapAdi);
            }
        });
        System.out.println("Book list ordered by bookName");
        for (Book book : bookListToOrderWithName) {
            System.out.println(book.sayfaSayisi + " " + book.kitapAdi + " " + book.yayinTarihi + " " + book.yazarAdi + " ");
        }


    }

}