import java.util.Random;

public class RandomC {

	public static void main(String[] args) {
		Random random=new Random();
int[] nums= {9,2,3,1};
for(int i=0;i<nums.length;i++)
{
    int j=random.nextInt(i+1);
    System.out.println("i-"+i+" j-"+j);
}
	}

}
