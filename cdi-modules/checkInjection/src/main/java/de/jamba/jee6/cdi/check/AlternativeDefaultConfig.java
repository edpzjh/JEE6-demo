/**
 *
 */
package de.jamba.jee6.cdi.check;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

import de.jamba.jee6.api.Country;
import de.jamba.jee6.api.ServerConfiguration;

/**
 * @author dstrauss
 *
 */
@Alternative
@Named("default")
public class AlternativeDefaultConfig implements ServerConfiguration {

	/**
	 *
	 */
	public AlternativeDefaultConfig() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.jamba.jee6.api.ServerConfiguration#getDefaultCountry()
	 */
	@Override
	public Country getDefaultCountry() {
		return Country.DE;
	}

}
