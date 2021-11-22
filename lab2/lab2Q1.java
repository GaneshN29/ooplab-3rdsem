import java.util.Scanner;

class result {
int a[][]=new int[10][10];
int b[]=new int[10];
void enter(int n,int det){
	System.out.println("enter the detail of student:");
	System.out.println("Roll.No\t\tsub1\t\tsub2\t\tsub3\t\t");
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<n; i++ ){
		for(int j=0; j<det; j++){
a[i][j]=sc.nextInt();
		}
	}
}
void disp(int n,int det){
	System.out.println("Detail:");
	System.out.println("Roll.No\t\tsub1\t\tsub2\t\tsub3\t\t");
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<n; i++ ){
		for(int j=0; j<det; j++){
System.out.print(a[i][j]+"\t\t");
		}
		System.out.print("\n");
	}
}
void mark(int n,int det){
	int sum;
	for(int i=0; i<n; i++ ){
		sum=0;
		for(int j=1; j<det; j++){
			sum+=a[i][j];
		}
		b[i]=sum;
	}
}
void highsub(int n,int det){
	int max,h;
	for(int j=1; j<det; j++){
max=a[0][j];
h=0;
		for(int i=1; i<n; i++ ){
				if(max<a[i][j]){
					max=a[i][j];
					h=i;
				}
		}
		System.out.println("highest mark in sub "+j+" is "+max+" scored by roll no "+a[h][0]);
	}
}
void high(int n){
	int high=b[0],p=0;
	for(int i=1; i<n; i++ ){
		if(high<b[i]){
			high=b[i];
			p=i;
		}
}
System.out.println("highest total mark is "+high+" scored by roll no "+a[p][0]);
}
}
 class lab2Q1{
	public static void main(String args[]){
		result s=new result();
		int n,det;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of student:");
		n=sc.nextInt();
		System.out.println("Enter the no of sub:");
		det=sc.nextInt();
		det=det+1;
		s.enter(n,det);
		s.disp(n,det);
		s.mark(n,det);
		s.highsub(n,det);
		s.high(n);
	}
}
