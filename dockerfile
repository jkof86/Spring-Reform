FROM openjdk:8-jre-alpine

# ENV url=$url
# ENV user=$user
# ENV pass=$pass

COPY target/*.jar app.jar

EXPOSE 4500

ENTRYPOINT ["java", "-jar", "app.jar"]