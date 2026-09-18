package s1.staticFactoryMethod;

public class User {
    private String name;
    private User(){}
    private User(String name){
        this.name = name;
    }
    public static User create(String name) throws IllegalAccessException {
        if (name == null || name.isEmpty()){
            throw new IllegalAccessException();
        }
        return new User(name);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = User.create("Ali");
        System.out.println(user.getName());
    }
}

