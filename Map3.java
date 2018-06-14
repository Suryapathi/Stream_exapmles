

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//  w w  w  .j a v  a  2s  .  c o m
public class Map3 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);

    /*
    stringList.stream()
           .flatMap(n-> Stream.of(n) )
           .forEach(System.out::println);
           */

          list.stream()
          .map(value->value*2)
          .forEach(System.out::println); 
  }
}