
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;  
class StreamusingArrayExample{  
 public static void main(String args[]){  
    int[] ids = {1,2,3,4,5,6,7,8,9,10};
    ArrayList<Integer> values = new ArrayList<Integer>();
    for (int id: ids) {
        values.add(id);
 }

System.out.println("value added");
// values.stream()

// .forEach(System.out::println);
 
}
}