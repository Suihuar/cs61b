public class LinkedListDeque<T> {
    public static void main(String[] args) {
        LinkedListDeque<String> L = new LinkedListDeque<>();
        LinkedListDeque<String> C = new LinkedListDeque<>();
        L.addFirst("Hello");
        L.addLast("everybody!");
        L.addFirst("I'm Sean,");
        L.addFirst("morning! ");
        L.addFirst("Good ");
        L.addFirst("Good ");
        L.addFirst("Good ");
        L.addFirst("Good ");
//        L.removeFirst();
//        L.removeLast();
        System.out.println(L.isEmpty());
        System.out.println(L.size);
        L.printDeque();
        System.out.print(L.getRecursive(4));
    }
    private class TNode {
        public T item;
        public TNode prev;
        public TNode next;

        public TNode(TNode p, T i, TNode n) {
            prev = p;
            item = i;
            next = n;
        }
    }
    private TNode sentinel;
    private int size;
    public LinkedListDeque() {
        sentinel = new TNode(sentinel, null, sentinel);
        size = 0;
    }
    public void addFirst(T Item) {
        if (size == 0) {
            sentinel.next = new TNode(sentinel, Item, sentinel);
            sentinel.prev = sentinel.next;

        } else {
            sentinel.next = new TNode(sentinel, Item, sentinel.next);
            sentinel.next.next.prev = sentinel.next;
        }
        size += 1;
    }
    public void addLast(T Item) {
        if (size == 0) {
            sentinel.prev = new TNode(sentinel, Item, sentinel);
            sentinel.next = sentinel.prev;
            size += 1;
        } else {
            sentinel.prev = new TNode(sentinel.prev, Item, sentinel);
            sentinel.prev.prev.next = sentinel.prev;
            size += 1;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void printDeque() {
        if (size == 0) {
            System.out.println(sentinel.item);
        } else {
            int i = 0;
            TNode current = sentinel.next;
            System.out.print("\n");
            while (i < size) {
                System.out.print(current.item + "\t");
                current = current.next;
                i += 1;
            }
        }
        System.out.print("\n");
    }
    public T removeFirst() {
        TNode temp = sentinel.next;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
        } else {
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
        }
        size -= 1;
        return temp.item;
    }
    public T removeLast(){
        TNode temp = sentinel.prev;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
        } else {
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next = sentinel;
        }
        size -= 1;
        return temp.item;
    }
    public T get(int index){
        if(index >= size){
            return null;
        }
        else{
            TNode current = sentinel;
            for(int i = 0; i <= index; i ++){
                current = current.next;
            }
            return current.item;
        }
    }
    //⬇️输入开始的node（序号为0的那一个），返回index位置对应的node的item.
    private T RecursiveHelp(TNode start, int index){
        if(index == 0){
            return start.item;
        }
        return RecursiveHelp(start.next, index-1);
    }
    public T getRecursive(int index){
        if(index >= size){
            return null;
        }
        return RecursiveHelp(sentinel.next, index);
    }
}


