import java.util.Scanner;
public class SecondAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s, mS = null, de;
		int l, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a sentence: ");
		s = sc.nextLine();
		System.out.print("Give me characters to delete: ");
		de = sc.nextLine();
		l = de.length();
		mS = s;
		for(i=0; i<l; i++) mS = mS.replace(""+de.charAt(i), "");
		System.out.println("Original sentence: "+s);
		System.out.println("Modified sentence: "+mS);
		
	}

}
