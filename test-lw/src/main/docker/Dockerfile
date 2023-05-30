FROM java:8u111-jdk-alpine
WORKDIR /app
ADD test-lw-1.0-SNAPSHOT.jar /app
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","test-lw-1.0-SNAPSHOT.jar"]