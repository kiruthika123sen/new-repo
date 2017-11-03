

package list;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*public class Map1 
{

	public static void main(String[] args) {
		String text="AMAZON";
		char[] character= text.toCharArray();
		
		for(char c:character)
		{
		System.out.println(c);

	}
  Map<Character,Integer> company=new LinkedHashMap<Character,Integer>();
  
  for(Entry<Character,Integer> comp:company.entrySet())
  {
  System.out.println("the key is"+comp.getKey()+"thevalue is"+comp.getValue());
  
  
}company.containsKey('A');
company.put('A', 1);
company.put('M', 1);
company.put('A', 1);
company.put('Z', 1);
company.put('O', 1);
company.put('N', 1);


  }
}
*/
/*public Map findDuplicateString(String str) 
{
    String[] stringArrays = str.split(" ");
    Map<String, Integer> map = new HashMap<String, Integer>();
    Set<String> words = new HashSet<String>(Arrays.asList(stringArrays));
    int count = 0;
    for (String word : words) {
        for (String temp : stringArrays) {
            if (word.equals(temp)) {
                ++count;
            }
        }
        map.put(word, count);
        count = 0;
    }

    return map;

}*/

/*public class Map1{

    public static void main(String args[])
{
    	

    	String text="AMAZON";
		char character[]= text.toCharArray();
   // String[] stringArrays = str.split(" ")
	
    Map<Character,Integer> company=new LinkedHashMap<Character,Integer>();
  Set<Character[]> words = new HashSet<Character[]>(Arrays.asList(text));
    int count = 0;
    for (Character word : words) {
        for (String temp : text) {
            if (word.equals(temp)) {
                ++count;
            }
        }
        company.put(word, count);
        count = 0;
    }

    return map;

}
*/




//output
public class Map1{

    public static void main(String args[]) {
    	
    	String text="AMAZON";
		char character[]= text.toCharArray();

    //    String value = "AMAZON";

      //  String item[] = value.split(" ");

        HashMap<Character, Integer> map = new HashMap<Character,Integer>();

        for (char t : character) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}





/*
public static void main1(String[] args) {
	String text="AMAZON";
	char[] character= text.toCharArray();
	
  Map<Character,Integer> company=new LinkedHashMap<Character,Integer>();
Set<String> words = new HashSet<String>(Arrays.asList(text));
int count = 0;
for (String word : words) {
    for (String temp : text) {
        if (word.equals(temp)) {
            ++count;
        }
    }
    map.put(word, count);
    count = 0;
}

return map;

}*/