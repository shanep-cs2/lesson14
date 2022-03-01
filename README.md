# lesson14 - Generic Class

## Overview

In this lab we are going to create a two classes that implement the [comparable
interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html). The main method
will be defined in App.java and will read a list of courses and students that from standard input. 

In this lab we will define our classes first and write our tests second.

## Task 1 - Define the Course class

Create a file named Course.java and place it in `app/src/main/java/lesson`. The course class will
need to have the following private fields:

```java
private String department;
private String number;
```

The Course class will need to have the following constructor and member methods:

- Course(dept, num) - set department to parameter dept and number to parameter num
- compareTo(otherCourse) - to enable sorting of Course objects, return -1, 0, or 1 according to the
  comparisons of the private members between Course and otherCourse. Precedence of comparisons:
  department (lowest first), then number (lowest first)
- toString() - return a string representation of a course in the format "department number"

## Task 2 - Define the Student class

Create a file named Student.java and place it in `app/src/main/java/lesson`. The student class will
need to have the following private fields:

```java
private String firstName;
private String lastName;
private double GPA;
```

The Student class will need to have the following constructor and member methods:

- Student(first, last, gradeAverage) - set firstName to parameter first, lastName to parameter last,
  and GPA to parameter gradeAverage
- compareTo(otherStudent) - to enable sorting of Student objects, return -1, 0, or 1 according to
  the comparisons of the private members between Student and otherStudent. Precedence of
  comparisons: GPA (highest first), then lastName (lowest first), then firstName (lowest first)
- toString() - return a string representation of a student in the format "GPA lastName, firstName"

## Task 3 - Create unit tests

You now need to create 2 unit test classes named **CourseTest.java** and **StudentTest.java** and
place them in `app/src/test/java/lesson`.

## Task 4 - Input output Testing

The file **App.java** is given to you completed. You can now run input output testing with real
data on your newly created classes.

### Example run

Input:

```
Chemistry 250
Chemistry 300
Chemistry 200
Biology 200
Biology 100
Ravi Coltrane 3.75
Oliver Lake 2.9
Lol Coxhill 3.5
John Zorn 2.4
Joe Lavano 2.4
```

Output:

```
Biology 100
Biology 200
Chemistry 200
Chemistry 250
Chemistry 300

3.75 Coltrane, Ravi
3.50 Coxhill, Lol
2.90 Lake, Oliver
2.40 Lavano, Joe
2.40 Zorn, John
```
