package design.pattern.behavioral.visitor;

import javax.sound.midi.Soundbank;

/**
 * @author hum
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("free:" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("coding:" + codingCourse.getName() + " price:" + codingCourse.getPrice());
    }
}
