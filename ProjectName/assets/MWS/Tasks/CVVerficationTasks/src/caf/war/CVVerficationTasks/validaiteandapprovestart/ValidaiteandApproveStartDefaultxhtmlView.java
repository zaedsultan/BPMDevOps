/**
 * 
 */
package caf.war.CVVerficationTasks.validaiteandapprovestart;

/**
 * @author y509163
 *
 */

import javax.faces.application.FacesMessage;
import java.text.MessageFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;



@ManagedBean(name = "ValidaiteandApproveStartDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ValidaiteandApproveStart/default", beanType = BeanType.PAGE)
public class ValidaiteandApproveStartDefaultxhtmlView extends com.webmethods.caf.faces.bean.task.BaseTaskStartPageBean {


	
	
	

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider taskPriorityMapProvider = null;
	private static final String[][] TASKPRIORITYMAPPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskPriorityMapProvider.labelFieldName}", "label"},
		{"#{TaskPriorityMapProvider.array}", "#{TaskDisplayProvider.taskPriorityItems}"},
		{"#{TaskPriorityMapProvider.valueFieldName}", "value"},
	}; 
	public com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider getTaskPriorityMapProvider()  {
		if (taskPriorityMapProvider == null) {
		    taskPriorityMapProvider = (com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider)resolveExpression("#{TaskPriorityMapProvider}");
		}
	    resolveDataBinding(TASKPRIORITYMAPPROVIDER_PROPERTY_BINDINGS, taskPriorityMapProvider, null, false, true);
		return taskPriorityMapProvider;
	}
	
	
    
	public String getPortletResource( String key ) {
	    return (String)getActivePreferencesBean().getPortletResourcesProvider().getValue( key );
	}

    /**
     * Queue new task. 
     * If successful adds INFO message to the faces context.
     * If failed adds error messages to the faces context.
     */
	public String queueNewTask() {
		try {
			// do the work
			getValidaiteandApprove().queueNewTask();

			
			
			
				
			
			String msgHeader = getPortletResource("start.task.pagebean.task.start.msg");//"The new task has been successfully started"; 
			String taskIdStr = getPortletResource("start.task.pagebean.task.is.msg");
			String msgText = MessageFormat.format( taskIdStr, new Object[] {getValidaiteandApprove().getTaskID()}); 
			getFacesContext().addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_INFO, 
				msgHeader, 
				 msgText));
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}
	
   /**
	 * Go to the URL specified by the 'returnURL' preference
	 */
	public String doReturnURL() {
		try {
			// just redirect to return (finish) url
			String returnURL = (String)getValidaiteandApproveStart().getReturnUrl();
			if (returnURL != null && returnURL.length() > 0) {
				getFacesContext().getExternalContext().redirect(returnURL);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.CVVerficationTasks.validaiteandapprovestart.ValidaiteandApproveStart validaiteandApproveStart = null;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove validaiteandApprove = null;
	private static final String[][] VALIDAITEANDAPPROVE_PROPERTY_BINDINGS = new String[][] {
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



	public caf.war.CVVerficationTasks.validaiteandapprovestart.ValidaiteandApproveStart getValidaiteandApproveStart()  {
		if (validaiteandApproveStart == null) {
		    validaiteandApproveStart = (caf.war.CVVerficationTasks.validaiteandapprovestart.ValidaiteandApproveStart)resolveExpression("#{ValidaiteandApproveStart}");
		}
		return validaiteandApproveStart;
	}



	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getValidaiteandApprove()  {
		if (validaiteandApprove == null) {
		    validaiteandApprove = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)resolveExpression("#{ValidaiteandApprove}");
		}
	
	    resolveDataBinding(VALIDAITEANDAPPROVE_PROPERTY_BINDINGS, validaiteandApprove, "validaiteandApprove", false, false);
		return validaiteandApprove;
	}

  
    
}