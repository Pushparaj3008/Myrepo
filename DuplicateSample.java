import java.util.*;
public class DuplicateSample {

    public static void main(String[] args) {

        ArrayList<String>  files = new ArrayList<>();
        files.add("FileName1.pdf");
        files.add("FileName2.png");
        files.add("FileName3.jpg");
        files.add("FileName4.pdf");
        files.add("FileName10.pdf");
        System.out.println(files);

        Set<String> unique = new HashSet<>();
        boolean duplicate = false;

        for(String s:files){
           if(!unique.add(s)){
               duplicate = true;
               System.out.println("Duplicate file :" + s);


          }

        }
        if(duplicate == true){
            System.out.println("Duplicate is found");
        }
        else{
            System.out.println("Duplicate is not found");
        }
    }
}
