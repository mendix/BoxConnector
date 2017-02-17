# BoxConnector

This project provides an easy to way to use [box.com](https://www.box.com) inside your
Mendix application.

## Installation

### Prerequisites

* [Create a Box application](documentation/prerequisite-box-setup.md)

### Dependencies

The following modules are required:
* [CommunityCommons](https://appstore.home.mendix.com/link/app/170/Mendix/Community-Commons-Function-Library).
* [DeepLink](https://appstore.home.mendix.com/link/app/43/Mendix/Deep-link-module)

### In your Mendix project

1. Install this module and its dependencies describe above.
1. At this step, you will have available the Box connectors in the toolbox.
1. In the BoxConnector module, use the ```BoxApplication_Overview``` page as an admin user to configure your Box connectors in your application.
1. Use ```BoxAccounts_Overview``` page to associate Box accounts to Mendix
  accounts, using the  *token* provided by the corresponding type of
    Box account (user or service).
1. In the project, make sure that BoxApplication entity is set with the same      redirect url.
1. Configure the *DeepLink* module as follow:

![](documentation/resources/step08_mendix_deeplink_config.jpg)



## Features

### Authentication
* Get token
* Get token service accounts
* Refresh token
* Revoke token

### Collaboration Management
* [Create collaboration](documentation/feature_documentation/File/CreateCollaboration.md)
* [Delete collaboration](documentation/feature_documentation/File/DeleteCollaboration.md)  
* [Get collaboration](documentation/feature_documentation/File/GetCollaboration.md)  
* [Pending collaborations](documentation/feature_documentation/File/PendingCollaborations.md)  
* [Update collaboration](documentation/feature_documentation/File/UpdateCollaboration.md)  

### File Management
* [Copy file](documentation/feature_documentation/File/CopyFile.md)  
* [Create file Shared Link](documentation/feature_documentation/File/CreateFileSharedLink.md)
* [Delete file](documentation/feature_documentation/File/DeleteFile.md)
* [Delete old version](documentation/feature_documentation/File/DeleteOldVersion.md)
* [Download file](documentation/feature_documentation/File/DownloadFile.md)
* [Get embed link](documentation/feature_documentation/File/GetEmbedLink.md)
* [Get file collaborations](documentation/feature_documentation/File/GetFileCollaborations.md)
* [Get file comments](documentation/feature_documentation/File/GetFileComments.md)
* [Get file info](documentation/feature_documentation/File/GetFileInfo.md)
* [Get file tasks](documentation/feature_documentation/File/GetFileTasks.md)
* [Get thumbnail](documentation/feature_documentation/File/GetThumbnail.md)
* [Get trashed file](documentation/feature_documentation/File/GetTrashedFile.md)
* [Lock and unlock](documentation/feature_documentation/File/LockAndUnlock.md)
* [Permanently delete file](documentation/feature_documentation/File/PermanentlyDeleteFile.md)
* [Preflight check](documentation/feature_documentation/File/PreflightCheck.md)
* [Promote version](documentation/feature_documentation/File/PromoteVersion.md)
* [Restore file](documentation/feature_documentation/File/RestoreFile.md)
* [Update file info](documentation/feature_documentation/File/UpdateFileInfo.md)
* [Upload file](documentation/feature_documentation/File/UploadFile.md)
* [Upload file version](documentation/feature_documentation/File/documentation/feature_documentation/File/UploadFileVersion.md)
* [View versions](documentation/feature_documentation/File/ViewVersions.md)

### Folder Management
* [Copy folder](documentation/feature_documentation/Folder/CopyFolder.md)
* [Create folder](documentation/feature_documentation/Folder/CreateFolder.md)
* [Create folder shared link](documentation/feature_documentation/Folder/CreateFolderSharedLink.md)
* [Delete folder](documentation/feature_documentation/Folder/DeleteFolder.md)
* [Get folder collaborations](documentation/feature_documentation/Folder/GetFolderCollaborations.md)
* [Get folder info](documentation/feature_documentation/Folder/GetFolderInfo.md)
* [Get folder items](documentation/feature_documentation/Folder/GetFolderItems.md)
* [Get trashed folder](documentation/feature_documentation/Folder/GetTrashedFolder.md)
* [Get trashed items](documentation/feature_documentation/Folder/GetTrashedItems.md)
* [Permanently delete folder](documentation/feature_documentation/Folder/PermanentlyDeleteFolder.md)
* [Restore folder](documentation/feature_documentation/Folder/RestoreFolder.md)
* [Update folder](documentation/feature_documentation/Folder/UpdateFolder.md)

### Metadata Management
* [Create metadata on file](documentation/feature_documentation/Metadata/CreateMetadataOnFile.md)
* [Delete metadata on file](documentation/feature_documentation/Metadata/DeleteMetadataOnFile.md)
* [Get metadata on file](documentation/feature_documentation/Metadata/GetMetadataOnFile.md)
* [Update metadata on file](documentation/feature_documentation/Metadata/UpdateeMetadataOnFile.md)

## Contributions
Contributions are welcomed:

1. open an issue about your topic
1. fork, make a branch named starting with the issue number you are resolving and make a pull request to the master branch
1. please add some tests for feature changes

### Build Details

This was built with the following:

* Mendix Modeler 6.10.3
* Eclipse IDE Neon

### Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/mendix/IBM-Watson-Connector-Kit/tags).

## License ##

This project is licensed under the Apache License v2 (for details, see the [LICENSE](LICENSE-2.0.txt) file).
