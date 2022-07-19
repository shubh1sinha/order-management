FROM tomcat
ADD target/order-management.jar /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["java","-jar","order-management.jar"]