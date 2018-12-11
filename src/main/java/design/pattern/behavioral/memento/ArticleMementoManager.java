package design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author hum
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> articleMementos = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = articleMementos.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        articleMementos.push(articleMemento);
    }
}
