package design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author hum
 * Group就是中介者,有点像聊天室的广播者
 */
public class Group {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + ": " + user.getName() + " send " + message);
    }
}
