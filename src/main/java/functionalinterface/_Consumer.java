package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer john = new Customer("John", "1234567890");
        // using normal java method to represent Consumer
        greetCustomer(john);
        // using Consumer Functional interface
        System.out.println("using Consumer: ");
        greetCustomerConsumer.accept(john);
        // using normal java method to represent BiConsumer
        greetCustomerV2(john, false);
        // using BiConsumer Functional interface
        System.out.println("using BiConsumer: ");
        greetCustomerConsumerV2.accept(john, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("hello customer: " + customer.customerName +
                " with phone number: " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("hello customer: " + customer.customerName +
            " with phone number: " + customer.customerPhoneNumber);

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("hello customer: " + customer.customerName +
                " with phone number: " + (showPhoneNumber ? customer.customerPhoneNumber : "N/A"));
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("hello customer: " + customer.customerName +
            " with phone number: " + (showPhoneNumber ? customer.customerPhoneNumber : "N/A"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
