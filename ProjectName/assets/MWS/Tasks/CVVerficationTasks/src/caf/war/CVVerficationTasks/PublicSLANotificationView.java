package caf.war.CVVerficationTasks;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "PublicSLANotificationView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "PublicSLANotification", beanType = BeanType.PAGE)
public class PublicSLANotificationView extends com.webmethods.caf.faces.bean.BasePortletPageBean {


	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove currentTask = null;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove oldTask = null;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove newTask = null;
	private com.webmethods.caf.faces.data.task.TaskCommentsListProvider currentTaskComments = null;
	
	public com.webmethods.caf.faces.data.task.TaskCommentsListProvider getCurrentTaskComments() {
		if (currentTaskComments == null) {
			currentTaskComments = (com.webmethods.caf.faces.data.task.TaskCommentsListProvider) getBean("comments");
		}
		
		return currentTaskComments;
	}
	
	/**
	 * @wm.caf.managedbeanname=ValidaiteandApprove
	 */
	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getCurrentTask() {
		if (currentTask == null) {
			currentTask = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)getBean("currentTask");
		}
		return currentTask;
	}

	/**
	 * @wm.caf.managedbeanname=ValidaiteandApprove
	 */
	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getOldTask() {
		if (oldTask == null) {
			oldTask = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)getBean("oldTask");
		}
		return oldTask;
	}

	/**
	 * @wm.caf.managedbeanname=ValidaiteandApprove
	 */
	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getNewTask() {
		if (newTask == null) {
			newTask = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)getBean("newTask");
		}
		return newTask;
	}

	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

}