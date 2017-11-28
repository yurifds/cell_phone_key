package template;


public abstract class KeyRuleTemplate implements KeyRule {
	
	@Override
	public String addSequenceNumber(String letter,
			String currentKey, 
			String previusKey, 
			StringBuilder sequenceNumber) {
		
		String currentNumber = getNumber(letter);
		
		if (isRepeated(currentKey, previusKey)) 
			sequenceNumber.append("_" + currentNumber);
		else
			sequenceNumber.append(currentNumber);
		
		return getPreviusKey();
	}
	
	
	private boolean isRepeated(String currentKey, 
			String previusKey){
		if(currentKey.equalsIgnoreCase(previusKey)) return true;
		else return false;
	}

	
	public abstract String getNumber(String letter);
	
	public abstract String getPreviusKey();
}
