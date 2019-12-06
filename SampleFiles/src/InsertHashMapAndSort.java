import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class InsertHashMapAndSort {

	static void InsertHashMapAndSort() {
		HashMap<String,Integer> EmpIDHSMap=new HashMap<String,Integer>();
		EmpIDHSMap.put("Jeorge",2945);
		EmpIDHSMap.put("Sean",2955);
		EmpIDHSMap.put("Victor",2965);
		EmpIDHSMap.put("Scott D.",2995);
		EmpIDHSMap.put("Scott P.",2967);
		EmpIDHSMap.put("Lucy",2975);
		EmpIDHSMap.put("Lunda",2947);
		
		TreeMap<String,Integer> EmpIDSorted=new TreeMap<String,Integer>();
		EmpIDSorted.putAll(EmpIDHSMap);
		for(Map.Entry<String,Integer> entry: EmpIDSorted.entrySet()) {
			System.out.println("Key is: " +entry.getKey() +"  Value is:" +entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 InsertHashMapAndSort();
	}

}
