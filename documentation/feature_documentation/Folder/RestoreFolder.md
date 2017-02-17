Restores an item that has been moved to the trash. Default behavior is to restore the item to the folder it was in before it was moved to the trash. If that parent folder no longer exists or if there is now an item with the same name in that parent folder, the new parent folder and/or new name will need to be included in the request.

Required

BoxFolder: The folder to restore.
The _id attribute is required.

Optional

name: The new name for this item

DestBoxFolder: The new parent folder for this item
The _id attribute is required.