# lesson14 - Generic Class

## Overview

In this lab we are going to create a class that implements the [comparable
interface](https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html). The comparable
interface allows us to order our objects when searching and sorting.

## Videos

- [Lab Overview]()

## Task 1 - Complete the MyCourse class

Find the **MyCourse.java** class that implements the Course and Comparable interface and complete
the class as defined. 

The Course class will need to define a constructor and override the toString method as follows:

- Course(dept, num) - set department to parameter dept and number to parameter num
- toString() - return a string representation of a course (see the example below for the format)

The compareTo(otherCourse) method that enables sorting of Course objects need to return -1, 0, or 1
according to the comparisons of the private members between Course and otherCourse. Precedence of
comparisons: department (lowest first), then number (lowest first). See below for an example.

## Task 2 - Create unit tests

Create as many unit tests as necessary for your **Course** class in the file **CourseTest.java** to
ensure your code is correct. You will need to define at least 3 tests.

## Task 3 - Input output Testing

The file **App.java** is given to you completed. You can now run input output testing with real
data on your newly created classes.

### Example run

Input:

```
c 1
c 2
a 5
a 2
b 0
```

Output:

```
MyCourse [department=a, number=2]
MyCourse [department=a, number=5]
MyCourse [department=b, number=0]
MyCourse [department=c, number=1]
MyCourse [department=c, number=2]
```

## Task 4 - Complete the Retrospective

Once you have completed all the tasks open the file Retrospective.md and complete each section with
a TODO comment.

## Task 5 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!
