package ReusingClassesLab01;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Created by rogi on 2/2/16.
 */
public class ReusingClassesLab01Spec {
    ReusingClassesLab01 rc1;
    ArrayList<Integer> lists;
    @Before
    public void setUp(){
        rc1 = new ReusingClassesLab01();
        lists = new ArrayList<Integer>();
    }
    @Test
    public void rotateSpec(){
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);

        rc1.rotate(lists,2);
        Integer x = 2;
        assertEquals("Test should pass", x, lists.get(3));
    }
}
