# BookMyHotelMS
Demo Application to understand Spring Microservices

## Monolithic
Check Monolithic application code

Run the spring boot Application

Test using http://localhost:6060

Fill RegistrationId and password to login (use cr1 for registration id and pass for password)

You will see the home page with links to check the registration details, existing bookings and search hotels 

Check existing details by clicking on corresponding links

Search hotels using city as noida,state as up and country as india

Book the hotel

## Eureka Server
Run the Eureka Server

Use http://localhost:8001 to open Eureka UI

## MicroServices
Monolithic Application is broken into MicroServices and a web application

Run all Microservices which are spring boot applications

Run the webapplication also

Check in Eureka UI that all microservices and webapplication are registered

Test using http://localhost:6060 as before

## Ribbon
Changes are done in WebApplication code to use ribbon

No Change in microservices code as no microservice is interacting with other microservice

Run all Microservices 

Make sure to run two instances of Registration MicroService

Run the webapplication also
Check in Eureka UI that all microservices and webapplication are registered

Test using http://localhost:6060 as before

Login multiple times and you will see that request is load balanced among different registration microservice instances

## Feign
Changes are done in WebApplication code to use feign

No Change in microservices code as no microservice is interacting with other microservice

Run all Microservices 

Run the webapplication also

Check in Eureka UI that all microservices and webapplication are registered

Test using http://localhost:6060 

