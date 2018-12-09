package design.pattern.behavioral.interpreter;

/**
 * @author hum
 */
public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return "+".equals(symbol) || "*".equals(symbol);
    }

    public static Interpreter getExpressionObeject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if ("*".equals(symbol)) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
