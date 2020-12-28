# 将应用停止
#stop.sh
#!/bin/bash
echo "Stopping SpringBoot Application"
pid=`ps -ef | grep rest-service-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
   kill -9 $pid
fi

#此处personal-0.0.1-SNAPSHOT.jar根据自己的jar包名称修改