package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        // using normal java method to represent Predicate
        System.out.println(isPhoneNumberValid("01234567890"));
        System.out.println(isPhoneNumberValid("12345678900"));
        System.out.println(isPhoneNumberValid("0234567890"));

        // using Predicate Functional interface
        System.out.println("using Predicate: ");
        System.out.println(isPhoneNumberValidPredicate.test("01234567890"));
        System.out.println(isPhoneNumberValidPredicate.test("12345678900"));
        System.out.println(isPhoneNumberValidPredicate.test("0234567890"));

        // chaining
        System.out.println("chaining using Predicate: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("01234567898"));
        System.out.println("chaining using Predicate: " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("0123456789"));

        // using BiPredicate is similar to Predicate, it just takes two arguments instead
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("0") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("0") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}

