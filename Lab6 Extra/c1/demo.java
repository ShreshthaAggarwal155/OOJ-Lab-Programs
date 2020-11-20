import s1.*;
import m1.*;
import java.util.Scanner;
 class demo {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter the number of students : ");
		 int n=in.nextInt();
		 m1.marks ob[]=new m1.marks[n];
		for(int i=0;i<n;i++)
		 {
			System.out.println("\nEnter the Details of student"+(i+1));
			System.out.print("Enter the USN : ");
			String u=in.next();
			System.out.print("Enter the name : ");
			String na=in.next();
			System.out.print("Enter the Semester : ");
			int se=in.nextInt();
			ob[i]=new m1.marks(u,na,se);
			ob[i].get();
		 }   
		for(int i=0;i<n;i++)
			 {
				 System.out.println("Marks of student "+(i+1)+" are");
				 for(int j=0;j<3;j++)
				 {
				   System.out.println("Subject "+(j+1)+" : "+(ob[i].m[j]));
				 }
			 }   
	}
}