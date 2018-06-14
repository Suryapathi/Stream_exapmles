import java.util.*;

class StreamCountExample {

   // Driver code
   public static void main(String[] args)
   {

       List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12, 15, 16, 2, 0, 6, 8, 10,90,13);

       long total = list.stream().distinct().count();

       // Displaying the number of elements
       System.out.println(total);
   }
}