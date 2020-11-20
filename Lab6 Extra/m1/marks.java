package m1;
import java.util.Scanner;

public class marks extends s1.student {
    public marks(String usn,String name,int sem)
    {
        super(usn,name,sem);
    }
    Scanner in = new Scanner(System.in);
	public int[] m=new int[3];
    public void get()
    {
        System.out.print("\n");
		for(int i=0;i<3;i++){
			System.out.print("Enter the marks(out of 100) in subject "+(i+1)+" : ");
			m[i]=in.nextInt();
			while(m[i]>100||m[i]<0){
				System.out.println("Enter valid marks!!!");
				System.out.print("Enter the marks(out of 100) in subject "+(i+1)+" : ");
				m[i]=in.nextInt();
			}
        }
    }
}