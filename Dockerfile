FROM openjdk:11
ARG JAR_FILE
ADD ${JAR_FILE} /home/app
WORKDIR /home/
CMD java -jar order-managemt-1.0.jar