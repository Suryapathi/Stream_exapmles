package com.kgfsl;

import java.util.Arrays;
import java.util.List;
/*from www  . j  a v  a  2  s  .c o  m*/
public class MapToInt1 {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("1","2","3","4","5");

    stringList.stream()
           .mapToInt(n-> Integer.parseInt(n) )
           .filter(n-> n%2 == 0)
           .forEach(System.out::println);
  }
}