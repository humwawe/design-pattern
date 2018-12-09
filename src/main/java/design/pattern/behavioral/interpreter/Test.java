package design.pattern.behavioral.interpreter;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        String str = "6 100 11 + *";
        HumExpressionParser humExpressionParser = new HumExpressionParser();
        int result = humExpressionParser.parse(str);
        System.out.println(result);

    }
}
