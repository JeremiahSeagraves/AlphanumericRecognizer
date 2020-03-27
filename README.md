# AlphanumericRecognizer
Microservices project for classifying English alphanumeric characters. It uses Spring Boot + Spring Cloud as microservice infrastructure, Angular 6+ as UI, DL4J as Machine Learning library and Docker as the containerizer.

# Project structure

## Microservices

### Admin
This microservice uses Spring Boot Admin module to provide selected Actuator
endpoints info for all microservices.

###  Discovery
This microservice uses Spring Cloud Eureka server for auto-discovery
purposes for all microservices.

### API
This microservice is the one intended as the general API of the project.
It uses Spring MVC, among other techs.

### ML Agent
This microservice is the most important, in a business manner, since this
is the one with the ML algorithm that identifies the characters based on
images.

### UI Thymeleaf
This microservice is just to test microservice communication and
self-discovery between API and UI.

### UI Angular
This microservice is one of a few that will have a web-client app
for testing alphanumeric recognition.


## How to build and run locally

### First way - Spring Boot Run
The first microservice that you need to run is the Eureka server (discovery).

After this, the order of the rest services doesn't affect in any manner.

For building an running you just need to run:

`mvn clean install`
`mvn spring-boot:run`


### Second way - The Dockerized way!
First, be sure that you have docker and docker-composer installed.

Then, create the images for each service with the following command in the root folder:

`mvn clean install`

Each service has the dockerfile-maven-plugin that has the configuration
for each service image, this plugin will be ran with the previous command.

After running the previous command from the root folder, all images will be created, then just need to run (also from root folder):

`docker-compose up -d`

This will trigger that all images be containerized and launched in a docker
container.

And that's it!

Now you can access the services from your localhost.

## Accessing the services

After you deployed all services (with any method), you can access to each one with the
following ports:

- Eureka (Discovery)
  - localhost:8761
  
  ![Eureka](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/eureka.png?raw=true)
  
- Admin
  - localhost:8765
  
    ![Spring Boot Admin 1](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/admin-1.png?raw=true)
    
    ![Spring Boot Admin 2](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/admin-2.png?raw=true)
    
    ![Spring Boot Admin 3](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/admin-3.png?raw=true)

- API
  - localhost:8081
  
    ![API](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/api.png?raw=true)
    
- ML-Agent
  - localhost:8082
    ![ML-Agent-1](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/ml-agent-1.png?raw=true)

- UI-Thymeleaf
  - localhost:8080
  
    ![UI Thymeleaf 1](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/ui-thymeleaf-1.png?raw=true)
    
    ![UI Thymeleaf 2](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/ui-thymeleaf-2.png?raw=true)

- UI-Angular
  - localhost:4200
  
    ![UI Angular](https://github.com/JeremiahSeagraves/AlphanumericRecognizer/blob/master/readme-files/ui-angular-1.png?raw=true)
