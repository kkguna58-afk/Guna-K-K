abstract class animal {
    abstract void sound();
    void sleep(){
        System.out.println("animal is sleeping");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class Main{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
        d.sleep();
    }
}
    
