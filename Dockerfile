FROM openjdk:8
EXPOSE 7112
# Refer to Maven build -> finalName
#ARG JAR_FILE=target/eod-engine-consumer.jar
## Environmental variable
#ENV APP_HOME = /opt/ecms/eodEngine
## This is the directory where the output of CMD should run : cd /opt/ecms/eodEngine
#WORKDIR $APP_HOME
# Copy files from a specific location into a Docker image
#COPY ${JAR_FILE} eod-engine-consumer.jar
ADD target/home2.jar home2.jar
ENTRYPOINT ["java", "-jar","/home2.jar.jar"]