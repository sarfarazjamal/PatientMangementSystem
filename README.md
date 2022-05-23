# PatientManagement

Swagger URL:
http://localhost:8088/swagger-ui.htm

Generate JWT Token:
1)curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \ 
   "password": "admin", \ 
   "rememberMe": true, \ 
   "username": "admin" \ 
 }' 'http://localhost:8088/api/authenticate'
 
 2) Create Appoinntment.
 curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY1NTkwMzkyMH0.IMhrtet4dlNuhCNAvfUva4EGN6xDur7PW4LQuq0lhWp_Y1kRxJcfFC3UhKNKFdoErXrq2euZFqQKOUll7gxBCw' -d '{ \ 
   "doctorId": 8, \ 
   "endTime": "2022-05-23T13:20:00.730Z", \ 
   "patientId": 9, \ 
   "startTime": "2022-05-23T13:20:00.730Z", \ 
   "status": "ACTIVE", \ 
   "type": "CONSULTATION" \ 
 }' 'http://localhost:8088/api/appointments'
 3) Find appointment with doctor ID
 http://localhost:8088/api/appointments?doctorId.equals=10
 4) find appointment with multiple doctor with in clause doctor id in (10,9,8)
 http://localhost:8088/api/appointments?doctorId.in=10%2C9%2C8
 5) Find docctor with patient id and with multiple patient id, 
 http://localhost:8088/api/appointments?patientId.equals=10
 6) Find appoinment with doctor and patient
 http://localhost:8088/api/appointments?doctorId.in=10&patientId.equals=10

## Development

To start your application in the dev profile, run:

```
./mvnw
```


## Building for production

### Packaging as jar

To build the final jar and optimize the PatientManagement application for production, run:

```

./mvnw -Pprod clean verify


```

To ensure everything worked, run:

```

java -jar target/*.jar


```


### Packaging as war

To package your application as a war in order to deploy it to an application server, run:

```

./mvnw -Pprod,war clean verify


```

## Testing

To launch your application's tests, run:

```
./mvnw verify
```


### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker-compose -f src/main/docker/sonar.yml up -d
```

You can run a Sonar analysis with using the [sonar-scanner](https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) or by using the maven plugin.

Then, run a Sonar analysis:

```
./mvnw -Pprod clean verify sonar:sonar
```

If you need to re-run the Sonar phase, please be sure to specify at least the `initialize` phase since Sonar properties are loaded from the sonar-project.properties file.

```
./mvnw initialize sonar:sonar
```


## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a mysql database in a docker container, run:

```
docker-compose -f src/main/docker/mysql.yml up -d
```

To stop it and remove the container, run:

```
docker-compose -f src/main/docker/mysql.yml down
```

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

```
./mvnw -Pprod verify jib:dockerBuild
```

You can fully dockerize and create tar file to deploy on linux:

```
./createDocker.sh
sudo docker save -o patient-management.tar patient-management-0.0.1
 sudo docker load -i patient-management-0.0.1
```
