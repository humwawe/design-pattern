package design.pattern.creational.prototype;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("init ");
        System.out.println("init mail:" + mail);
        for (int i = 0; i < 5; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name" + i);
            mailTemp.setEmailAddress("name" + i + "@163.com");
            mailTemp.setContent("hhhhhhhhhhhhhhhhhh");
            MailUtil.sendMail(mailTemp);
            System.out.println("clone mailTemp:" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
