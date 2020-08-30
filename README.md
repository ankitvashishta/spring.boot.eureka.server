# spring.boot.eureka.server

When you embrace the microservice architectural style, you'll have multiple microservices.
These multiple microservices are deployed at multiple addresses, and it becomes more complex, when the load balancers and dynamic addressing comes into picture.

When you have multiple microservices, a question to answer is : how will these microservices locate each other?
We can hard-code those addresses or add them in an externalized configuration file.
But, these locations may change over time. Location transparency in such a case provides elasticity and dynamism.

Location transparency can be addressed by a pattern called `Service Discovery`

`Netflix OSS` to the rescue!

### Netflix OSS

Netflix OSS is a set of frameworks and libraries that Netflix wrote to solve some interesting distributed-systems problems at scale.
Today, it’s pretty synonymous with developing microservices in a cloud environment.
Patterns for service discovery are incredibly important concepts for scalable distributed systems and Netflix brings nice solutions for these.

With Netflix OSS you typically need to set up a service-discovery server that acts as a registry of endpoints that can be discovered with various clients.

The service discovery that we are talking about here is `Netflix Eureka`

### Eureka Server 
Eureka Server is in itself a microservice to which all other microservices registers.
Eureka Clients are the independent microservices. We will see how to configure this in a microservice ecosystem.
