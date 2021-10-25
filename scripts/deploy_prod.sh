#!/bin/bash

set -e
source ~/.bash_profile

ips=(172.21.16.5)
for remote_host in ${ips[@]}
do

array=(miscellaneous)
for server in ${array[@]}
do
python /opt/works/cd_js_to_cos/download_package.py $SECRET_ID $SECRET_KEY ${server}-1.0-$GO_PIPELINE_LABEL.jar

pid=$(ssh root@$remote_host "ps -ef | grep '${server}'| grep -v grep | awk  '{print $2}'"| awk '{print $2}')
if [ ! $pid ]; then
	echo "do not have one process"
else
	echo $pid
	ssh root@$remote_host "kill -9 ${pid}"
fi

scp ${server}-1.0-$GO_PIPELINE_LABEL.jar root@$remote_host:/tmp/
ssh root@$remote_host "mv -f /tmp/${server}-1.0-${GO_PIPELINE_LABEL}.jar /opt/works/deployment"
done

ssh root@$remote_host /bin/bash << EOF
source ~/.bash_profile
source ~/.jdk8.rc
cd /opt/works/deployment


echo 'nohup java -jar miscellaneous-1.0-$GO_PIPELINE_LABEL.jar  --spring.profiles.active=prod --server.port=8091 > /dev/null 2>&1 &'
nohup java -jar miscellaneous-1.0-$GO_PIPELINE_LABEL.jar  --spring.profiles.active=prod --server.port=8091 > hole-config.log 2>&1 &


EOF
done


