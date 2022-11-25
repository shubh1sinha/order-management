FROM openjdk:11
WORKDIR /home/app
COPY . /home/app/
CMD ["java","-jar","app.jar"]