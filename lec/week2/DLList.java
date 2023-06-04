public class DLList<NEKO> {
    public static void main(String[] args){
        DLList<String> L = new DLList<>("morugana");
        L.addFirst("amemiya");
        L.addLast("futaba");
        L.size();
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
    private class NEKONode {
        public NEKO item;
        public NEKONode next;
        public NEKONode prev;
        public NEKONode(NEKONode p, NEKO i, NEKONode n){
            prev = p;
            item = i;
            next = n;
        }
    }
    
    private NEKONode sentinel;
    private int size;
    
    public DLList(){
        sentinel = new NEKONode(sentinel, null, sentinel);
        size = 0;
    }
    public DLList(NEKO x){
        sentinel = new NEKONode(sentinel, null, sentinel);
        sentinel.next = new NEKONode(sentinel, x, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }
    public void addFirst(NEKO x){
        sentinel.next = new NEKONode(sentinel, x, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }
    public void addLast(NEKO x){
        sentinel.prev = new NEKONode(sentinel.prev,x,sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size += 1;
    }
    public NEKO getFirst(){
        return sentinel.next.item;
    }
    public int size(){
        return size;
    }
}