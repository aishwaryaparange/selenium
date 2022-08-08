
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logic to split string
		String s="Aishwarya saying Rohan is smart but I am not";
		String[] splittedString=s.split(" ");
		for(int i=0;i<splittedString.length;i++)
		{
			System.out.println(splittedString[i].trim());
		}
		
		//Split string from I
		String[] splittedString1=s.split("I");
		for(int i=0;i<splittedString.length;i++)
		{
			System.out.println(splittedString1[i].trim());
		}
		
		String s1="Rohan";
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		//Print string in reverse order
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
	}


}
