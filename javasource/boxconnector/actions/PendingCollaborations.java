// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.pendingCollaborationsImpl;
import java.util.LinkedList;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import boxconnector.proxies.BoxCollaboration;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Used to retrieve all pending collaboration invites for a user.
 * 
 * Optional
 * Fields: Attribute(s) to include in the response
 */
public class PendingCollaborations extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> __Fields;
	private java.util.List<boxconnector.proxies.BoxCollaborationFields> Fields;

	public PendingCollaborations(IContext context, java.util.List<IMendixObject> Fields)
	{
		super(context);
		this.__Fields = Fields;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.Fields = new java.util.ArrayList<boxconnector.proxies.BoxCollaborationFields>();
		if (__Fields != null)
			for (IMendixObject __FieldsElement : __Fields)
				this.Fields.add(boxconnector.proxies.BoxCollaborationFields.initialize(getContext(), __FieldsElement));

		// BEGIN USER CODE
		java.util.List<IMendixObject> result = new LinkedList<IMendixObject>();
		java.util.List<boxconnector.proxies.BoxCollaboration> collaborationList = pendingCollaborationsImpl(getContext(), Fields);
		
		if (collaborationList != null) {
			for (BoxCollaboration collaboration : collaborationList) {
				result.add(collaboration.getMendixObject());
			}

			return result;
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
		return "PendingCollaborations";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
