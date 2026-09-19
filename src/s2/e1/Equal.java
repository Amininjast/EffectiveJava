package s2.e1;

public class Equal {
    private String name;
    private int age;

    public Equal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Equal p1 = new Equal("Ali", 30);
        Equal p2 = new Equal("Ali", 30);
        Equal p3 = new Equal("Ali", 31);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(null));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Equal)) return false;
        Equal user = (Equal) obj;
        if (user.name == this.name && user.age == this.age) return true;
        return false;
    }
}
