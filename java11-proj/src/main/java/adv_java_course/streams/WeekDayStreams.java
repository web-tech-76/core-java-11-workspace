package adv_java_course.streams;

import java.util.List;
import java.util.stream.Collectors;

public class WeekDayStreams {


    List<String> sortedWeeks(List<String> weekDaysList){
        return weekDaysList.stream()
                .sorted()
                .collect(Collectors.toList());
    }


    // This method should return a list only containing items
    // from the original list that begin with T.
    List<String> beginningWithT(List<String> list) {
        return list.stream()
                .filter( (item) -> item.startsWith("T"))
                .collect(Collectors.toList());
    }

    // This method should a list containing the same elements as the original,
    // but every String should be all capitalized.
    List<String> upperCase(List<String> list) {

        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    // This method should sort the elements in the list alphabetically,
    // filter the elements to only get the words beginning with T, and
    // capitalise every string.
    List<String> everythingCombined(List<String> list) {
        return upperCase(
            beginningWithT(
            sortedWeeks(list)));
    }
}
