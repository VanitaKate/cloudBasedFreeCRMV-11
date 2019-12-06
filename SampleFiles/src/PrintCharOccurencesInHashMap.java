import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintCharOccurencesInHashMap {

	static void getCharCountPosition(String inputString) {
		char[] charArray=inputString.toCharArray();
		HashMap <Character,Integer> HS=new HashMap <Character,Integer>();
		for (char c: charArray) {
						
			if (HS.containsKey(c)) {
				//System.out.println(HS.get(c));
				HS.put(c,HS.get(c)+1);
				
			}
			else {
				HS.put(c, 1);
			}
			
		}
		for (Map.Entry entry: HS.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String");
		String inputString=sc.nextLine();
		getCharCountPosition(inputString);

	}

}
