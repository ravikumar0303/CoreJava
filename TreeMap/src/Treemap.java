
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	
		public static void main(String[] args) {

			Map<String, Integer> tm = new TreeMap<>();

			tm.put("ravi", 117);
			tm.put("vishal", 57);
			tm.put("pankaj", 114);
			tm.put("neekhil", 49);
			tm.put("shamim", 92);
			tm.put("kapil", 118);
			tm.put("mohil", 120);
      //getting value of any key
			int Valueravi = tm.get("ravi");
			System.out.println("\nValue of Ravi-->"+Valueravi);
			
			System.out.println("\nAll student details--> "+tm.keySet()+"-->"+tm.values());
			System.out.println("\nStudent details-->"+tm);
			
//			remove elements
			tm.remove("mohit");
			
			//Iterating		
			for(String key:tm.keySet()) {
				
				System.out.println("\nstudent key-->"+key+" and value-->"+tm.get(key));
				
				
				
			}
								
			System.out.println("key/value"+tm.entrySet());

			//to replace the value
			tm.replace("ravi", 10);
			tm.replace("vishal", 50);
			System.out.println("\nkey/value updated id-->"+tm);
						
			 
		}

	}



