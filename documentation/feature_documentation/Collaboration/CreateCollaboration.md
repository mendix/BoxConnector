Used to add a collaboration for a single user or a single group to a file or folder. Either an email address, a user id, or a group id can be used to create the collaboration.

Required
BoxItem: The item to which the collaboration will be added. It can be a BoxFile or a BoxFolder.
_id and _type attributes are required.

BoxUser: The box user added as a collaborator. 
A BoxUser can describe a group or a single user. The login (email address) is used only for single user.

CollaborationRole: The role applied to the collaborator.

Optional:
Notify: Determines if the user, (or all the users in the group) should receive email notification of the collaboration.

CanViewPath: View path collaborations allow the invitee to see the entire ancestral path to the associated folder. 