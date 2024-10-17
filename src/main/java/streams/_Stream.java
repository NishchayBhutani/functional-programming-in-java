package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Jane", FEMALE),
                new Person("Mary", FEMALE),
                new Person("Mike", MALE)
        );

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream().allMatch(person -> FEMALE.equals(person.gender));
        System.out.println("containsOnlyFemales: " + containsOnlyFemales);
        boolean containsFemales = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println("containsFemales: " + containsFemales);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
