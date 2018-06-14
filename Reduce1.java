package com.kgfsl;

import java.util.*;

class Reduce1 {

   // Driver code
   public static void main(String[] args)
   {
       // creating a list of Strings
       List<String> words = Arrays.asList("GFG", "Geeks", "for",
                                          "GeeksQuiz", "GeeksforGeeks");

       // The lambda expression passed to
       // reduce() method takes two Strings
       // and returns the the longer String.
       // The result of the reduce() method is
       // an Optional because the list on which
       // reduce() is called may be empty.
       Optional<String> longestString = words.stream()
                                  .reduce((word1, word2)
                            -> word1.length() > word2.length()
                                          ? word1 : word2);

       // Displaying the longest String
      longestString.ifPresent(System.out::println);
       System.out.println(longestString);
   }
}