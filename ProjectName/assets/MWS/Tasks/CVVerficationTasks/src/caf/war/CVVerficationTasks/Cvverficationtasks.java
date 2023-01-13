/**
 * 
 */
package caf.war.CVVerficationTasks;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author y509163
 *
 */
@ManagedBean(name = "Cvverficationtasks")
@ApplicationScoped
@DTManagedBean(displayName = "CVVerficationTasks", beanType = BeanType.APPLICATION)
public class Cvverficationtasks extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Cvverficationtasks()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "CVVerficationTasks" );
	}
}