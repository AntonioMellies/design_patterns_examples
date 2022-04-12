package br.com.mellies.abstractfactory.app.service.factory;

import br.com.mellies.abstractfactory.app.service.services.CarService;
import br.com.mellies.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
