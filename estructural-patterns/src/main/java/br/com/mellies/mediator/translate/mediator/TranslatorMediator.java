package br.com.mellies.mediator.translate.mediator;

import br.com.mellies.mediator.translate.model.User;
import br.com.mellies.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
