class Mygrandpa{
    void display(){
        System.out.println("my grandfather is a carpenter");
    }
}
class mydaddy extends Mygrandpa{
    void show(){
        System.out.println("my father is carpenter");
    }
}
class me extends mydaddy{
    void display(){
        System.out.println("im a web developer");
        
    }
}
public class inheritance{
    public static void main(String[]arg){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display();
    }
}
    
