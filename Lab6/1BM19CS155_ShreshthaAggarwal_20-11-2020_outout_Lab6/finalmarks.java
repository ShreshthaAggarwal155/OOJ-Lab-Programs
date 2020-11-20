import CIE.*;
import SEE.*;
import java.util.Scanner;
 class finalmarks {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		 System.out.print("Enter the number of students : ");
		 int n=in.nextInt();
		 SEE.Externals ob1[]=new SEE.Externals[n];
		 CIE.Internals ob[]=new  CIE.Internals[n];
		for(int i=0;i<n;i++)
		 {
			System.out.println("\nEnter the Details of student"+(i+1));
			System.out.print("Enter the USN : ");
			String u=in.next();
			System.out.print("Enter the name : ");
			String na=in.next();
			System.out.print("Enter the Semester : ");
			int se=in.nextInt();
			ob[i]=new CIE.Internals();
			ob[i].get();
			ob1[i]=new SEE.Externals(u,na,se);
			ob1[i].get();
		 }   
		for(int i=0;i<n;i++)
			 {
				 System.out.println("Total marks of student "+(i+1)+" are");
				 for(int j=0;j<5;j++)
				 {
				   System.out.println("Subject "+(j+1)+" : "+(ob[i].cie[j]+ob1[i].see[j]));
				 }
			 }   
	}
}