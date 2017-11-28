package keys;

import template.KeyRuleTemplate;

public class WXYZ extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "W":
			return "9";
		case "X":
			return "99";	
		case "Y":
			return "999";	
		case "Z":
			return "9999";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "9";
	}

}
