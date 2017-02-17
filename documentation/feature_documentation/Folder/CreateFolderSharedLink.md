Used to create a shared link for this particular folder. 
In order to disable a shared link set the SharedLink parameter to empty.

Required
BoxFolder: The folder for which to create a SharedLink
The _id attribute is required

SharedLink: An object representing this items shared link and associated permissions

access: The level of access required for this shared link. Can be open, company, collaborators, or null to get default share level.

unshared_at: The day that this link should be disabled at.

password: Requiring a password before viewing a shared link.

permissions: The set of permissions that apply to this link

effective_access: The access level set by the enterprise administrator. This will override any previous access levels set for the shared link and prevent any less-restrictive access levels to be set.