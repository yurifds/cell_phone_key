package keys;

import template.KeyRuleTemplate;

public class TUV extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "T":
			return "8";
		case "U":
			return "88";	
		case "V":
			return "888";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "8";
	}

}
