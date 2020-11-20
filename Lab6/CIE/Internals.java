package CIE;
import java.util.Scanner;
public class Internals extends Student {
    Scanner in=new Scanner(System.in);
	public int[] cie=new int[5];
	public void get()
	{
		for(int i=0;i<5;i++){
			System.out.print("Enter cie marks(out of 50) in subject "+(i+1)+" : ");
			cie[i]=in.nextInt();
			while(cie[i]>50||cie[i]<0){
				System.out.println("Enter valid marks!!!");
				System.out.print("Enter the cie marks(out of 50) in subject "+(i+1)+" : ");
				cie[i]=in.nextInt();
			}
		}
	}
}