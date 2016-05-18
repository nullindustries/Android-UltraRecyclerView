#!/usr/bin/env bash
#
# Assemble and publish
#

sh gradlew clean build lib:uploadArchives --daemon