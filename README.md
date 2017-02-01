# BoxConnector

This project provides an easy to way to use [box.com](https://www.box.com) inside your
Mendix application.

## Installation

### Prerequisites

1. Login to https://developer.box.com/
1. Create and configure a Box Application. Details [here](https://docs.box.com/docs/app-users).

### Dependencies

The following modules are required:
* [CommunityCommons](https://appstore.home.mendix.com/link/app/170/Mendix/Community-Commons-Function-Library).
* [DeepLink](https://appstore.home.mendix.com/link/app/43/Mendix/Deep-link-module)

### In your Box account
1. Configure your application setting the redirect url as: ```https://<mendix_application_address>/link/grantaccess```

### In your project

1. Import this module and its dependencies describe above.
1. At this step, you will have available the Box connectors in the toolbox.
1. In the BoxConnector module, use the ```BoxApplication_Overview``` page as an admin user to configure your Box connectors in your application.
1. Use ```BoxAccounts_Overview``` page to associate Box accounts to Mendix
  accounts, using the  *token* provided by the corresponding type of
    Box account (user or service).
1. In the project, make sure that BoxApplication entity is set with the same      redirect url.
1. Configure the *DeepLink* module as follow: **INCLUDE SCREENSHOT**   
1. **Enjoy it!**

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
