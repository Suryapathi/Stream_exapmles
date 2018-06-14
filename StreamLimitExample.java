

import java.util.Arrays;
import java.util.List;
//  w w w  .  j  a  v  a 2 s.c om
public class StreamLimitExample {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1","1","2","3","4");

    stringList.stream()
          // .distinct()
           .limit(4)
           .forEach(System.out::println);
  }
}