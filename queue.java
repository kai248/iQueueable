public class queue implements IQueuable {

    private int front, rear; // pointers
    private int cap;
    private String arr[];
  
    // constructor
    public queue(int size) {
        cap = size;
        arr = new String[size];
        front = 0;
        rear = 0;
    }

    // adds value to queue and returns new queue
    @Override
    public void enQueue(String value){
        // check for queue overflow
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
          arr[rear] = value;
          rear++;
        }
        // System.out.println("Inserted " + value);
        getQueue();
    };

    // removes item from queue, and returns the item removed
    @Override
    public String deQueue(){
        String item;
        if (isEmpty()) {
          System.out.println("Queue is empty");
          return "No item to remove";
        } else {
            item = arr[0];
            for (int i = 0; i < rear - 1; i++) {
              arr[i] = arr[i + 1];
            }
            // empty rear element of queue
            arr[rear-1] = "";
            rear--;
          }
        return item;
    };

    // returns a list of all the items in the queue
    @Override
    public void getQueue(){
        for (int n = 0; n < rear; n++){
            System.out.print(arr[n]+ " ");     
        }
        System.out.print("\n");  
    };

    // returns the number of items in the queue
    @Override
    public int size(){
        return rear;
    };
    
    // check if queue is empty
    public boolean isEmpty(){
        if (front == rear)
            return true;
        else
            return false;
    }

    // check if queue is full
    public boolean isFull() {
        if (cap == rear) {
          return true;
        }
        return false;
      }
    
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enQueue("a");
        q.enQueue("b");
        q.enQueue("c");
        q.enQueue("d");
        q.enQueue("e");
        q.enQueue("f"); // test overflow
        System.out.println("Size: " + q.size()); // test size
        System.out.println("Item removed: "+ q.deQueue());
        q.getQueue();
        System.out.println("Item removed: "+ q.deQueue());
        q.getQueue();
        System.out.println("Item removed: "+ q.deQueue());
        q.getQueue();
        System.out.println("Item removed: "+ q.deQueue());
        q.getQueue();
        System.out.println("Item removed: "+ q.deQueue());
        q.getQueue();
        System.out.println("Item removed: "+ q.deQueue()); // test dequeueing empty queue
        System.out.println("Size: " + q.size()); // test size
    }
}


