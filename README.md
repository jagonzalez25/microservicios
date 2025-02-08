# Proyecto de Microservicios con Spring Boot y Java 17

Este proyecto implementa una arquitectura basada en microservicios utilizando Spring Boot 3.4.2 y Maven 3.9.9.  

Cada microservicio está diseñado para interactuar con diferentes bases de datos y se comunica a través de Eureka Server, con un API Gateway que gestiona el tráfico de solicitudes.  

Además, los microservicios pueden comunicarse entre sí mediante FeignClient.


Tecnologías Utilizadas

- Java 17
- Spring Boot 3.4.2
- Maven 3.9.9
- Spring Cloud Netflix Eureka (para el registro y descubrimiento de servicios)
- Spring Cloud Gateway (para la gestión del enrutamiento)
- Spring Cloud OpenFeign (para la comunicación entre microservicios)
- MySQL (para un microservicio)
- PostgreSQL (para otro microservicio)
- JPA con Hibernate (para la persistencia de datos)
- Spring Web (para crear APIs RESTful)
