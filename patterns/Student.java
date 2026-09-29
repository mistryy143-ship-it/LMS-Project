public class Student implements Member {
    public void showDetails() {
        System.out.println("Member type: Student");
    }
    public int getBookLimit() {
        return 3;
    }
}