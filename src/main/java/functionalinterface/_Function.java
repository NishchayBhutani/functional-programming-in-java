package functionalinterface;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // FUNCTION
        int increment = incrementByOne(0);
        System.out.println(increment);

        // increment and multiply
//        int increment2 = incrementByOneFunction.apply(1);
//        System.out.println("using Function : " + increment2);
//
//        int multiply = multiplyByTenFunction.apply(increment2);
//        System.out.println(multiply);

        // chaining
        int incrementAndMultiplyInOneGo = incrementByOneFunction.andThen(multiplyByTenFunction).apply(1);
        System.out.println(incrementAndMultiplyInOneGo);

        // BIFUNCTION
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println( "using BiFunction : " + incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrement, numberToMultiplyBy) -> (numberToIncrement + 1) * numberToMultiplyBy;
}
