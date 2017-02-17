Used to update information about the folder. To move a folder, update the ID of its parent. To enable an email address that can be used to upload files to this folder, update the folder_upload_email.

Required
BoxFolder: The folder to update.
The _id attribute is required.

Optional (but at least one of them must be specified)
UpdateName : The new name
UpdateDescription: The new description
UpdateParentFolder: The folder where to move the file
UpdateSharedLink: The SharedLink to update with its new attributes
UpdateFolderUploadEmail: The FolderUploadEmail to update with its new attributes
UpdateSyncState: Whether Box Sync clients will sync this folder. Values of synced or not_synced can be sent, while partially_synced may also be returned.
UpdateTags: All tags attached to this folder.