package SEE;
import java.util.Scanner;

public class Externals extends CIE.Student {
    public Externals(String usn,String name,int sem)
    {
        super(usn,name,sem);
    }
    Scanner in = new Scanner(System.in);
	public int[] see=new int[5];
    public void get()
    {
        System.out.print("\n");
		for(int i=0;i<5;i++){
			System.out.print("Enter the see marks(out of 100) in subject "+(i+1)+" : ");
			see[i]=in.nextInt();
			while(see[i]>100||see[i]<0){
				System.out.println("Enter valid marks!!!");
				System.out.print("Enter the see marks(out of 100) in subject "+(i+1)+" : ");
				see[i]=in.nextInt();
			}
        }
    }
}