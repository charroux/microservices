# microservices

## The registry

Simply at EnableEureakaServer to:

https://github.com/charroux/microservices/blob/main/registry/src/main/java/com/example/registry/RegistryApplication.java

Then configure the registry:

https://github.com/charroux/microservices/blob/main/registry/src/main/resources/application.yml

## First microservice

https://github.com/charroux/microservices/blob/main/microservice1/src/main/java/com/example/microservice1/RestService.java

Registering configuration:

https://github.com/charroux/microservices/blob/main/microservice1/src/main/resources/application.yml

## Second microservice

https://github.com/charroux/microservices/blob/main/microservice2/src/main/java/com/example/microservice2/RestService.java

That reaches the first microservice with a circuit breaker in case of failure.
