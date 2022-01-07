import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    // Casos positivos en los que hay un triangulo
    @Test
    public void test_main_program1(){
        Assert.assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void test_main_program2(){
        Assert.assertTrue(Demo.isTriangle(11,12,13));
    }

    @Test
    public void test_main_program3(){
        Assert.assertTrue(Demo.isTriangle(15,16,17));
    }

    @Test
    public void test_main_program4(){
        Assert.assertTrue(Demo.isTriangle(18,19,20));
    }

    @Test
    public void test_main_program5(){
        Assert.assertTrue(Demo.isTriangle(13,14,15));
    }

    @Test
    public void test_main_program6(){
        Assert.assertTrue(Demo.isTriangle(15,16,17));
    }

    // Test en los que se espera que no sea un triangulo
    @Test
    public void test_main_program7(){
        Assert.assertFalse(Demo.isTriangle(1,2,3));
    }

    @Test
    public void test_main_program8(){
        Assert.assertFalse(Demo.isTriangle(5,3,1));
    }

    @Test
    public void test_main_program9(){
        Assert.assertFalse(Demo.isTriangle(3,40,1));
    }

    @Test
    public void test_main_program10(){
        Assert.assertFalse(Demo.isTriangle(10,2,30));
    }

    @Test
    public void test_main_program11(){
        Assert.assertFalse(Demo.isTriangle(50,2,30));
    }

    @Test
    public void test_main_program12(){
        Assert.assertFalse(Demo.isTriangle(10,2,90));
    }

    @Test
    public void test_main(){

        String input = "\n1\n2\n3";

        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes());

        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "This is not a triangle.";

        Assert.assertThat(out.toString(), containsString(consoleOutput));

    }

    @Test
    public void test_main2(){

        String input = "\n3\n4\n5";

        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes());

        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "This is a triangle.";

        Assert.assertThat(out.toString(), containsString(consoleOutput));

    }

}
