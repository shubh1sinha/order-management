FROM openjdk:11
ARG JAR_FILE
ENV JAVA_OPTS=""
ADD ${JAR_FILE} /home/app.jar
EXPOSE 8181
WORKDIR /home/
CMD java -jar $JAVA_OPTS app.jar