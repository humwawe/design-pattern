package design.pattern.behavioral.state;

/**
 * @author hum
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("Error stop can not speed");
    }

    @Override
    public void pause() {
        System.out.println("Error stop can not pause");
    }

    @Override
    public void stop() {
        System.out.println("stopping");

    }
}
