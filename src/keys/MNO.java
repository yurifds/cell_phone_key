package keys;

import template.KeyRuleTemplate;

public class MNO extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "M":
			return "6";
		case "N":
			return "66";	
		case "O":
			return "666";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "6";
	}

}
