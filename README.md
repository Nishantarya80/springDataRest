# springDataRest

Perform CRUD operation via API
Deployed on heoku
Database used Postgres (Hosted on heroku)

## CRUD

### GET

https://spring-rest-crud.herokuapp.com/products

### POST

https://spring-rest-crud.herokuapp.com/products

Or

https://spring-rest-crud.herokuapp.com/products/id where 'id' is id in schema

```java
    // Body Json 
    {
        "id": 13, //Long
        "name": "iphone", //String
        "description": "good", //String
        "price": 800.0  //Double
    }
```

### PUT

https://spring-rest-crud.herokuapp.com/products

```java
    // Body Json 
    {
        "id": 13, //Long
        "name": "iphone", //String
        "description": "good", //String
        "price": 800.0  //Double
    }
```
### DELETE

https://spring-rest-crud.herokuapp.com/products/id

### Dependency 
```javascript
  <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			 <groupId>org.postgresql</groupId>
			 <artifactId>postgresql</artifactId>
		</dependency> 
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

### Application.Properties
```java
  # ========== Database Config ================
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=<url>
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.application.name = <appname>

# ========== Server Config===========
server.port=8081
```


