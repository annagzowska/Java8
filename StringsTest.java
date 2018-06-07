import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringsTest {

    @Test
    public void countEmptyStrings() {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        int result = 0; // count empty strings

//        for(String x : strList){
//            if (x.equals("")){
//                result++;
//            }
//        }

        result = (int)strList.stream().filter(str -> str.isEmpty())
                .count();

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void filterWhoseLengthIsMoreThan3Chars() {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        int result = 0; // count words longer than 3 letters

//        for(String x : strList){
//            if (x.length() > 3){
//                result++;
//            }
//        }

        result = (int)strList.stream().filter(str -> str.length() > 3)
                .count();


        assertThat(result).isEqualTo(1);
    }

    @Test
    public void startsWith_a_or_b_letter() {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        int result = 0; // count words starting with "a" or "b"

//        for(String x : strList){
//            if (x.startsWith("a") || x.startsWith("b")){
//                result++;
//            }
//        }

        result = (int)strList.stream().filter(str -> str.startsWith("a") || str.startsWith("b"))
                .count();

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void removeAllEmptyStringsFromList() {
        List<String> strList = Lists.newArrayList("abc", "", "bcd", "", "defg", "jk");

        List<String> result = strList; // remove empty strings

        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next == null || next.isEmpty() ){
                iterator.remove();
            }
        }
//        result = result.stream()
//                .filter($ -> !$.isEmpty())
//                .collect(Collectors.toList());


        assertThat(result).hasSize(4);
    }

    @Test
    public void createListWithStringMoreThan2Chars() {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        List<String> result = Lists.newArrayList(); // create array with words longer than 2 characters

//        for(String x : strList){
//            if(x.length() > 2){
//                result.add(x);
//            }
//        }

        result = strList.stream()
                .filter(str -> str.length() > 2)
                .collect(Collectors.toList());

        assertThat(result).hasSize(3);
    }

    @Test
    public void convertToUpperAndJoinWithComma() {
        List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");

        String result = ""; // change to upper-case and join with comma and whitespace

        result = countries.stream()
                .map(txt -> txt.toUpperCase())
                .peek(System.out::println)
                .collect(Collectors.joining(", "));

        assertThat(result).isEqualTo("USA, JAPAN, FRANCE, GERMANY, ITALY, U.K., CANADA");
    }

    @Test
    public void squares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = Lists.newArrayList(); // get power of each number


//        for(int x : numbers){
//            result.add(x * x);
//        }

        result = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        assertThat(result).containsExactly(1, 4, 9, 16, 25, 36);
    }

    @Test
    public void distinctSquares() {
        List<Integer> numbers = Arrays.asList(3, 4, 3, 10, 9, 3, 4);


        List <Integer> result = Lists.newArrayList();  // get power of each number and remove duplicates

//        Set <Integer> set = new LinkedHashSet <Integer>(numbers);
//
//        for(int x : set) {
//            result.add(x * x);
//        }

        result = numbers.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());

        assertThat(result).containsExactly(9, 16, 100, 81);
    }

    @Test
    public void count_min_max_sum_avg() {
        List<Integer> numbers = Arrays.asList(1, 4, 12, 90, 8, 13, 44, 103, 13, 9, 76);
        // get count, max, average, min and sum of elements

        IntSummaryStatistics intSummaryStatistics =
            numbers.stream()
                .mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());


    }
}
