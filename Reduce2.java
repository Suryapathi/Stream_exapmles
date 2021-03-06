package com.kgfsl;

import java.util.*;

class Reduce2 {

   // Driver code
   public static void main(String[] args)
   {

       // Creating list of integers
       List<Integer> array = Arrays.asList(2, 0, 4, 6, 8);

       // Finding sum of all elements
       int sum = array.stream()
                 .reduce(0,(element1, element2) -> element1 + element2);

       // Displaying sum of all elements
       System.out.println("The sum of all elements is " + sum);
   }
}