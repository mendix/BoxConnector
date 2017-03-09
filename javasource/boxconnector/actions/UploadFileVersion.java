// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.uploadFileVersionImpl;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import boxconnector.proxies.BoxFile;

/**
 * This method is used to upload a new version of an existing file in a user's account. 
 * The filename on Box will remain the same as the previous version. To update the file's name, you can specify a new name for the file.
 * 
 * Required
 * BoxFile
 * The attribute _id is required
 * 
 * FileToUpload
 * The new version of the file to upload
 * 
 * Optional
 * The attribute name of the BoxFile has to be set if the name of the file must be updated.
 */
public class UploadFileVersion extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __BoxFileParam;
	private boxconnector.proxies.BoxFile BoxFileParam;
	private IMendixObject __FileToUpload;
	private system.proxies.FileDocument FileToUpload;

	public UploadFileVersion(IContext context, IMendixObject BoxFileParam, IMendixObject FileToUpload)
	{
		super(context);
		this.__BoxFileParam = BoxFileParam;
		this.__FileToUpload = FileToUpload;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.BoxFileParam = __BoxFileParam == null ? null : boxconnector.proxies.BoxFile.initialize(getContext(), __BoxFileParam);

		this.FileToUpload = __FileToUpload == null ? null : system.proxies.FileDocument.initialize(getContext(), __FileToUpload);

		// BEGIN USER CODE
		BoxFile boxFile = uploadFileVersionImpl(getContext(), BoxFileParam, FileToUpload);
		if (boxFile != null) {
			return boxFile.getMendixObject();
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
		return "UploadFileVersion";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
