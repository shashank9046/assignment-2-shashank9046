public class Student {
    private int roll;
    private int a_count;
    private int backlog;

    public Student(int roll, int backlog, int a_count) {
        this.roll = roll;
        this.a_count = a_count;
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", backlog=" + backlog + ", a_count=" + a_count + '}';
    }

    public int getRoll() {
        return roll;
    }

    public int getA_count() {
        return a_count;
    }

    public int getBacklog() {
        return backlog;
    }
}
