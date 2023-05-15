package pl.siftsystem.project.task2;

import java.util.Arrays;

public class ArithmeticExpressionEvaluator {
    public static int evaluateArithmeticExpression(String expression) {
        return Arrays.stream(expression.split("(?=[+-])"))
                .mapToInt(Integer::parseInt)
                .reduce(0, (acc, value) -> {
                    if (expression.startsWith("-")) {
                        return acc - value;
                    } else {
                        return acc + value;
                    }
                });
    }


}
