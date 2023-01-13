/**
 * 
 */
package caf.war.CVVerficationTasks.validaiteandapprovestart;

/**
 * @author y509163
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "ValidaiteandApproveStart")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ValidaiteandApproveStart", beanType = BeanType.PORTLET)
public class ValidaiteandApproveStart  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private transient caf.war.CVVerficationTasks.Cvverficationtasks cvverficationtasks = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"returnUrl"
	};
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public ValidaiteandApproveStart() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.CVVerficationTasks.Cvverficationtasks getCvverficationtasks()  {
		if (cvverficationtasks == null) {
		    cvverficationtasks = (caf.war.CVVerficationTasks.Cvverficationtasks)resolveExpression("#{Cvverficationtasks}");
		}
		return cvverficationtasks;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getReturnUrl() throws Exception {
		return (String) getPreferenceValue("returnUrl", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setReturnUrl(String returnUrl) throws Exception {
		setPreferenceValue("returnUrl", returnUrl);
	}
}