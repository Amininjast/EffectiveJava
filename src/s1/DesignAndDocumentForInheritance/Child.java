package s1.DesignAndDocumentForInheritance;

class Child extends Parent {

    private String name = "Ali";

    @Override
    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Child();
    }
}
