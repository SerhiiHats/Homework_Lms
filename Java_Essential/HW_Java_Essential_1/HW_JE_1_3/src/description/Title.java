package description;

public class Title {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void show() {
        System.out.println("Название книги: " + title);
    }

}
