public class TestSort{
    
    /*Sort strings destructively*/
    public static void testsort(){
         String[] input = {"I","have", "an","egg"};
         String[] expected = {"an", "egg", "have", "I"};
         Sort.sort(input);

         if (java.util.Arrays.equals(input,expected)){
            System.out.println("Error!");
         }
    }

    public static void main(String[] args){
        testsort();
    }
}