# 🛒 E-Commerce Backend Application

A robust, secure, and scalable RESTful E-Commerce backend API developed using **Java 17** and **Spring Boot 3.x**.

Developed by **[Sandesh](https://github.com/Sandeshk8/)** 🚀

---

## 🎯 Project Purpose

> [!NOTE]  
> **Practice & Skill Refinement**  
> This project was developed as a hands-on practice application to brush up on and solidify beginner-to-intermediate **Java** and **Spring Boot** skills. It demonstrates core backend capabilities, database schema modeling, request validation, secure endpoints via JWT authentication, and transactional business logic.

---

## 🌟 Key Features

### 👤 User Capabilities
- **Auth & Onboarding:** Secure Registration & Login using JSON Web Tokens (JWT) and Auth0.
- **Product Catalog:** Browse categories and view list of products belonging to specific categories.
- **Cart Management:** Add products to cart, update quantities, remove products, and automatically calculate discounts/special prices.
- **Order Placement:** Order products from the cart, select payment methods, and monitor order status.
- **Address Management:** Store and associate multiple delivery addresses to user profiles.

### 🛡️ Admin Capabilities
- **User Management:** Full administration over user records and access roles.
- **Inventory Controls:** Add, update, and delete products (including uploading product images).
- **Categories Control:** Manage product categories.
- **Order Tracking:** Retrieve and update order processing status (e.g., set order status from "Order Accepted" to shipped).

---

## 🛠️ Technology Stack & Libraries

- **Language:** Java 17
- **Framework:** Spring Boot 3.0 (Spring MVC, Spring Security, Spring Data JPA)
- **Database:** MySQL
- **ORM / Persistence:** Hibernate / JPA
- **Security:** JSON Web Tokens (JWT) & Auth0 Integration, BCrypt Hashing
- **Utilities:** ModelMapper (Entity to DTO conversion), Lombok (boilerplate reduction), Jakarta Validation (input sanitization)
- **Documentation:** OpenAPI 3.0 & Swagger UI

---

## 🏗️ Architecture & Low-Level Design (LLD)

This project adopts clean architectural guidelines to enforce a separation of concerns:

- **Layered (3-Tier) Architecture:** Organized into Presentation (Controllers), Business Logic (Services), and Data Access (Repositories) layers to ensure decoupled components.
- **Data Transfer Object (DTO) Pattern:** Decouples internal database entities from external API contracts to protect sensitive database layouts.
- **Chain of Responsibility Pattern:** Implemented via Spring Security Filter Chains, validating JWT auth credentials before requests hit internal endpoints.
- **Global Interceptor Pattern:** Utilizes `@RestControllerAdvice` to handle exceptions globally and return unified error response shapes (`APIResponse`).
- **Singleton Design Pattern:** Leverages Spring's Inversion of Control (IoC) container to manage and inject thread-safe singleton beans.
- **ACID Transaction Management:** Implemented via `@Transactional` to guarantee database consistency during multi-step procedures like checking out and updating product stock.

---

## 🚀 Future Roadmap

To keep leveling up my Spring Boot & backend development skills, here is what I plan to build next:
- [ ] **Dockerization:** Containerize the Spring Boot application and MySQL database using Docker Compose for easier setup.
- [ ] **Comprehensive Testing:** Add unit and integration tests using JUnit 5, Mockito, and Testcontainers.
- [ ] **CI/CD Pipeline:** Set up GitHub Actions to run tests automatically on every push.
- [ ] **Frontend Integration:** Build a React or Next.js app to consume these APIs and make a full-stack project.

---

## 📊 Database Schema (ER-Diagram)

The application models relationships including:
- `User` ⇄ `Role` (**Many-to-Many**)
- `User` ⇄ `Address` (**Many-to-Many**)
- `User` ⇄ `Cart` (**One-to-One**)
- `Category` ⇄ `Product` (**One-to-Many**)
- `Cart` ⇄ `CartItem` (**One-to-Many**)
- `Order` ⇄ `OrderItem` (**One-to-Many**)
- `Order` ⇄ `Payment` (**One-to-One**)

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK 17** or higher
- **Maven** 3.x
- **MySQL Database Server**

### Step-by-Step Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Sandeshk8/ECommerceApplication.git
   cd ECommerceApplication
   ```

2. **Configure Database:**
   Open [application.properties](file:///c:/Users/sande/Desktop/Github%20projects/ECommerceApplication/src/main/resources/application.properties) and update the MySQL datasource details to point to your local database instance:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   ```

3. **Build the Application:**
   ```bash
   mvn clean install
   ```

4. **Run the Application:**
   Run the main class [ECommerceApplication.java](file:///c:/Users/sande/Desktop/Github%20projects/ECommerceApplication/src/main/java/com/app/ECommerceApplication.java) directly in your IDE, or run via command line:
   ```bash
   mvn spring-boot:run
   ```

---

## 📖 API Documentation & Swagger UI

Once the application is running, access the interactive API Swagger documentation to test endpoints directly:

🔗 **Swagger UI:** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
