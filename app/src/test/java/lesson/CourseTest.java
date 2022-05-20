package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CourseTest {

    @Test
    public void testDepEquals() {
        Course c = new MyCourse("course", 1);
        Course o = new MyCourse("course", 2);
        assertEquals(c.compareTo(o), -1);
    }  
    
    @Test
    public void testNumEquals() {
        Course c = new MyCourse("course", 1);
        Course o = new MyCourse("course", 1);
        assertEquals(c.compareTo(o), 0);
    }   

    @Test
    public void testDepLess(){
        Course c = new MyCourse("course", 1);
        Course o = new MyCourse("dourse", 1);
        assertEquals(c.compareTo(o), -1);
    }

    @Test
    public void testDepGreater(){
        Course c = new MyCourse("course", 1);
        Course o = new MyCourse("dourse", 1);
        assertEquals(c.compareTo(o), -1);
    }

    @Test
    public void testNumGreater(){
        Course c = new MyCourse("course", 2);
        Course o = new MyCourse("course", 1);
        assertEquals(c.compareTo(o), 1);

    }

    @Test
    public void testNumLess(){
        Course c = new MyCourse("course", 1);
        Course o = new MyCourse("course", 2);
        assertEquals(c.compareTo(o), -1);
    }

    @Test
    public void TestBSU(){
        Course o121 = new MyCourse("Computer Science 1", 121);
        Course o221 = new MyCourse("Computer Science 2", 221);
        assertEquals(o121.compareTo(o221), -1);
        assertEquals(o221.compareTo(o121), 1);
        assertEquals(o121.compareTo(o121), 0);
    }
}
