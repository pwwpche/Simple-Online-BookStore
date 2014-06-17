package BookStore.Entity;

import java.io.Serializable;

/**
 * Created by pwwpche on 2014/6/10.
 */
public class CartbookEntityPK implements Serializable {
    private int cid;
    private String isbn;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartbookEntityPK that = (CartbookEntityPK) o;

        if (cid != that.cid) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }
}
