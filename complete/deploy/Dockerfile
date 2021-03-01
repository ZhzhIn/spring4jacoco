FROM openjdk:8-jdk-alpine
MAINTAINER ZhzhIn <yindongzi@163.com>
WORKDIR /
ADD rest-service-0.0.1-SNAPSHOT.jar /
ADD jacocoagent.jar /
EXPOSE 8082/tcp
EXPOSE 8083/tcp
ENTRYPOINT ["java","-javaagent:jacocoagent.jar=includes=*,output=tcpserver,port=9100,address=localhost","-jar","rest-service-0.0.1-SNAPSHOT.jar"]