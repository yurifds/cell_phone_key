package template;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeyNumberMap {
	private static final Map<String, String> textKey = new HashMap<String, String>();
	
	static {
		
		textKey.put("A", "2");
		textKey.put("B", "2");
		textKey.put("C", "2");
		
		textKey.put("D", "3");
		textKey.put("E", "3");
		textKey.put("F", "3");
		
		textKey.put("G", "4");
		textKey.put("H", "4");
		textKey.put("I", "4");
		
		textKey.put("J", "5");
		textKey.put("K", "5");
		textKey.put("L", "5");
		
		textKey.put("M", "6");
		textKey.put("N", "6");
		textKey.put("O", "6");
		
		textKey.put("P", "7");
		textKey.put("Q", "7");
		textKey.put("R", "7");
		textKey.put("S", "7");
		
		textKey.put("T", "8");
		textKey.put("U", "8");
		textKey.put("V", "8");
		
		textKey.put("W", "9");
		textKey.put("X", "9");
		textKey.put("Y", "9");
		textKey.put("Z", "9");
		
		textKey.put(" ", "0");
	}
	
	public static Map<String, String> getTextkey() {
		return Collections.unmodifiableMap(textKey);
	}
}
