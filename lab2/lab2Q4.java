/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
class stack{
    int top;
    int n=10;
int  a[]=new int[10];
   stack(){
    top=0;
    }
    void push(int x){
        if(top<n)
    a[top++]=x; //use and increase//
    else
            System.out.println("\nstack overflowed");
    }
    int pop(){
    if(top!=0){
        return a[--top]; //decrease and use//
    }
    else
         System.out.println("\nstack empty");
        return 0;
    }
    void display(){
    int i;
    if(top==-1){
        System.out.println("\nstack empty");
        return;
    }
    else{
         System.out.println("\nContents of stack");
    for(i=top-1;i>=0;i--)
    System.out.println(a[i]);
    }
    }
}
public class lab2Q4 {
      public static void main(String args[]){
      stack s=new stack();
      s.push(6);
      s.push(5);
      s.push(7);
      s.push(9);
      s.push(10);
      s.pop();
      s.pop();
      s.display();
      }
}
