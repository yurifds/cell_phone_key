package keys;

import template.KeyRuleTemplate;

public class JKL extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case "J":
			return "5";
		case "K":
			return "55";	
		case "L":
			return "555";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "5";
	}

}
