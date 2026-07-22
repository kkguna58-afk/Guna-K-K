// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class student {
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("rollno:"+rollno);
        System.out.println("name;"+name);
        System.out.println("dept;"+dept);
        System.out.println("section;"+section);
        System.out.println("year;"+year);
        }    
    }
    public class Main{
    public static void main(String[]args){
        student[]students=new student[3];
    student s1=new student(40,"hari","ece","a",3);
    students[0]=s1;
    student s2=new student(48,"jeni","eee","b",4);
    students[1]=s2;
    students[2]=new student(38,"guna","ece","a",2);
    for (int i=0;1<students.length;i++){
        students[i].display();
        }
    }
    }
        
