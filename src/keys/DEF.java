package keys;

import template.KeyRuleTemplate;

public class DEF extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "D":
			return "3";
		case "E":
			return "33";	
		case "F":
			return "333";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "3";
	}

}
