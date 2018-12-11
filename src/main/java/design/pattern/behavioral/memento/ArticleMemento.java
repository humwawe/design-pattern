package design.pattern.behavioral.memento;

/**
 * @author hum
 */
public class ArticleMemento {
    private String title;
    private String content;


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public ArticleMemento(String title, String content) {

        this.title = title;
        this.content = content;
    }
}
