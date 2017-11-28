package keys;

import template.KeyRuleTemplate;

public class PQRS extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "P":
			return "7";
		case "Q":
			return "77";	
		case "R":
			return "777";
		case "S":
			return "7777";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "7";
	}

}
