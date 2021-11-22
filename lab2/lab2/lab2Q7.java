class bike{
    int speedlimit=120;
    void run(){
        System.out.println("Speed Limit="+speedlimit);
    }
}
class splendar extends bike{
    int speedlimit=100;
    void run(){
        System.out.println("Speed Limit="+speedlimit);
    }
}
public class lab2Q7 {
    public static void main(String args[]){
        bike c=new splendar();
        c.run();
    }}