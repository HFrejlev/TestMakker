import junit.framework.TestCase;

public class TestTest extends TestCase {

    public void testBeregn() {
        Test test = new Test();
        assertEquals(6,test.Beregn(3));
        assertEquals(10,test.Beregn(4));
        assertEquals(15,test.Beregn(5));
        assertEquals(-1,test.Beregn(100000));
        assertEquals(-1,test.Beregn(-3));

    }




}