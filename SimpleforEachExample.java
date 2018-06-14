import java.util.stream.*;  
public class SimpleforEachExample {  
    public static void main(String[] args){  
        Stream.iterate(10, element->element+2)
        .filter(element->element%4==0)
        .limit(5)
        .forEach(System.out::println);  
    }  
}