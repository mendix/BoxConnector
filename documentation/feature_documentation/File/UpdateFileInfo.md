Used to update individual or multiple fields in the file object, including renaming the file, changing its 
description, and creating a shared link for the file. To move a file, change the ID of its parent folder.

Required
BoxFile : The file to update 

Optional (but at least one of them must be specified)
UpdateName : The new name
UpdateDescription: The new description
UpdateParentFolder: The folder where to move the file
UpdateSharedLink: The SharedLink to update with its new attributes
UpdateTags: All tags attached to this file. 