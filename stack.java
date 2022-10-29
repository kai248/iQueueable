public class stack implements IQueuable{
    
    private int top;
    private String arr[];
    private int maximum;
    
    // constructor
    public stack(int size) {
        arr = new String[size];
        maximum = size;
        top = -1;
    }

    // adds value to stack and returns new stack
    @Override
    public void enQueue(String value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        // System.out.println("\nInsert " + value);
        arr[++top] = value;
        getQueue();
    }

    // removes item from stack, and returns the item removed
    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return "No item to pop";
        }
        //System.out.println("\nItem popped: " + arr[top]);
        return arr[top--];
    }

    // returns a list of all the items in the stack
    @Override
    public void getQueue() {
        for (int n = 0; n <= top; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.print("\n");
    }

    // returns the number of items in the stack
    @Override
    public int size() {
        // System.out.println("\nSize: " + (top+1));
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == maximum - 1;
    }

  public static void main(String[] args) {
        stack s = new stack(5);
        s.enQueue("a");
        s.enQueue("b");
        s.enQueue("c");
        s.enQueue("d");
        s.enQueue("e");
        s.enQueue("f"); // test overflow
        s.getQueue();
        System.out.println("Size: " + s.size()); // test size   
        System.out.println("Item popped: "+ s.deQueue());
        s.getQueue();
        System.out.println("Item popped: "+ s.deQueue());
        s.getQueue();
        System.out.println("Item popped: "+ s.deQueue());
        s.getQueue();
        System.out.println("Item popped: "+ s.deQueue());
        s.getQueue();
        System.out.println("Item popped: "+ s.deQueue());
        s.getQueue();
        System.out.println("Item popped: "+ s.deQueue()); // test popping empty stack
        System.out.println("Size: " + s.size()); // test size 
  }
    
}
