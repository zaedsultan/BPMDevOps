package caf.war.CVVerficationTasks.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class CvapplicationServices_docs_cvapplicationDocumnts extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "cvapplicationServices.docs:cvapplicationDocumnts";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.CVData cvdata = null;
	private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Approvers approvers = null;
	private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Actions actions = null;
	public static String[][] FIELD_NAMES = new String[][] {{"cvdata", "CVData"},{"approvers", "Approvers"},{"actions", "Actions"},{"process", "Process"},
	};
	private caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Process process = null;

	
	public CvapplicationServices_docs_cvapplicationDocumnts() {
	}


	/**
	 * IS document wrapper
	 */
	public static class CVData extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String name;
		private java.lang.String age;
		private java.lang.String edcation;
		public static String[][] FIELD_NAMES = new String[][] {{"name", "name"},{"age", "age"},{"edcation", "edcation"},{"aboutyou", "aboutyou"},
		};
		private java.lang.String aboutyou;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public CVData() {
		}


		public java.lang.String getName()  {
			
			return name;
		}


		public void setName(java.lang.String name)  {
			this.name = name;
		}


		public java.lang.String getAge()  {
			
			return age;
		}


		public void setAge(java.lang.String age)  {
			this.age = age;
		}


		public java.lang.String getEdcation()  {
			
			return edcation;
		}


		public void setEdcation(java.lang.String edcation)  {
			this.edcation = edcation;
		}


		public java.lang.String getAboutyou()  {
			
			return aboutyou;
		}


		public void setAboutyou(java.lang.String aboutyou)  {
			this.aboutyou = aboutyou;
		}
		
		
	
	}


	public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.CVData getCvdata()  {
		if (cvdata == null) {
			cvdata = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.CVData();
		}
		return cvdata;
	}


	public void setCvdata(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.CVData cvdata)  {
		this.cvdata = cvdata;
	}


	/**
	 * IS document wrapper
	 */
	public static class Approvers extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		// IS Document type used to generate this class
		public static String[][] FIELD_NAMES = new String[][] {{"id", "ID"},
		};
		private java.lang.String id;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public Approvers() {
		}


		public java.lang.String getId()  {
			
			return id;
		}


		public void setId(java.lang.String id)  {
			this.id = id;
		}
		
		
	
	}


	public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Approvers getApprovers()  {
		if (approvers == null) {
			approvers = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Approvers();
		}
		return approvers;
	}


	public void setApprovers(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Approvers approvers)  {
		this.approvers = approvers;
	}


	/**
	 * IS document wrapper
	 */
	public static class Actions extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String actions;
		public static String[][] FIELD_NAMES = new String[][] {{"actions", "Actions"},{"actionLists", "actionLists"},
		};
		private java.lang.String[] actionLists = null;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public Actions() {
		}


		public java.lang.String getActions()  {
			
			return actions;
		}


		public void setActions(java.lang.String actions)  {
			this.actions = actions;
		}


		public java.lang.String[] getActionLists()  {
			if (actionLists == null) {
				//TODO: create/set default value here
			}
			return actionLists;
		}


		public void setActionLists(java.lang.String[] actionLists)  {
			this.actionLists = actionLists;
		}
		
		
	
	}


	public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Actions getActions()  {
		if (actions == null) {
			actions = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Actions();
		}
		return actions;
	}


	public void setActions(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Actions actions)  {
		this.actions = actions;
	}


	/**
	 * IS document wrapper
	 */
	public static class Process extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String name;
		public static String[][] FIELD_NAMES = new String[][] {{"name", "name"},{"name2", "name2"},
		};
		private java.lang.String name2;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public Process() {
		}


		public java.lang.String getName()  {
			
			return name;
		}


		public void setName(java.lang.String name)  {
			this.name = name;
		}


		public java.lang.String getName2()  {
			
			return name2;
		}


		public void setName2(java.lang.String name2)  {
			this.name2 = name2;
		}
		
		
	
	}


	public caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Process getProcess()  {
		if (process == null) {
			process = new caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Process();
		}
		return process;
	}


	public void setProcess(caf.war.CVVerficationTasks.is.document.CvapplicationServices_docs_cvapplicationDocumnts.Process process)  {
		this.process = process;
	}
	
	

}