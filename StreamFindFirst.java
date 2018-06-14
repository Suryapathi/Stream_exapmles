

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sob","Zuckerberg", "Tom", "Jeff", "Scott", "Jennifer", "Steve","Zany");

        Optional<String> firstS = names.stream().filter(name -> name.startsWith("S")).findFirst();
        System.out.println(firstS.orElse("None found"));

        Optional<String> firstZ = names.stream().filter(name -> name.startsWith("Z")).findFirst();
        if (firstZ.isPresent()) {
            System.out.println(firstZ.get());
        } else {
            System.out.println("No Z's found");
        }
    }
}