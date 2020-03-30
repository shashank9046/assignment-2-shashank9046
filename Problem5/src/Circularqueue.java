public class Circularqueue {
    private Node6 front;
    private Node6 rear;
    private int count;

    public Circularqueue(){
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll,int backlog,int a_count){
        Student st = new Student(roll,backlog,a_count);
        Node6 ns = new Node6();
        ns.setStudent(st);

        if(front==null){
            front = ns;
        }
        else{
            rear.setNext(ns);
        }

        rear = ns;
        rear.setNext(front);
        count++;
    }

    public void removeBackLog(){
        while(count-->0){
            Student ss = front.getStudent();
            if((ss.getBacklog()-ss.getA_count())>0){
                front = front.getNext();
                rear = rear.getNext();
            }
            else{
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }
    public void display(){
        Node6 temp = front;
        System.out.println();
        while(temp.getNext()!=front){
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
        System.out.println(temp.getStudent());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circularqueue obj = new Circularqueue();
        obj.enqueue(1,4,0);
        obj.enqueue(2,4,1);
        obj.enqueue(3,4,4);
        obj.enqueue(4,2,1);
        obj.enqueue(5,2,2);
        obj.enqueue(6,0,0);
        obj.removeBackLog();
        obj.display();
    }

}

