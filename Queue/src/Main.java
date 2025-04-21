public class Main {
    public static void main(String[] args) throws Exception {
        Queue myQueue = new Queue(1);

        myQueue.printList();
        
        System.out.println();
        
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println();

        myQueue.printList();
        
        System.out.println();
        
        myQueue.dequeue();
        myQueue.printList();
    }
}