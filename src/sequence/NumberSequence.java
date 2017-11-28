package sequence;
import template.KeyRule;
import template.KeyRuleMap;
import template.KeyNumberMap;


public class NumberSequence {
	
	public String getSequence(String text) {
		String previusKey="";
		String currentKey="";
		StringBuilder numberSequence = new StringBuilder();
		KeyRule keyRule = null;
		
		for(int i = 0; i < text.length(); i++) {
			String letter = String.valueOf(text.charAt(i)).toUpperCase();
			
			currentKey = KeyNumberMap.getTextkey().get(letter);
			keyRule = KeyRuleMap.getTextrule().get(letter);
			previusKey = keyRule.addSequenceNumber(letter, currentKey, previusKey, numberSequence);
		}
		
		return numberSequence.toString();
	}

}
