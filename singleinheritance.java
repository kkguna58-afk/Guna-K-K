class Parent {
    void display() {
        System.out.println("this is the parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("this is the child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        Parent Obj = new Parent();
        Obj.display();
        obj.show();
    }
}
