# Task Tracker API
A REST API exercise in Java and Spring Boot for managing tasks.

## Features
- Retrieve all tasks
- Retrieve 1 task by ID
- Create a new task
- Update an existing task
- Delete a task
- Automated tests using JUnit and MockMvc

## Technologies
- Java 21
- Spring Boot
- Maven
- JUnit
- MockMvc

## API Endpoints
| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/tasks` | Retrieve all tasks |
| GET | `/api/tasks/{id}` | Retrieve a task by ID |
| POST | `/api/tasks` | Create a task |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |

## Running the Application
Run `Tasktrack3kapiApplication.java` from IntelliJ IDEA.

The application runs on `http://localhost:8081`.

## Data Storage
Tasks stored in memory. Data resets when the application restarts.
## Tests

Run `Tasktrack3kapiApplicationTests.java` from IntelliJ IDEA to execute the automated tests.
