package module;

import java.util.Objects;

public class ProgrammingBook extends Book{
    private String language;
    private int level;

    public ProgrammingBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (super.equals(object))
            return true;
        ProgrammingBook book = (ProgrammingBook)object;
        return Objects.equals(language, book.language) && level == book.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language +
                ", level=" + level +
                " title='" + super.getTitle() +
                ", author='" + super.getAuthor() +
                ", price=" + super.getPrice() +
                '}';
    }
}
