package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        // using normal java method to represent Supplier
        System.out.println(getDbConnectionUrl());

        // using Supplier Functional interface
        System.out.println("using Supplier: ");
        System.out.println(getDbConnectionUrlSupplier.get());

    }

    static String getDbConnectionUrl() {
        return "jdbc:mysql://localhost:3306/nishchay";
    }

    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc:mysql://localhost:3306/nishchay";
}
