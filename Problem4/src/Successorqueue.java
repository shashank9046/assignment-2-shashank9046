public class Successorqueue {
    private Node5 root;
    // a field to refer rear end of queue
    private Node5 rear;
    // a field to refer front end of queue
    private Node5 front;
    private int size;// total number of elements in the queue

    // constructor
    public Successorqueue() {
        front = null;
        rear = null;
        size = 0;
        root = null;
    }
    //insert() will add new node to the binary search tree
    public void insert(int data) {
        //Create a new node
        Node5 newNode = new Node5(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            Node5 current = root;
            //current node point to root of the tree
            Node5 parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if(data < current.getData()) {
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.getRight();
                    if(current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }
    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public void preSuccessor(Node5 root){
        if(root == null)    return;
        else{
            enqueue(root.getData());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

    // a method to add a new element in queue
    public void enqueue(int element) {
        Node5 node = new Node5(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    public void traverse() {
        if (front == null) {
            System.out.println("empty queue");
        } else {
            Node5 temp = front;
            while (temp != null) {
                System.out.print(temp.getData() + "  ");
                temp = temp.getNext();
            }


        }
    }

    // a method to get front element without removing it
    public Node5 peek() {
        Node5 response = null;
        if (!isEmpty()) {
            response = new Node5(front.getData());
        }
        return response;
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }
    public void inorderTraversal(Node5 node) {

        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.getLeft()!= null)
                inorderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            if(node.getRight()!= null)
                inorderTraversal(node.getRight());

        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Successorqueue bt = new Successorqueue();
        //Add nodes to the binary tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        System.out.println("here is binary search tree ");
        bt.inorderTraversal(bt.root);
        System.out.println(" ");
        System.out.println("here is presuccessor :");
        bt.preSuccessor(bt.root);
        bt.traverse();
    }

}


