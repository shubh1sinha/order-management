FROM openjdk:11
WORKDIR /home/app
COPY . /home/app/
EXPOSE 8080
CMD ["java","-jar","order-management.jar"]