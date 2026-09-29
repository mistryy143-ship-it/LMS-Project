public class FactoryDemo {
    public static void main(String[] args) {
        Member m1 = MemberFactory.createMember("student");
        Member m2 = MemberFactory.createMember("faculty");

        m1.showDetails();
        System.out.println("Book limit: " + m1.getBookLimit());

        m2.showDetails();
        System.out.println("Book limit: " + m2.getBookLimit());
    }
}