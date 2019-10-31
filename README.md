# spring-cloud-feign-eureka-demo
Spring cloud demo  for Feign Clients and Netflix Eureka

To run the example:

1- From root, execute:

```
mvn clean install
```

#### Step 1: Running  the Eureka Server:

1 - Go to `eureka-server`,

2- Run:
```
java -jar ./target/feign-eureka-server-1.0-SNAPSHOT.jar
```
3- The Eureka Server will start on port: 8761.

Go to http://localhost:8761/ , to make sure Eureka is up and running.


#### Step 2: Running the  Feign Service Impl project:

This project contains the Service that it's going to be executed from a different Microservice, through a FeignClient.

1 - Go to `feign-service-impl`.

2- Start the Microservice with:

```
java -jar ./target/feign-service-impl-1.0-SNAPSHOT.jar
```
3 - By Default , this microservice, it's going to be using a random port ( Configured at application.yml ) 

4- Verify that inside the Eureka Server, you are able to see this new service registered.

at: http://localhost:8761/


#### Step 3: Running the  Feign Client Example project:

1- Go to `feign-client-example`

2- Start the Microservice with:

```
java -jar ./target/feign-client-1.0-SNAPSHOT.jar
```
3 - This Microservice is going to be using port 8080.

4- Verify that inside the Eureka Server, you are able to see this new service registered.

at: http://localhost:8761/

5- At this point all the required  Microservices are up and running.


Go to : http://localhost:8080/get-greeting 

To call a Microservice inside `feign-client-example` that is going to be invoking another REST endpoint using Netflix Eureka, located at a different Microservice, in this case ( `feign-service-impl`) 
