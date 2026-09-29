public class Faculty implements Member {
    public void showDetails() {
        System.out.println("Member type: Faculty");
    }
    public int getBookLimit() {
        return 10;
    }
}