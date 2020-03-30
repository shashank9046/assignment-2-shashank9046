public class Node2 {
    private int data;
    private Node2 left;
    private Node2 right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getLeft() {
        return left;
    }

    public void setLeft(Node2 left) {
        this.left = left;
    }

    public Node2 getRight() {
        return right;
    }

    public void setRight(Node2 right) {
        this.right = right;
    }

    public Node2(int data) {
        // Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
