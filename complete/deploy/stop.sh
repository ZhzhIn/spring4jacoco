# 将应用停止
#stop.sh
#! /bin/bash
echo "Stopping SpringBoot Application"
#kill -9 $(netstat -nlp | grep :8080 | awk '{print $7}' | awk -F"/" '{ print $1 }')
pid=`ps -ef | grep rest-service-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
   kill -9 $pid
fi

#此处personal-0.0.1-SNAPSHOT.jar根据自己的jar包名称修改