package com.kgfsl;

import java.util.OptionalInt;
import java.util.stream.IntStream;
//  ww  w  .j  a va2  s .  co  m
public class MaxMin1 {
  public static void main(String[] args) {
    IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
    OptionalInt d = i.max();
    
    if(d.isPresent()){
      System.out.println(d.getAsInt());
    }else{
      System.out.println("no value");  
    }    

  }
}