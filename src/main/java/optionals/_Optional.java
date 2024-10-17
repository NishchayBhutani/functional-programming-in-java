package optionals;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        // using orElseGet
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        // using ifPresent
        Optional.ofNullable("name")
                .ifPresent(System.out::println);

        // using ifPresentOrElse
        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("value is null"));
    }
}
