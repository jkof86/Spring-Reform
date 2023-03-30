FROM openjdk:8-jre-alpine

COPY . ./target

ENV url=$url
ENV pguser=$pguser
ENV pgpassword=$pgpassword

EXPOSE 4500
ENTRYPOINT ["java", "-jar", "app.jar"]