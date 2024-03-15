FROM eclipse-temurin:17-jdk-alpine
COPY  target/Global-Green-Initiative-0.0.1-SNAPSHOT.jar Global-Green-Initiative-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/Global-Green-Initiative-0.0.1-SNAPSHOT.jar"]