class Parent {
    public Parent() {
        System.out.println("Parent class constructor invoked");
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child class constructor invoked");
    }
}

public class que2 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}