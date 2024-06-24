FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
RUN apk add -U tzdata
COPY --from=build /target/quizzzz-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE ${BACKEND_PORT}
EXPOSE ${BACKEND_WEBSOCKET_PORT}
ENTRYPOINT ["java","-jar","demo.jar"]
