import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,6,10,50};
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				System.out.println(arr[j]);
			}
		}
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rohan");
		a.add("Aishu");
		a.add("Parange");
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
