#!/bin/bash
set -e

whoami
source ~/.bash_profile

mvn clean package

python /opt/works/cd_js_to_cos/upload_package_to_cos.py $SECRET_ID $SECRET_KEY target/miscellaneous-1.0-SNAPSHOT.jar miscellaneous-1.0-SNAPSHOT-$GO_PIPELINE_LABEL.jar
