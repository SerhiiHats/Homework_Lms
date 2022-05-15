package description;

public class Author {
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void show() {
        System.out.println("Имя автора    : " + author);
    }

}
