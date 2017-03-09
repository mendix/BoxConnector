// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.createFolderSharedLinkImpl;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * Used to create a shared link for this particular folder. 
 * In order to disable a shared link set the SharedLink parameter to empty.
 * 
 * Required
 * BoxFolder: The folder for which to create a SharedLink
 * The _id attribute is required
 * 
 * SharedLink: An object representing this items shared link and associated permissions
 * 
 * access: The level of access required for this shared link. Can be open, company, collaborators, or null to get default share level.
 * 
 * unshared_at: The day that this link should be disabled at.
 * 
 * password: Requiring a password before viewing a shared link.
 * 
 * permissions: The set of permissions that apply to this link
 * 
 * effective_access: The access level set by the enterprise administrator. This will override any previous access levels set for the shared link and prevent any less-restrictive access levels to be set.
 */
public class CreateFolderSharedLink extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __BoxFolderParam;
	private boxconnector.proxies.BoxFolder BoxFolderParam;
	private IMendixObject __SharedLinkParam;
	private boxconnector.proxies.SharedLink SharedLinkParam;

	public CreateFolderSharedLink(IContext context, IMendixObject BoxFolderParam, IMendixObject SharedLinkParam)
	{
		super(context);
		this.__BoxFolderParam = BoxFolderParam;
		this.__SharedLinkParam = SharedLinkParam;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.BoxFolderParam = __BoxFolderParam == null ? null : boxconnector.proxies.BoxFolder.initialize(getContext(), __BoxFolderParam);

		this.SharedLinkParam = __SharedLinkParam == null ? null : boxconnector.proxies.SharedLink.initialize(getContext(), __SharedLinkParam);

		// BEGIN USER CODE
		boxconnector.proxies.BoxFolder boxFolder = createFolderSharedLinkImpl(getContext(), BoxFolderParam, SharedLinkParam);
		if (boxFolder != null)
			return boxFolder.getMendixObject();
		else
			return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CreateFolderSharedLink";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
