public class IntList{
    public static void main(String[] args){
        IntList L = new IntList(15,null);
        L = new IntList(10,L);
        L = new IntList(5,L);
        L = new IntList(13,L);

        System.out.println(L.size());
        System.out.println(L.get(3));
    }
    
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    /*finding the size of the list with reursion
    public int size(){
        if(this.rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }
    */

    /*size...with no recursion! */
    public int size(){
        IntList p=this;
        int totalSize=0;
        while(p != null){
            totalSize +=1;
            p=p.rest;
        }
        return totalSize;
    }

    //to get the ith item in the list 
    //e.g. 13 is the 1st item
    
    /* 1. No recursion! 
    public int get(int i){
        int item=0;
        IntList p=this;
        for(int j=0;j<i;j+=1){
            item=p.first;
            p=p.rest;
        }
        return item;
    }
    */
    /* Recursion! */
    public int get(int i){
        if(i<=1){
            return this.first;
        }
        return rest.get(i-1);
    }
}