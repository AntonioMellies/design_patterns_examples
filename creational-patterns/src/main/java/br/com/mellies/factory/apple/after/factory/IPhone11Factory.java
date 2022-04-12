package br.com.mellies.factory.apple.after.factory;

import br.com.mellies.factory.apple.after.model.IPhone;
import br.com.mellies.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
