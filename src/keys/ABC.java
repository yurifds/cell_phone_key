package keys;

import template.KeyRuleTemplate;

public class ABC extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "A":
			return "2";
		case "B":
			return "22";	
		case "C":
			return "222";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "2";
	}
}
