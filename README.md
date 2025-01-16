# User Management CRUD Backend with Spring Boot

This project is the backend of a User Management application built using Spring Boot. It exposes REST APIs to handle CRUD operations (Create, Read, Update, Delete) for managing users. The backend communicates with a database to store and retrieve user data.

Link to frontend: https://github.com/xvickyx96/fullstack.front

## Features
- API to create a new user
- API to fetch a list of users
- API to update user information
- API to delete users

## Installation

To get started with this project, follow these steps:

### 1. Clone the repository
Clone this repository to your local machine:
git clone https://github.com/your-username/user-management-spring-boot-backend.git

### 2. Install dependencies
Navigate to the project folder and install the necessary dependencies. The project uses Maven or Gradle to manage dependencies.

For Maven:
mvn install

### 3. Configure the database
Make sure to configure the database connection in the src/main/resources/application.properties or application.yml file. You can adjust the database settings like URL, username, and password according to your environment.

Example configuration (MySQL):
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update

### 4. Run the application
After the dependencies are installed and the database is configured, run the application:

The backend server will start and be available at http://localhost:8080.
