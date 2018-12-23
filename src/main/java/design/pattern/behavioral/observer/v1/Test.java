package design.pattern.behavioral.observer.v1;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java");
        Teacher teacher = new Teacher("dan");
        course.addObserver(teacher);
        Question question = new Question();
        question.setUserName("hum");
        question.setContent("how to write hello world");
        course.produceQuestion(question);
    }
}
