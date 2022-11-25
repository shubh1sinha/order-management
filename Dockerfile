FROM openjdk:11
ARG JAR_FILE
ADD ${JAR_FILE} /home/app.jar
WORKDIR /home/
CMD ["java","-jar","app.jar"]