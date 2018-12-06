package design.pattern.creational.abstract_factory;

/**
 * @author hum
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
