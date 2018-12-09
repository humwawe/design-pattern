package design.pattern.behavioral.templatemethod;

/**
 * @author hum
 */
public class DPCourse extends AbstractCourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}