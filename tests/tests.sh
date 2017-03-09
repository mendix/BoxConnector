#!/bin/bash

# cf login -a https://api
cf set-env boxconnector ADMIN_PASSWORD "Password1!"
cf push boxconnector -b https://github.com/mendix/cf-mendix-buildpack -t 180
