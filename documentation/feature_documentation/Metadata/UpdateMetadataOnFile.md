Used to update the template instance. 
Updates can be either add, replace, remove , test, move, or copy. 
The template instance can only be updated if the template instance already exists. 
When editing metadata, only values that adhere to the metadata template schema will be accepted.

The update is applied atomically. If any errors occur during the application of the update operations, the metadata instance remains unchanged.

Required
BoxFile
The _id attribute is required

Scope: The scope of the object.

BoxTemplate: The template to use.
The templateKey attribute is required
At least 1 MetadataValue must be provided with type and corresponding value.

UpdateMetadataList: The list of changes to apply

UpdateMetadata objects must be set as follow:

Operation: the operation to apply
TypeMetadata: the type of the metadata
Key: The key name of the metadata
StrValue/FloatValue/DateValue: The corresponding value to be set or tested. Required for add, replace, and test operations. 
For add, if value already exists, then previous value will be overwritten by the new value. 
For replace, the metadata value must exist before replacing.
For test, the value of the existing metadata instance must match the specified value.

FromBoxMetadata: The key to the Metadata source.
This value is required only in case of Move or Copy operation.
