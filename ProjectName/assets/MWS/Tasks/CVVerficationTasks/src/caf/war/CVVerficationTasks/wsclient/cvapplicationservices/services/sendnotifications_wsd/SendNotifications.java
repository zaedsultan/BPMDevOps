package caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.sendNotifications.
 */
@ManagedBean(name = "SendNotifications")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class SendNotifications extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 7649784996956199936L;
	
	/**
	 * Constructor
	 */
	public SendNotifications() {
		super(caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.class,  // port type proxy class
			"sendNotifications", // method to invoke
			new String[] { "sendNotifications", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 235943218251765760L;
		
		public Parameters() {
		}
	
	  
		private caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.SendNotificationsE sendNotifications  = new  caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.SendNotificationsE() ;

		public caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.SendNotificationsE getSendNotifications() {
			return sendNotifications;
		}

		public void setSendNotifications(caf.war.CVVerficationTasks.wsclient.cvapplicationservices.services.sendnotifications_wsd.CvapplicationServicesServicesSendNotifications_WSDStub.SendNotificationsE sendNotifications) {
			this.sendNotifications = sendNotifications;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	
}