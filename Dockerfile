FROM openjdk:11
ARG JAR_FILE
ADD ${JAR_FILE} /home/order-managemt-1.0.jar
WORKDIR /home/
CMD java -jar order-managemt-1.0.jar