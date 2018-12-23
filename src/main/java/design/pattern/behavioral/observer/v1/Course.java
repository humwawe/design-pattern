package design.pattern.behavioral.observer.v1;

import java.util.Observable;

/**
 * @author hum
 */
public class Course extends Observable {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public Course(String courseName) {

        this.courseName = courseName;
    }

    public void produceQuestion(Question question) {
        System.out.println(question.getUserName() + " make a question in " + courseName);
        setChanged();
        notifyObservers(question);
    }
}
