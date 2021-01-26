# SpringBoot R2dbc Reactive APIs

## Tech Stack:
* Java 11
* Spring Boot
* Postgres
* hibernate


## Requirements
* [Java 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
* [Gradle](https://gradle.org/install/) 
* Editor of your choice (IntelliJ, STS or Eclipse), configure the editor with [lombok](https://projectlombok.org/setup/intellij) support.
* [Postgres Database](https://www.postgresql.org/download/macosx/)
	
# application.yml:
	```
	  datasource:
	    url: jdbc:postgresql://localhost:5432/employees
	    username: postgres
	    platform: postgres
	  jpa:
	    hibernate.ddl-auto: update
	    show-sql: true
	    properties:
	      hibernate:
	        dialect: org.hibernate.dialect.PostgreSQLDialect
	```