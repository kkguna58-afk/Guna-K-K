class Student {
    int rollno;
    String name;
    private String dept;
    private String sec;
    int year;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    Student(int rollno, String name, String dept, String sec, int year) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.sec = sec;
        this.year = year;
    }

    void display() {
        System.out.println("rollno:" + rollno);
        System.out.println("name:" + name);
        System.out.println("dept:" + dept);
        System.out.println("sec:" + sec);
        System.out.println("year:" + year);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Student[] Students = new Student[2];
        Students[0] = new Student(101, "Alice", "CSE", "A", 3);
        Students[1] = new Student(102, "Bob", "IT", "B", 3);
        Students[0].setSec("c");
        Students[1].setDept("AIDS");
        for (int i = 0; i < Students.length; i++) {
            Students[i].display();
        }
    }
}
