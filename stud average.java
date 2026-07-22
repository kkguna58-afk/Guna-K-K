class student {

    int rollno;
    String name;
    String dept;
    String section;
    int year;

    student(int rollno, String name, String dept, String section, int year) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }

    void display() {
        System.out.println("rollno:" + rollno);
        System.out.println("name;" + name);
        System.out.println("dept;" + dept);
        System.out.println("section;" + section);
        System.out.println("year;" + year);
    }
}

class marks {
    int tamil, english, maths, science, social;

    marks(int tamil, int english, int maths, int science, int social) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }

    int total() {
        return tamil + english + maths + science + social;
    }

    double average() {
        return total() / 5.0;
    }
}

public class stud {
    public static void main(String[] args) {
        student[] student = new student[2];
        marks[] marks = new marks[2];

        student[0] = new student(40, "hari", "ece", "a", 3);
        marks[0] = new marks(55, 65, 75, 85, 95);
        student[1] = new student(48, "guna", "eee", "b", 4);
        marks[1] = new marks(50, 60, 70, 80, 90);
        for (int i = 0; i < student.length; i++) {
            System.out.println("Rollno:" + student[i].rollno);
            System.out.println("name:" + student[i].name);
            System.out.println("section:" + student[i].section);
            System.out.println("dept:" + student[i].dept);
            System.out.println("year:" + student[i].year);

            System.out.println("tamil:" + marks[i].tamil);
            System.out.println("english:" + marks[i].english);
            System.out.println("maths:" + marks[i].maths);
            System.out.println("science:" + marks[i].science);
            System.out.println("social:" + marks[i].social);

            System.out.println("total:" + marks[i].total());
            System.out.println("average:" + marks[i].average());
            System.out.println();
        }
    }
}
