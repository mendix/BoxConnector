Retrieves the files and/or folders contained within this folder without any other metadata about the folder.
The mini format is returned for each item by default.

Required
BoxFolder
The _id attribute is required

Optional
Offset: The offset at which to begin the response. An offset of value of 0 will start at the beginning of the folder-listing. Note: If there are hidden items in your previous response, your next offset should be = offset + limit, not the # of records you received back. The default is 0.

Limit: The maximum number of items to return in a page. The default is 100 and the max is 1000.

Fields: Attribute(s) to include in the response