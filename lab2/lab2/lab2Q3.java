/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author student
 */
class obj{
   public int a;
   public obj(int a){ this.a = a;}
}
class swap{
void swapv(int a,int b){
     System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
int temp;
temp=a;
a=b;
b=temp;
 System.out.println("After swapping(Inside), a = " + a + " b = " + b);
}
void swapr(obj a,obj b){
     System.out.println("Before swapping(Inside), c = " + a.a + " e = " + b.a);
obj temp;
temp=new obj(a.a);
a.a=b.a;
b.a=temp.a;
 System.out.println("After swapping(Inside), c = " + a.a + " e = " + b.a);
}
}
public class lab2Q3 {
     public static void main(String args[]){
    swap s=new swap();
     System.out.println("\nSwap two values using call by value:");
      int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		int b;
		System.out.print("Enter b: ");
		b = sc.nextInt();
      System.out.println("Before swapping: a = " + a + " and b = " + b);
      s.swapv(a, b);
      System.out.println("After swapping : a = " + a + " and b is " + b);
      System.out.println("\nSwap two values call by reference.:");
      
      int c;
		System.out.print("Enter c: ");
		c = sc.nextInt();

		int e;
		System.out.print("Enter e: ");
		e = sc.nextInt();
                obj i=new obj(c);
                 obj o=new obj(e);
       System.out.println("Before swapping, c = " + i.a + " and e = " + o.a);
      s.swapr(i, o);
      System.out.println("After swapping, c = " + i.a + " and e is " + o.a);
     }
}
