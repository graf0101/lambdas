package lambdas.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberFilterTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 43, 5, -234, 23, 6, 7, 19);
        /*
         * numbers.stream().filter(NumberFilterTest::isEven
         * ).forEach(System.out::println);
         * numbers.stream().filter(t -> !isEven(t)).forEach(System.out::println);
         * numbers.stream().filter(NumberFilterTest::isPositive).forEach(System.out::
         * println);
         * numbers.stream().filter(t -> !isPositive(t)).forEach(System.out::println);
         * numbers.stream().filter(NumberFilterTest::checkPrime).forEach(System.out::
         * println);
         */
        filterNumbers(numbers, NumberFilterTest::isEven);
        filterNumbers(numbers, t -> !isEven(t));
        filterNumbers(numbers, NumberFilterTest::isPositive);
        filterNumbers(numbers, NumberFilterTest::checkPrime);

    }



    private static boolean isEven(Integer number) {
        if (number % 2 == 0) {
            System.out.println(number + " isEven");
            return true;
        }
        System.out.println(number + " isOdd");
        return false;
    }

    private static boolean isPositive(Integer number) {
        if (number > 0) {
            System.out.println(number + " isPositive");
            return true;
        }
        System.out.println(number + " isNegative");

        return false;
    }

    static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
                return true;
            }
        } // end of else
        return false;
    }

    public static void filterNumbers(List<Integer> numbers, NumberFilter filter) {

        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (filter.filterNumber(number)) {
                filteredNumbers.add(number);
            }
        }
        System.out.println(filteredNumbers);

    }
}
