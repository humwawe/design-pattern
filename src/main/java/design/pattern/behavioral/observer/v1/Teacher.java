package design.pattern.behavioral.observer.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hum
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(name + "'s " + course.getCourseName() + " get a " + question.getUserName() + "'s question: " + question.getContent());
    }
}
