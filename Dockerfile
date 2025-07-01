FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon
EXPOSE 8080
CMD ["java", "-jar", "build/libs/subs-cms-0.0.1-SNAPSHOT.jar"]

