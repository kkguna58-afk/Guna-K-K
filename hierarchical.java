class mydaddy {
    void display() {
        System.out.println("my father is a farmer");
    }
}

class mysister extends mydaddy {
    void show() {
        System.out.println("my sister is a teacher");
    }
}

class me extends mydaddy {
    void display1() {
        System.out.println("i am a web developer");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        me obj = new me();
        obj.display();

        obj.display1();
    }
}
