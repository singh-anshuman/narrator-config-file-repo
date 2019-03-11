# Narrator - Spring Cloud Config Server and Client Implementation

Handling configurations for applications in a microservice based architecture can turn into a maintenance nightmare. Spring Cloud Config provides a viable solution for this problem by externalising application configurations. This post talks about how to setup Spring Config Server with file based config repositories and how to make your services can act as clients to the config server.

To demonstrate the Spring Cloud Config server setup and usage we'll be creating an application called Narrator. This is an eCommerce application that can be used to buy Audio Books. This application has microservice based architecture with 2 different sub-applications deployed separately.

* User
* Order