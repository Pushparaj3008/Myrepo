import  java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamDuplicate {


    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files.add("FileName1.pdf");
        files.add("FileName2.png");
        files.add("FileName3.jpg");
        files.add("FileName3.pdf");
        files.add("FileName1.pdf");
        System.out.println(files);
        Set<String> seen = new HashSet<>();

        List<String> duplicates = files.stream()
                .filter(f -> !seen.add(f)) // add returns false if already present
                .collect(Collectors.toList());

        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate Found: " + duplicates);
        } else {
            System.out.println("No duplicates found.");


        }
    }
}
