#replace.sh 用于将上次构建的结果备份，然后将新的构建结果移动到合适的位置
#!/bin/bash
# 先判断文件是否存在，如果存在，则备份
file="rest-service-0.0.1-SNAPSHOT.jar"
mv /root/.jenkins/workspace/hello/target/personal-0.0.1-SNAPSHOT.jar /home/admin/workspace/personal-0.0.1-SNAPSHOT.jar

#此处 /home/admin/workspace/personal-0.0.1-SNAPSHOT.jar根据自己实际jar包名称和路径修改