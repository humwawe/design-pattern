package design.pattern.behavioral.interpreter;

/**
 * @author hum
 */
public class NumberInterpreter implements Interpreter {
    int num;

    public NumberInterpreter(int num) {
        this.num = num;
    }

    public NumberInterpreter(String num) {
        this.num = Integer.parseInt(num);
    }

    @Override
    public int interpret() {
        return this.num;
    }
}
