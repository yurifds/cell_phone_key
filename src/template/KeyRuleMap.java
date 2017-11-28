package template;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import keys.ABC;
import keys.DEF;
import keys.Zero;
import keys.GHI;
import keys.JKL;
import keys.MNO;
import keys.PQRS;
import keys.TUV;
import keys.WXYZ;

public class KeyRuleMap {
	
	private static final Map<String, KeyRuleTemplate> textRule = new HashMap<String, KeyRuleTemplate>();
	static {
		
		textRule.put("A", new ABC());
		textRule.put("B", new ABC());
		textRule.put("C", new ABC());
		
		textRule.put("D", new DEF());
		textRule.put("E", new DEF());
		textRule.put("F", new DEF());
		
		textRule.put("G", new GHI());
		textRule.put("H", new GHI());
		textRule.put("I", new GHI());
		
		textRule.put("J", new JKL());
		textRule.put("K", new JKL());
		textRule.put("L", new JKL());
		
		textRule.put("M", new MNO());
		textRule.put("N", new MNO());
		textRule.put("O", new MNO());
		
		textRule.put("P", new PQRS());
		textRule.put("Q", new PQRS());
		textRule.put("R", new PQRS());
		textRule.put("S", new PQRS());
		
		textRule.put("T", new TUV());
		textRule.put("U", new TUV());
		textRule.put("V", new TUV());
		
		textRule.put("W", new WXYZ());
		textRule.put("X", new WXYZ());
		textRule.put("Y", new WXYZ());
		textRule.put("Z", new WXYZ());
		
		textRule.put(" ", new Zero());
	}
	
	public static Map<String, KeyRuleTemplate> getTextrule() {
		return Collections.unmodifiableMap(textRule);
	}	
	
}
