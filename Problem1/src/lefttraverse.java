public class lefttraverse {
    private Node2 root;

    public Node2 getRoot() {
        return root;
    }

    public void setRoot(Node2 root) {
        this.root = root;
    }

    // insert() will add new node to the binary search tree
    public void insert(int data) {
        // Create a new node
        Node2 newNode = new Node2(data);

        // Check whether tree is empty
        if (root == null) {
            root = newNode;

        } else {
            // current node point to root of the tree
            Node2 current = root;
            Node2 parent = null;

            while (current != null) {
                // parent keep track of the parent node of current node.
                parent = current;

                // If data is less than current's data, node will be inserted to the left of
                // tree
                if (newNode.getData() < current.getData()) {
                    current = current.getLeft();

                }
                // If data is greater than current's data, node will be inserted to the right of
                // tree
                else {
                    current = current.getRight();
                }
            }
            if (newNode.getData() < parent.getData()) {
                parent.setLeft(newNode);
            } else {
                parent.setRight(newNode);
            }

        }
    }

    int c=0;
    public int leftchild(Node2 node) {
        // Check whether tree is empty
        if (node == null) {
            return 0;
        }
        else {

            if(node.getLeft()!=null) {
                System.out.println(node.getLeft().getData());
                leftchild(node.getLeft());
                leftchild(node.getRight());
            }
            else {
                c++;
                leftchild(node.getRight());
            }
        }
        return c;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        lefttraverse bt = new lefttraverse();
        // Add nodes to the binary tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);


        System.out.println(bt.leftchild(bt.root));
    }
}