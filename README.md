# consul-registration-discovery
This contains demo project of consul service registration and discovery also use of hystrix and Feign Client using springboot 2.x

# Requirements
* IntelliJ IDEA
* Gradle 4.xx
* Springboot 2.0.1.RELEASE
* Java 8

This project consist three project modules
1. Consul Server
2. Greeting Service which registered itself with Consul Server
3. Feign Client which is going to invoke greeting service using Service Discovery

## Run Consul Server instance  </br>

https://www.consul.io/downloads.html </br>

consul agent -dev
 
## Register and run greeting service </br>
cd ../consul-registration-discovery/consul-greeting-service . than run 'gradle build bootRun'. Now in Consul dashboard you should be able to see service registered with name 'GREETING-CLOUD-SERVICE' </br>
    compile('org.springframework.cloud:spring-cloud-starter-consul-all')

Define service registery name in application.yml GREETING-CLOUD-SERVICE

## Discover and consume greeting service </br> 
cd ../consul-registration-discovery/consul-feign-client and run 'gradle bootRun' . Now hit url http://localhost:8888/get-greeting . Respons should says "Hello from Greeting Service!" <br>

	  compile('org.springframework.cloud:spring-cloud-starter-consul-all')
   compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-hystrix', version: '1.4.4.RELEASE'

We have successfully implemented the Consul Service Registery and discovery.

## Test Hystrix Configuration
Kill the greeting-service and hit http://localhost:8888/get-greeting now response should say "Hello from Fallback Service!"
which is fallback implementation of greeting service. 

