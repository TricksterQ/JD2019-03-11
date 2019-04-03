package by.it.narushevich.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expr) {
        Pattern p = Pattern.compile(Patterns.OPERATION);
        String[] operands = expr.split(p.toString());
        if (operands.length != 2)
            return null;
        Var second = Var.createVar(operands[1]);
        Var first = Var.createVar(operands[0]);

        if (first == null || second == null)
            return null;
        Matcher m = p.matcher(expr);
        if (m.find())
            switch (m.group()) {
                case "+":
                    return first.add(second);
                case "-":
                    return first.sub(second);
                case "*":
                    return first.mul(second);
                case "/":
                    return first.div(second);
            }
        return null;
    }
}
