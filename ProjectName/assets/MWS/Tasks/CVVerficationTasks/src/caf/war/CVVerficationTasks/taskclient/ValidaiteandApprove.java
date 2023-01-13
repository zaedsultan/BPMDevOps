package caf.war.CVVerficationTasks.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'Validaiteand Approve' task.
 */ 
@ManagedBean(name = "ValidaiteandApprove")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ValidaiteandApprove extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 3533112342031300608L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "2D20E830-50AB-6E4C-2670-0B3D2342F6D8";

	/**
	 * Default constructor
	 */
	public ValidaiteandApprove() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 4881222338390717440L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"cvapplicationDocumnts", "cvapplicationDocumnts"},
		};


		private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts cvapplicationDocumnts = null;


		public static final String[] INPUTS = new String[] {"cvapplicationDocumnts", };


		public static final String[] OUTPUTS = new String[] {};
 
		public TaskData() {
		}

		public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts getCvapplicationDocumnts()  {
			if (cvapplicationDocumnts == null) {
				cvapplicationDocumnts = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts();
			}
			return cvapplicationDocumnts;
		}

		public void setCvapplicationDocumnts(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts cvapplicationDocumnts)  {
			this.cvapplicationDocumnts = cvapplicationDocumnts;
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}