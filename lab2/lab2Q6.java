class game{
    void type(){
        System.out.println("Indoor & Outdoor games.");
    }
}
class cricket extends game{
    void type(){
        System.out.println("Cricket is an Outdoor game.");
    }
}
class chess extends game{
    void type(){
        System.out.println("Chess is an Indoor game.");
    }
}
public class lab2Q6 {
    public static void main(String args[]){
      game c=new game();
      c.type();
      c=new cricket();
      c.type();
      c=new chess();
      c.type();
    }}