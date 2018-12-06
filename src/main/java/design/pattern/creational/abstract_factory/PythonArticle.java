package design.pattern.creational.abstract_factory;

/**
 * @author hum
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}