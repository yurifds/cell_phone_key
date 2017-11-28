package keys;

import template.KeyRuleTemplate;

public class GHI extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "G":
			return "4";
		case "H":
			return "44";	
		case "I":
			return "444";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "4";
	}

}
