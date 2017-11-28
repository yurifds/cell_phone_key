package keys;

import template.KeyRuleTemplate;

public class Zero extends KeyRuleTemplate {

	@Override
	public String getNumber(String letter) {
		switch (letter) {
		case " ":
			return "0";	
		default:
			return null;
		}
	}

	@Override
	public String getPreviusKey() {
		return "0";
	}

}
