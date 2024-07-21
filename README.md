# SpringBootRedis
Spring Boot Redis POC 

This application registers Student details into H2 in-memory database and fetches the details of a student from DB, stores it into
redis cache and sends back response to the client.
![SB_redis_cache](https://github.com/user-attachments/assets/28e40d46-f6f0-41c3-9822-e468a6ac5f84)

Specific annotations used:
@EnableCaching
@Cacheable 
[eg. @Cacheable(cacheNames = "student", key = "#id")]

**Configuring H2 Database**

Add below properties to application.properties file

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.driverClassName=org.h2.Driver

spring.datasource.username=sa

spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
