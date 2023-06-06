public class Sort{
//    find the smallest item
//    move it to the front
//    selection sort the rest (recursion)

//    return the index of the smallest item in x, starts at the position a
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1){
            //if x[i]<x[smallestIndex], cmp will be -1.
            int cmp = x[i].compareTo(x[smallestIndex]);
            if(cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    //swapping the items x[a] and x[b]
    public static void swap(String[] x, int a, int b){
        String temp= x[a];
        x[a] = x[b];
        x[b] = temp;
    }

//    recursion: sorts the rest of the array that starts at some point
    public static void sort(String[] x, int start){
        if(start == x.length) {
            return;
        }
        int smallest = findSmallest(x,start);
        swap(x, smallest, start);
        sort(x, start + 1);
    }
}