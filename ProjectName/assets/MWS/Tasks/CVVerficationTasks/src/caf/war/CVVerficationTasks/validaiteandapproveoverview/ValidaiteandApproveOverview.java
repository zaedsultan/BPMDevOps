/**
 * 
 */
package caf.war.CVVerficationTasks.validaiteandapproveoverview;

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

@ManagedBean(name = "ValidaiteandApproveOverview")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ValidaiteandApproveOverview", beanType = BeanType.PORTLET)
public class ValidaiteandApproveOverview  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private transient caf.war.CVVerficationTasks.Cvverficationtasks cvverficationtasks = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"taskID", "cancelUrl", "finishUrl", "currentTab"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public ValidaiteandApproveOverview() {
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
	public String getTaskID() throws Exception {
		return (String) getPreferenceValue("taskID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setTaskID(String taskID) throws Exception {
		setPreferenceValue("taskID", taskID);
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getCancelUrl() throws Exception {
		return (String) getPreferenceValue("cancelUrl", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCancelUrl(String cancelUrl) throws Exception {
		setPreferenceValue("cancelUrl", cancelUrl);
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getFinishUrl() throws Exception {
		return (String) getPreferenceValue("finishUrl", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setFinishUrl(String finishUrl) throws Exception {
		setPreferenceValue("finishUrl", finishUrl);
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getCurrentTab() throws Exception {
		return (String) getPreferenceValue("currentTab", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCurrentTab(String currentTab) throws Exception {
		setPreferenceValue("currentTab", currentTab);
	}
}