package br.com.mellies.abstractfactory.apple.factory.abstractFactory;

import br.com.mellies.abstractfactory.apple.model.certificate.Certificate;
import br.com.mellies.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
