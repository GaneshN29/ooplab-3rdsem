class sq{
    int square(int a){
        return a*a;
    }
    double square(double b){
        return b*b;
    }}
    public class lab2Q5 {
        public static void main(String args[]){
            sq s=new sq();
    System.out.println("Square of 3 is "+s.square(3));
    System.out.println("Square of 0.2 is "+s.square(0.2));
        }
    }