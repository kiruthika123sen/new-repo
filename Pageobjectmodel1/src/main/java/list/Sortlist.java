package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Sortlist {

	public static void main(String[] args)
	{
/*		String[] companys={"TCS","INFOSYS","VERIZON"};
		System.out.println("array "+companys[0]);
		
		Arrays.sort(companys);
	for(String company: companys)
	{
		System.out.println(company);
	}
	*/
		//LIst
/*List<String> companys=new ArrayList<String>();
companys.add("TCS");
companys.add("INFOSYS");
companys.add("VERIZON");
	Collections.sort(companys);
	for(String company : companys)
	{
		System.out.println(company);
	}*/
	
		
		
		//Set
		
		Set<String> companys=new LinkedHashSet<String>();
		companys.add("INFOSYS");
		companys.add("VERIZON");
		companys.add("TCS");
		
	//	Collections.sort(companys);
		for(String company : companys)
		{
			System.out.println(company);
		}
		
		//set-->tree
		
	/*	Set<String> companys1=new TreeSet<String>();
		companys.add("TCS");
		companys.add("INFOSYS");
		companys.add("VERIZON");
		
	//	Collections.sort(companys);
		for(String company : companys1)
		{
			System.out.println(company);
		}
		
		*/
		
	}

}
