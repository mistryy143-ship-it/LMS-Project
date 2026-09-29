public class MemberFactory {
    public static Member createMember(String type) {
        if (type.equalsIgnoreCase("student")) {
            return new Student();
        } else if (type.equalsIgnoreCase("faculty")) {
            return new Faculty();
        }
        return null;
    }
}