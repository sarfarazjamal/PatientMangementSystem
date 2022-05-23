# we will use openjdk 11 with alpine as it is a very small linux distro
FROM openjdk:11.0.12-jre-slim-buster


# copy the packaged jar file into our docker image
COPY target/patient-management-0.0.1.jar /patient-management-0.0.1.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/patient-management-0.0.1.jar"]

