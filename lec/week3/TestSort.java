public class TestSort{
    
    /*Sort strings destructively*/
    @org.junit.Test
    public void testSort(){
         String[] input = {"i","have", "an","egg"};
         String[] expected = {"an", "egg", "have", "i"};
         Sort.sort(input);

         org.junit.Assert.assertArrayEquals(expected,input);
         }
    @org.junit.Test
    public void testSwap(){
        String[] input = {"i","have", "an","egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an","have", "i", "egg"};

        Sort.swap(input,a,b);
        org.junit.Assert.assertArrayEquals(expected,input);
    }
    /*Test the Sort,findSmallest method*/
    @org.junit.Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        String actual = input[Sort.findSmallest(input,0)];
        org.junit.Assert.assertEquals(expected,actual);

        String[] input2 = {"an", "have", "i", "egg"};
        String expected2 = "egg";
        String actual2 = input[Sort.findSmallest(input2,2)];
        org.junit.Assert.assertEquals(expected2,actual2);
    }

}