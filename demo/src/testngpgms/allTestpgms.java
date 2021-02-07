package testngpgms;

import java.util.HashMap;

import org.testng.annotations.Test;

public class allTestpgms {
  @Test
  public void frequncyOfChar() {
	  String name= "venkateswaraswamy";
	  char[] c= name.toCharArray();
	  HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
	  for(char ch : c) {
		  if(hs.containsKey(ch)) {
			hs.put(ch,hs.get(ch)+1);
		  }
		  else {
			  hs.put(ch, 1);
		  }
		  
	  }
  System.out.println(hs.toString());
  
  
  
  }








}
