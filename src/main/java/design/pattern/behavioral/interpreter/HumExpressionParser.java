package design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @author hum
 */
public class HumExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                Interpreter interpreter = OperatorUtil.getExpressionObeject(firstExpression, secondExpression, symbol);
                int result = interpreter.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
            }
        }
        return stack.pop().interpret();
    }
}
