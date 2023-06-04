public class SLList{
    /*Private: So that nobody can create a IntNode 
    type variable outside this class */
    private class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i,IntNode n){
            item = i;
            next = n;
        }
    }
     /* The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /* Creates an empty list */
    public SLList(){
        sentinel = new IntNode(114514,null);
        size=0;
    }
    /* Creates a non-empty list */
    public SLList(int x){
        sentinel = new IntNode(114514,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }
    public static void main(String[] args){
        /*Creates a list of one int, namely 10 */
        SLList L = new SLList();
        // L.addFirst(10);
        // L.addFirst(5);
        L.addLast(30);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }

    /*Adds x to the front of the list */
    public void addFirst(int x){
       sentinel.next = new IntNode(x,sentinel.next); 
       size += 1;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    /*Adds x to the last of the list */
    public void addLast(int x){
        IntNode n = sentinel;
        while(n.next != null){
            n=n.next;
            }
        n.next=new IntNode(x,null);
        size += 1;
    }

    /* How long is the list...No Recursion! 
    public int size(){
        IntNode n=this.first;
        int i=1;
        while(n.next != null){
            n=n.next;
            i+=1;
        }
        return i;
    }*/
    
    /* With Recursion! */
    /* 1. a helper method: returns the size of the
     * list that starts at IntNode p. 
     * (This part is much like the previous lesson!)
    private static int size(IntNode p){
        if(p.next == null){
            return 1;
        }
        return 1+size(p.next);
    }
    /* With the helper method, we can do it
    public int size(){
      return size(first);
    }
    */

    /* 'size' is slow. 
     * (data source 100 times bigger -> 
     * 100 time longer to process)
     * how to make it faster?
     */

     /* aadding size in the process of creation! */

     public int size(){
        return size;
     }
}