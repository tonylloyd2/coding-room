package array;
import java.util.Scanner; 
public class Summingupelementsinanarray {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name[]=new String[5];
		int marks[][]=new int[5][5];
		int i,j,k=100,total=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++) 
		   {
			marks[i][j]=k; 
			total+=marks[i][j];
			
			System.out.println(total);
			} 
	    }
		j=0;
		for(int col=0;col<=i;col++)
		  {
			int sum=0;
			for(int rows = 0;rows<=i;rows++) 
			  {
				sum+=marks[rows][col];
						System.out.println(sum);
			  }
		  }
	}

}
