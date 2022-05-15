package description;

public class Content {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void show() {
        System.out.println("Содержание    : " + content);
    }

}
