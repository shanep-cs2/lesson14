package lesson;

public interface Course extends Comparable<Course>{

    public String getDepartment();

    public void setDepartment(String department);

    public int getNumber();

    public void setNumber(int number);

}
