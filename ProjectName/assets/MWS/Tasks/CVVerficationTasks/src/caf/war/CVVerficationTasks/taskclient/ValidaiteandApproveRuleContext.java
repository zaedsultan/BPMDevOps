package caf.war.CVVerficationTasks.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "ValidaiteandApproveRuleContext")
@SessionScoped
@DTManagedBean(displayName = "Validaiteand Approve Rule Context", beanType = BeanType.DEFAULT)
public class ValidaiteandApproveRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {

	private transient caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.SendNotifications sendNotifications = null;
	private static final String[][] SENDNOTIFICATIONS_PROPERTY_BINDINGS = new String[][] {
		{"#{sendNotifications.authCredentials.authenticationMethod}", "1"},
		{"#{sendNotifications.authCredentials.requiresAuth}", "true"},
		{"#{sendNotifications.autoRefresh}", "false"},
	};
	public caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.SendNotifications getSendNotifications()  {
		if (sendNotifications == null) {
		    sendNotifications = (caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.SendNotifications)resolveExpression("#{SendNotifications}");
		}
	
	    resolveDataBinding(SENDNOTIFICATIONS_PROPERTY_BINDINGS, sendNotifications, "sendNotifications", false, false);
		return sendNotifications;
	}
}