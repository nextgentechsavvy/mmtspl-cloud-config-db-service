FROM openjdk:8
EXPOSE 9008
ADD target/mmtspl-cloud-config-db-service-1.0.0-SNAPSHOT.jar mmtspl-cloud-config-db-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/mmtspl-cloud-config-db-service-1.0.0-SNAPSHOT.jar"]