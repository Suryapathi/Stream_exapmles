
import java.util.stream.IntStream;

public class StreamIntStreamExample {
  public static void main(String[] args) {
    IntStream i = IntStream.of(4,3,2,1);
    //System.out.println(i);
    i.forEach(System.out::println);
  }
}