import java.util.Date;

public class Book implements Comparable<Book> {
    int sayfaSayisi;
    String kitapAdi;
    Date yayinTarihi;
    String yazarAdi;

    Book(int sayfaSayisi, String kitapAdi, Date yayinTarihi, String yazarAdi) {
        this.sayfaSayisi = sayfaSayisi;
        this.kitapAdi = kitapAdi;
        this.yayinTarihi = yayinTarihi;
        this.yazarAdi = yazarAdi;
    }
    @Override
    public int compareTo(Book o) {
        if (sayfaSayisi < o.sayfaSayisi) {
            return 1;
        } else if (sayfaSayisi == o.sayfaSayisi) {
            return 0;
        } else {
            return -1;
        }
    }
}
