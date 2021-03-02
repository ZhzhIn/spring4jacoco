FROM openjdk:8-jdk-alpine
MAINTAINER ZhzhIn <yindongzi@163.com>
WORKDIR /
ADD rest-service-0.0.1-SNAPSHOT.jar /
ADD jacocoagent.jar /
EXPOSE 8082 8083
ENTRYPOINT ["java","-javaagent:jacocoagent.jar=includes=*,output=tcpserver,address=0.0.0.0,port=8083","-jar","rest-service-0.0.1-SNAPSHOT.jar"]