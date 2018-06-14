

import java.util.Arrays;
import java.util.List;
//from w  w  w .  ja v  a2s  .  com
public class StreamCovertingArrayExample{
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("2","1","3","4");

    Object[] n = stringList.stream()      
              .toArray();
    System.out.println(Arrays.toString(n));
    
  }
}