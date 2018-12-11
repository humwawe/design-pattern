package design.pattern.behavioral.memento;


/**
 * @author hum
 */
public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleMemento save2Memento() {
        ArticleMemento articleMemento = new ArticleMemento(title, content);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        title = articleMemento.getTitle();
        content = articleMemento.getContent();
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
