package design.principle.single_responsibility.method_level;

/**
 * @author hum
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "hum";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "hum";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "hum";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }


        userName = "hum";
        address = "beijing";
    }


}
