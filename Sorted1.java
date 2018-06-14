package com.kgfsl;

import java.util.Arrays;
import java.util.List;
//  www  .  ja  v a  2  s .  c  o m
public class Sorted1 {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("5","1","2","3","4");

    stringList.stream()
           .sorted()
           .forEach(System.out::println);
  }
}