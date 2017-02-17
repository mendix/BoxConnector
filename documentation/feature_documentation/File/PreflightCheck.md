The Pre-flight check will verify that a file will be accepted by Box before you send all the bytes over the wire. 
It can be used for both first-time uploads, and uploading new versions of an existing File (on /files/[id]/content). 

Preflight checks verify all permissions as if the file was actually uploaded including:

    Folder upload permission
    File name collisions
    file size caps
    folder and file name restrictions
    folder and account storage quota


Required
BoxFile
The attribute name is requied.

BoxFolder
The _id attribute is required.