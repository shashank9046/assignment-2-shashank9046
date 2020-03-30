public class Node5 {
    private int data;
    private Node5 next;
    private Node5 left;
    private Node5 right;
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node5 getNext() {
        return next;
    }
    public void setNext(Node5 next) {
        this.next = next;
    }
    public Node5 getLeft() {
        return left;
    }
    public void setLeft(Node5 left) {
        this.left = left;
    }
    public Node5 getRight() {
        return right;
    }
    public void setRight(Node5 right) {
        this.right = right;
    }
    public Node5(int data){
        //Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
        this.next=null;
    }
    public int getdata() {
        // TODO Auto-generated method stub
        return 0;
    }

}
