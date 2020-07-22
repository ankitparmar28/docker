FROM java:8
VOLUME /tmp
ARG JAR_FILE
ADD /target/docker-demo-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]