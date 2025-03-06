
\# Task Management Web Application 

\## Overview

This project is a web-based Task Management Application built with Java
and Spring Boot. The application allows users to create, update, and
delete tasks. It also displays a list of tasks and provides a
user-friendly interface for managing them. The project demonstrates key
software engineering concepts, such as separation of concerns, layering,
and RESTful services.

\## Features

\- Add new tasks with a name and description.

\- Mark tasks as completed or incomplete.

\- Delete tasks.

\- View a list of all tasks in an organized manner.

\- Intuitive web-based graphical user interface (GUI).

\- RESTful API for handling task management operations.

\## Tech Stack

\- \*\*Backend\*\*: Java, Spring Boot

\- \*\*Frontend\*\*: HTML, CSS, JavaScript

\- \*\*Database\*\*: H2 Database (or any other database can be used,
such as MySQL)

\- \*\*Build Tool\*\*: Maven

\- \*\*Version Control\*\*: GitHub

\## Setup Instructions

\### Prerequisites

To run this project locally, ensure that you have the following
installed on your machine:

\- Java Development Kit (JDK) 8 or higher

\- Maven

\- Git

\- A web browser

\### Steps to Set Up Locally

1\. \*\*Clone the Repository\*\*:

git clone  https://github.com/RishikeshPatel98/TaskManagerApplication.git

2.  **Navigate to the Project Directory**:

> cd task-management-app

3.  **Install Dependencies**: Use Maven to install the necessary
    dependencies:

> mvn clean install

4.  **Run the Application**: Start the Spring Boot application:

> mvn spring-boot:run

5.  **Access the Application**: Open your web browser and go to the
    following URL:

> http://localhost:8080

**Database Configuration**

By default, the project uses an H2 in-memory database. If you\'d like to
switch to another database, such as MySQL or PostgreSQL, follow these
steps:

1.  Update the application.properties file with the appropriate JDBC
    connection, username, and password.

2.  Add the required database dependencies in the pom.xml file.

For example, for MySQL:

spring.datasource.url=jdbc:mysql://localhost:3306/yourdb

spring.datasource.username=yourusername

spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

**REST API Endpoints**

-   **GET /tasks**: Retrieve all tasks.

-   **POST /tasks**: Create a new task.

-   **POST /tasks/{id}/complete**: Mark a task as completed.

-   **DELETE /tasks/{id}**: Delete a task by its ID.

**Example Usage**

**Adding a New Task**

1.  Navigate to the homepage.

2.  Fill in the task name and description in the input form.

3.  Click \"Add Task\" to submit the task.

**Viewing Tasks**

-   A list of all tasks is displayed on the homepage. Completed tasks
    are marked accordingly.

**Completing a Task**

-   Click the \"Mark as Completed\" button next to a task to change its
    status.

**Deleting a Task**

-   Click the \"Delete\" button next to a task to remove it from the
    list.

**Project Structure**

**(bash)**

task-management-app/

│

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com/

│ │ │ └── example/

│ │ │ └── taskmanagement/

│ │ │ ├── controller/ \# REST Controllers

│ │ │ ├── service/ \# Business Logic

│ │ │ ├── repository/ \# Data Access Layer

│ │ │ └── model/ \# Task Entity

│ │ ├── resources/

│ │ │ ├── application.properties \# Configuration

│ │ │ └── templates/ \# Frontend (HTML files)

│ ├── test/

│ └── java/ \# Unit Tests

│

├── pom.xml \# Project Dependencies

└── README.md \# Project Documentation

**Version Control**

-   The project source code and necessary documentation are
    version-controlled in a GitHub repository.

-   Ensure to commit frequently and push your changes to the repository
    using Git.

**Contribution Guidelines**

Contributions are welcome! If you\'d like to add new features, improve
existing code, or fix bugs, follow these steps:

1.  Fork the repository.

2.  Create a new branch for your feature/fix.

3.  Commit your changes.

4.  Open a Pull Request with a description of the changes.

**License**

This project is licensed under the IUBH International Hochschule License.

**Contact**

For any queries or support, please contact:

-   **Email**: patelrishikesh66@gmail.com

-   **GitHub**: https://github.com/RishikeshPatel98


This \*\*README.md\*\* provides the necessary details to set up, run,
and understand the Task Management Web Application. You can adjust the
sections to fit your specific project.

