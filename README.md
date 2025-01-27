# CloudVendor Project

This is a Spring Boot-based project called **CloudVendor**, designed to manage cloud vendor details. The project demonstrates the use of REST APIs, database interaction, and Spring Boot's dependency management capabilities.

## Features
- Manage cloud vendor details (CRUD operations).
- RESTful APIs for retrieving, creating, updating, and deleting vendor information.
- Integration with a relational database (e.g., MySQL).
- Dependency management using Maven.

## Prerequisites
To run this project, ensure you have the following installed on your system:

- [Java 17 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (optional but recommended for development)

## Getting Started
### 1. Clone the Repository
```bash
git clone <repository_url>
cd cloudvendor
```

### 2. Set Up the Database
1. Create a MySQL database named `cloud_vendor`.
2. Configure the database connection in the `application.yml` file:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false
    username: root
    password: your_password
  jpa:
    hibernate:
      ddl-auto: update
```

### 3. Build the Project
Run the following command to build the project:
```bash
mvn clean install
```

### 4. Run the Application
Start the Spring Boot application:
```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`.

## API Endpoints
### Base URL
`http://localhost:8080/vendor`

### Endpoints
| HTTP Method | Endpoint         | Description                       |
|-------------|------------------|-----------------------------------|
| GET         | `/all`           | Retrieve all vendors             |
| GET         | `/{vendorId}`    | Retrieve a single vendor by ID   |
| POST        | `/`              | Add a new vendor                 |
| PUT         | `/{vendorId}`    | Update an existing vendor        |
| DELETE      | `/{vendorId}`    | Delete a vendor by ID            |

## Project Structure
```
cloudvendor/
├── src/main/java/com/example/demo/
│   ├── controller/            # REST controllers
│   ├── model/                 # Entity classes
│   ├── repository/            # JPA repositories
│   ├── service/               # Service layer
│   └── DemoApplication.java   # Main Spring Boot application class
├── src/main/resources/
│   ├── application.yml        # Configuration file
│   └── schema.sql             # (Optional) Database initialization script
└── pom.xml                    # Maven configuration file
```

## Dependencies
Key dependencies used in this project include:
- **Spring Boot Starter Web**: For building RESTful web services.
- **Spring Boot Starter Data JPA**: For database interaction.
- **MySQL Driver**: For connecting to the MySQL database.

Check the `pom.xml` file for the complete list of dependencies.

## Testing
Use Postman or any REST client to test the APIs by sending HTTP requests to the endpoints mentioned above.

## Future Enhancements
- Add unit and integration tests.
- Implement user authentication and authorization.
- Add support for cloud vendor categories.

## Author
Developed by Shiva Vinay

