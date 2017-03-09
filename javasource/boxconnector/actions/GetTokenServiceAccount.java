// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.getTokenServiceAccountImpl;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import boxconnector.proxies.AccessToken;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTokenServiceAccount extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __BoxApplicationParam;
	private boxconnector.proxies.BoxApplication BoxApplicationParam;
	private java.lang.String AppUserId;
	private java.lang.String EntrepriseId;

	public GetTokenServiceAccount(IContext context, IMendixObject BoxApplicationParam, java.lang.String AppUserId, java.lang.String EntrepriseId)
	{
		super(context);
		this.__BoxApplicationParam = BoxApplicationParam;
		this.AppUserId = AppUserId;
		this.EntrepriseId = EntrepriseId;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.BoxApplicationParam = __BoxApplicationParam == null ? null : boxconnector.proxies.BoxApplication.initialize(getContext(), __BoxApplicationParam);

		// BEGIN USER CODE
		AccessToken token = getTokenServiceAccountImpl(getContext(), AppUserId, EntrepriseId, BoxApplicationParam);
		if (token != null) {
			return token.getMendixObject();
		} else {
			return null;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetTokenServiceAccount";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
