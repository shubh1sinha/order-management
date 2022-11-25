FROM openjdk:11
ARG JAR_FILE
COPY ${JAR_FILE} /home/app.jar
WORKDIR /home/
CMD ["java","-jar","/app.jar"]