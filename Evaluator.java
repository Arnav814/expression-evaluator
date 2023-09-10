import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluator {
    private static final Pattern extractEquation = Pattern.compile("(-?\\d+) *([+\\-*/]) *(-?\\d+)");

    public static void main(String[] args) {
        System.out.println("Hello, Monkey Butt!");
    }

    private Equation createEquation(String input) {
        Matcher equationMatcher = extractEquation.matcher(input);
        return new Equation(Integer.parseInt(equationMatcher.group(0)),
                Integer.parseInt(equationMatcher.group(2)), equationMatcher.group(1).charAt(0));
    }

    public class Equation {
        private int operand_1, operand_2;
        private char operator;

        public Equation(int operand_1, int operand_2, char operator) {
            this.operand_1 = operand_1;
            this.operand_2 = operand_2;
            this.operator = operator;
        }
    }
}
