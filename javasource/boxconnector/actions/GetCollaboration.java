// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.getCollaborationImpl;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Used to get information about a single collaboration. 
 * 
 * Required
 * BoxCollaboration
 * The _id attribute is required
 * 
 * Optional
 * Fields: Attribute(s) to include in the response
 * 
 * PendingStatus: 
 * True to retrieve only Pending collaborations
 * False to retrieve all collaborations
 */
public class GetCollaboration extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __BoxCollaborationParam;
	private boxconnector.proxies.BoxCollaboration BoxCollaborationParam;
	private java.util.List<IMendixObject> __Fields;
	private java.util.List<boxconnector.proxies.BoxCollaborationFields> Fields;
	private java.lang.Boolean PendingStatus;

	public GetCollaboration(IContext context, IMendixObject BoxCollaborationParam, java.util.List<IMendixObject> Fields, java.lang.Boolean PendingStatus)
	{
		super(context);
		this.__BoxCollaborationParam = BoxCollaborationParam;
		this.__Fields = Fields;
		this.PendingStatus = PendingStatus;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.BoxCollaborationParam = __BoxCollaborationParam == null ? null : boxconnector.proxies.BoxCollaboration.initialize(getContext(), __BoxCollaborationParam);

		this.Fields = new java.util.ArrayList<boxconnector.proxies.BoxCollaborationFields>();
		if (__Fields != null)
			for (IMendixObject __FieldsElement : __Fields)
				this.Fields.add(boxconnector.proxies.BoxCollaborationFields.initialize(getContext(), __FieldsElement));

		// BEGIN USER CODE
		boxconnector.proxies.BoxCollaboration boxCollaboration = getCollaborationImpl(getContext(), BoxCollaborationParam, Fields, PendingStatus);
		
		if (boxCollaboration != null)
			return boxCollaboration.getMendixObject();
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
		return "GetCollaboration";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
