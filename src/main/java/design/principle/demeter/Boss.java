package design.principle.demeter;

/**
 * @author hum
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
