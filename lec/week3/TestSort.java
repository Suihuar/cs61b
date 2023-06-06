import org.junit.Test;
import static org.junit.Assert.*;
public class TestSort{
    /*Sort strings destructively*/
    @Test
    public void testSort(){
         String[] input = {"i","have", "an","egg"};
         String[] expected = {"an", "egg", "have", "i"};
         Sort.sort(input,0);
         assertArrayEquals(expected,input);
         }
    @Test
    public void testSwap(){
        String[] input = {"i","have", "an","egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an","have", "i", "egg"};
        Sort.swap(input,a,b);
        assertArrayEquals(expected,input);
    }
    /*Test the Sort,findSmallest method*/
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        String actual = input[Sort.findSmallest(input,0)];
        assertEquals(expected,actual);
        String[] input2 = {"an", "have", "i", "egg"};
        String expected2 = "egg";
        String actual2 = input[Sort.findSmallest(input2,2)];
        assertEquals(expected2,actual2);
    }

}