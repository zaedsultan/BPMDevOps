/**
 * 
 */
package caf.war.CVVerficationTasks.validaiteandapproveview;

/**
 * @author y509163
 *
 */

import com.webmethods.caf.faces.data.dir.PrincipalModel;
import com.webmethods.caf.faces.data.dir.PrincipalModelList;
import com.webmethods.caf.faces.data.task.impl.TaskContentProvider;
import com.webmethods.caf.faces.data.task.impl.TaskVotingServiceFactory;
import com.webmethods.portal.mech.task.voting.details.pojo.TaskVoteEntry;

import com.softwareag.caf.shared.task.core.model.TaskVotingTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "ValidaiteandApproveViewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ValidaiteandApproveView/default", beanType = BeanType.PAGE)
public class ValidaiteandApproveViewDefaultxhtmlView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.task.TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskDisplayProvider.taskID}", "#{ValidaiteandApproveView.taskID}"},
	};
	
	/**
	 * Has permission to view voting details
	 */
	public boolean getHasVotingDetailsPermission() {
		return getValidaiteandApprove().getCanUserViewTaskVotingStatistics();
	}
	
	public List<TaskVoteEntry> getListOfVotingTableEntries() {
		List<TaskVoteEntry> listOfVotingTableEntries = null;
		try {
			listOfVotingTableEntries = TaskVotingServiceFactory.getVotingService().getTaskVotesDetails(Integer.valueOf(getValidaiteandApprove().getTaskID()));
		} catch (Exception e) {
            this.error(e);
            this.log(e);
        }
		
		return listOfVotingTableEntries;
	}
	
	/**
	 * Get task voting strategy
	 */
	public String getTaskVotingStrategy() {
        final TaskVotingTable table = TaskVotingServiceFactory.getVotingService().parseVotingTable(getValidaiteandApprove().getTaskInfo().getTaskVotingTable());
        return table.getStrategy();
    }
    
    /**
	 * Get task voting threshold
	 */
    public String getTaskVotingThreshold() {
        final TaskVotingTable table = TaskVotingServiceFactory.getVotingService().parseVotingTable(getValidaiteandApprove().getTaskInfo().getTaskVotingTable());
        return table.getValue();
    }
    
	/**
	 * Get count of all users assigned to the task
	 */
	 public int getTotalUserAssignedCount() {
        int totalUserAssignedCount = 0;
        try {
            totalUserAssignedCount = TaskVotingServiceFactory.getVotingService().getTotalUserAssignedCount(Integer.valueOf(getValidaiteandApprove().getTaskID()));
        }
        catch (Exception e) {
            this.error(e);
            this.log(e);
        }
        return totalUserAssignedCount;
    }
    
	 /**
	 * Get all task votes by status
	 */
    public Map<String, Integer> getTaskVotingCount() {
        Map<String, Integer> map = null;
        try {
            map = (Map<String, Integer>)TaskVotingServiceFactory.getVotingService().getTaskVotesCountByStatus(Integer.valueOf(getValidaiteandApprove().getTaskID()));
        }
        catch (Exception e) {
            this.error(e);
            this.log(e);
        }
        return map;
    }
    
	public com.webmethods.caf.faces.data.task.TaskDisplayProvider getTaskDisplayProvider()  {
		if (taskDisplayProvider == null) {
		    taskDisplayProvider = (com.webmethods.caf.faces.data.task.TaskDisplayProvider)resolveExpression("#{TaskDisplayProvider}");
		}
	    resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS, taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	/**
	 * Cancel button action handler
	 */
	public String cancelView() {
		try {
			// just redirect to return (finish) url
			String url = getValidaiteandApproveView().getFinishUrl();
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}
	
	/**
	 * Complete button action handler
	 */
	public String completeTask() {
		try {
			if( !getValidaiteandApprove().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}
			// do the work
			getValidaiteandApprove().voteComplete();
		
			// then redirect to finish url
			String url = getValidaiteandApproveView().getFinishUrl(); 
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getValidaiteandApprove().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getValidaiteandApprove().applyChanges();
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	private PrincipalModelList selectedPrincipalList;

	public PrincipalModelList getPrincipalList() {
		return selectedPrincipalList;
	}
	
	public void setPrincipalList(PrincipalModelList value) {
		this.selectedPrincipalList = value;
	}
	
	/**
	 * Action Event Handler for the control with id='dialogPrincipalAssignTo'
	 */
	public String assignToPrincipals() {
		try {

			// get the current assigned principals for this task
			TaskContentProvider tp = getValidaiteandApprove();

			List<String> currentPrincipalList = new ArrayList<String>();
			String[] currentPrincipalIDs = tp.getTaskInfo().getAssignedToList();
			if (currentPrincipalIDs != null && currentPrincipalIDs.length > 0) {
				for (int ix = 0; ix < currentPrincipalIDs.length; ix++) {
					String principalID = currentPrincipalIDs[ix];
					currentPrincipalList.add( principalID );
				}
			}
			
			// get the selected principals from the picker
			if (selectedPrincipalList != null && selectedPrincipalList.size() > 0) {
				// loop and add the selected principals to the existing list
				for (int ix = 0; ix < selectedPrincipalList.size(); ix++) {
					PrincipalModel principalModel = (PrincipalModel) selectedPrincipalList.get(ix);
					String principalID = principalModel.getPrincipalID(); 
					if( !currentPrincipalList.contains( principalID)) {
						currentPrincipalList.add( principalID );
					}
				}
			}
				
			currentPrincipalIDs = currentPrincipalList.toArray( currentPrincipalIDs);
			tp.getTaskInfo().setAssignedToList(currentPrincipalIDs);
			tp.applyChangesNoAccept();
				
			// then redirect to finish url
			//String url = getRonTask36TaskView().getFinishUrl(); 
			//if (url != null && url.length() > 0) {
			//	getFacesContext().getExternalContext().redirect(url);
			//}				
		} catch (Exception e) {
			error(e);
			log(e);
		}		
		return null;
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{ValidaiteandApprove.reset}", null}
	};
	private transient caf.war.CVVerficationTasks.validaiteandapproveview.ValidaiteandApproveView validaiteandApproveView = null;
	private caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove validaiteandApprove = null;
	private static final String[][] VALIDAITEANDAPPROVE_PROPERTY_BINDINGS = new String[][] {
		{"#{ValidaiteandApprove.taskID}", "#{ValidaiteandApproveView.taskID}"},
		{"#{ValidaiteandApprove.autoAccept}", "false"},
		{"#{ValidaiteandApprove.adhocRouting}", "false"},
	};
	private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts cvapplicationDocumnts = null;
	private static final String[][] CVAPPLICATIONDOCUMNTS_PROPERTY_BINDINGS = new String[][] {
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
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		try {
			getValidaiteandApprove().refresh();
		} catch( Exception ex ) {
			error(ex);
			log(ex);
		}
		
	}

	public caf.war.CVVerficationTasks.validaiteandapproveview.ValidaiteandApproveView getValidaiteandApproveView()  {
		if (validaiteandApproveView == null) {
		    validaiteandApproveView = (caf.war.CVVerficationTasks.validaiteandapproveview.ValidaiteandApproveView)resolveExpression("#{ValidaiteandApproveView}");
		}
		return validaiteandApproveView;
	}

	public caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove getValidaiteandApprove()  {
		if (validaiteandApprove == null) {
		    validaiteandApprove = (caf.war.CVVerficationTasks.taskclient.ValidaiteandApprove)resolveExpression("#{ValidaiteandApprove}");
		}
	
	    resolveDataBinding(VALIDAITEANDAPPROVE_PROPERTY_BINDINGS, validaiteandApprove, "validaiteandApprove", false, false);
		return validaiteandApprove;
	}

	public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts getCvapplicationDocumnts()  {
		if (cvapplicationDocumnts == null) {
			cvapplicationDocumnts = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts();
		}
	
	    resolveDataBinding(CVAPPLICATIONDOCUMNTS_PROPERTY_BINDINGS, cvapplicationDocumnts, "cvapplicationDocumnts", false, false);
		return cvapplicationDocumnts;
	}

	public void setCvapplicationDocumnts(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts cvapplicationDocumnts)  {
		this.cvapplicationDocumnts = cvapplicationDocumnts;
	}
}
