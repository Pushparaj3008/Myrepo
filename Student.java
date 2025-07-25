import java.util.*;
import java.util.stream.*;

/*
KEY      VALUES
REC    VIKRAM 53  46   89
VIT    RAJ     83  82  81
VIT    PRABHU  52   63   96z
REC    VIMAL   64   86    92
VIT    RAM     76   86     91
SRM    JOHN    92   91     86

--> Prints the Studentdents having more than 60% average in a arraylist in form of clgname,Studentdent name and average.

-->Print the Studentdents in VIT having total of 160 marks collect in a arraylist .
 */
public class Student{
        String name;
        int m1,m2,m3;

       public Student(String name, int m1, int m2, int m3){
            this.name = name;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        @Override
        public String toString( ){
           return name + " "+m1+" "+m2+" "+m3;
    }

        public static void main(String[] args) {
             Student s1 = new Student("VIKRAM",53,46,89);
            Student s2 = new Student("RAJ",83,82,81);
            Student s3 = new Student("PRABHU",10,13,96);
            Student s4 = new Student("VIMAL",64,86,92);
            Student s5 = new Student("RAM",76,86,91);
            Student s6 = new Student("JOHN",92,91,86);


            Map<String, List<Student>> h1= new HashMap<>();
            h1.put("REC", List.of(s1, s4));
            h1.put("VIT", List.of(s2, s3, s5));
            h1.put("SRM", List.of(s6));

            System.out.println(h1);

            //  Studentdents with average > 60%
            List<Student> avg = h1.values().stream()
                    .flatMap(List::stream)
                    .filter(s -> IntStream.of(s.m1, s.m2, s.m3).average().getAsDouble() > 60)
                    .collect(Collectors.toList());

            System.out.println("Student with average > 60%:");
            avg.forEach(System.out::println);

            // VIT Student with total > 160
            List<Student> vit = h1.getOrDefault("VIT", new ArrayList<>()).stream()
                    .filter(s -> IntStream.of(s.m1, s.m2, s.m3).sum() > 160)
                    .collect(Collectors.toList());

            System.out.println("\nVIT Student with total marks > 160:");
            vit.forEach(System.out::println);



        }
    }







