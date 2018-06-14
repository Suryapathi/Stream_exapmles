package com.kgfsl;

import java.util.OptionalInt;
import java.util.stream.IntStream;
//from  w w w.j  a va 2 s  .  c  om
public class Reduce3 {
  public static void main(String[] args) {
    IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
    OptionalInt v = i.reduce(Integer::sum);
    if(v.isPresent()){
      System.out.println(v.getAsInt());  
    }else{
      System.out.println(v);
    }
    
  }
}