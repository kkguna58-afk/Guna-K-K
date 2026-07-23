public class multilevel {
    static class Mygrandpa {
        void display() {
            System.out.println("my grandfather is a carpenter");
        }
    }

    static class mydaddy extends Mygrandpa {
        void show() {
            System.out.println("my father is carpenter");
        }
    }

    static class me extends mydaddy {
        void display1() {
            System.out.println("im a web developer");
        }
    }

    public static void main(String[] args) {
        me obj = new me();
        obj.display();
        obj.show();
        obj.display1();
    }
}
