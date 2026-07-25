public class department {
    static class college {
        void dept() {
            System.out.println("welcome to excel engineering college");
        }
    }

    static class cse extends college {
        @Override
        void dept() {
            System.out.println("welcome to computer science dept");
        }
    }

    static class ece extends college {
        @Override
        void dept() {
            System.out.println("welcome to electronic and communication");
        }
    }

    static class ai_ds extends college {
        @Override
        void dept() {
            System.out.println("welcome to ai and data science dept");
        }
    }

    public static void main(String[] args) {
        college c = new cse();
        c.dept();
        college d = new ece();
        d.dept();
        college e = new ai_ds();
        e.dept();
    }
}
