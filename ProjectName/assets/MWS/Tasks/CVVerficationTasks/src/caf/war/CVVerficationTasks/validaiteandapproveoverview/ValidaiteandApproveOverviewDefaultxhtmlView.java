/**
 * 
 */
package caf.war.CVVerficationTasks.validaiteandapproveoverview;

/**
 * @author y509163
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "ValidaiteandApproveOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ValidaiteandApproveOverview/default", beanType = BeanType.PAGE)
public class ValidaiteandApproveOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ValidaiteandApproveOverview.taskID}" }, };
	private transient caf.war.CVVerficationTasks.validaiteandapproveoverview.ValidaiteandApproveOverview validaiteandApproveOverview = null;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove validaiteandApprove = null;
	private static final String[][] VALIDAITEANDAPPROVE_PROPERTY_BINDINGS = new String[][] {
		{"#{ValidaiteandApprove.taskID}", "#{ValidaiteandApproveOverview.taskID}"},
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

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.CVVerficationTasks.validaiteandapproveoverview.ValidaiteandApproveOverview getValidaiteandApproveOverview()  {
		if (validaiteandApproveOverview == null) {
		    validaiteandApproveOverview = (caf.war.CVVerficationTasks.validaiteandapproveoverview.ValidaiteandApproveOverview)resolveExpression("#{ValidaiteandApproveOverview}");
		}
		return validaiteandApproveOverview;
	}

	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getValidaiteandApprove()  {
		if (validaiteandApprove == null) {
		    validaiteandApprove = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)resolveExpression("#{ValidaiteandApprove}");
		}
	
	    resolveDataBinding(VALIDAITEANDAPPROVE_PROPERTY_BINDINGS, validaiteandApprove, "validaiteandApprove", false, false);
		return validaiteandApprove;
	}

}