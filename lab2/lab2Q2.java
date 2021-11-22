
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

class arr{
    int n=10;
int a[]=new int[n];
int i;
void add(){
    System.out.println("Enter the array:");
    Scanner sc=new Scanner(System.in);
    for(i=0; i<n; i++){
        a[i]=sc.nextInt();
    }
}
void display(){
     System.out.println("Element of array:");
    for(i=0; i<n; i++){
     System.out.print(a[i]+" ");
    }
     System.out.print("\n");
}
void larg(){
int large=a[0];
for(i=1; i<n; i++){
    if(large<a[i]){
    large=a[i];
    }
    }
 System.out.println("Largest element in array: "+large);
}
void avg(){
int sum=0;
for(i=0; i<n; i++){
     sum+=a[0];
    }
System.out.println("Average of the array: "+(sum/n));
}
void sort(){
    int temp;
for(i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
    if(a[i]>a[j]){
        temp=a[j];
    a[j]=a[i];
    a[i]=temp;
    }
}}
    System.out.println("The array in ascending order:");
    for(i=0; i<n; i++){
     System.out.print(a[i]+" ");
    }
    System.out.print("\n");
}
}
public class lab2Q2 {
    public static void main(String args[]){
    arr s=new arr();
    s.add();
    s.display();
    s.larg();
    s.avg();
    s.sort();
    }
}
