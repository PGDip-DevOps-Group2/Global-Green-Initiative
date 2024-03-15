FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY /home/runner/work/Global-Green-Initiative/Global-Green-Initiative/Global-Green-Initiative/target/Global-Green-Initiative-0.0.1-SNAPSHOT.jar Global-Green-Initiative-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","GlobalGreenIniativeApplication.jar"]