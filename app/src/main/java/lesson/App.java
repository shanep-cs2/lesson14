package lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int j;
        try (var scnr = new Scanner(System.in)) {
         ArrayList<Course> courses = new ArrayList<Course>();
           // Input 5 courses
           for (j = 0; j < 5; ++j) {
              courses.add(new MyCourse(scnr.next(), scnr.nextInt()));
           }
           Collections.sort(courses);
           // Output courses 
           for (j = 0; j < courses.size(); ++j) {
              System.out.println(courses.get(j));
           }
      }
     }
}