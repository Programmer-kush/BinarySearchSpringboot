# BinarySearchSpringboot

![Project Logo](IMG/logo.png)

## Overview
BinarySearchSpringboot is a Spring Boot application that demonstrates the implementation of the binary search algorithm. It is designed to be simple, efficient, and easy to understand.

## Features
- Implementation of binary search algorithm.
- REST API for searching elements in a sorted array.
- Lightweight and fast Spring Boot application.

## Prerequisites
- Java 11 or higher
- Maven 3.6+
- Spring Boot 2.5+

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/BinarySearchSpringboot.git
    ```
2. Navigate to the project directory:
    ```bash
    cd BinarySearchSpringboot
    ```
3. Build the project:
    ```bash
    mvn clean install
    ```

## Usage
1. Run the application:
    ```bash
    mvn spring-boot:run
    ```
2. Access the API at `http://localhost:8080`.

## API Endpoints
- **POST /search**  
  Request Body:
  ```json
  {
     "array": [1, 2, 3, 4, 5],
     "target": 3
  }
  ```
  Response:
  ```json
  {
     "index": 2
  }
  ```

## Project Structure
```
BinarySearchSpringboot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   └── test/
├── IMG/
│   ├── logo.png
│   ├── example.png
├── pom.xml
└── README.md
```

## Example
![Example Usage](IMG/example.png)

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries, please contact [your-email@example.com].