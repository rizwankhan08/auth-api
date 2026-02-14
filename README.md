Perfect 🔥
Here is your **FULL PROFESSIONAL README** — polished, recruiter-ready, and portfolio-grade.

You can copy-paste this directly into your `README.md`.

---

# 🔐 Auth API – JWT Authentication & Role-Based Authorization

A **production-ready backend REST API** built with Spring Boot 3 implementing:

* 🔐 JWT Authentication
* 👤 Role-Based Authorization (USER / ADMIN)
* 🛡 Spring Security 6
* 🗄 MySQL Integration
* 📘 Swagger (OpenAPI 3)
* ✅ DTO Pattern
* ⚠ Global Exception Handling
* 🧱 Clean Layered Architecture
* 🚀 Stateless Security

---

## 🏗 Tech Stack

| Technology          | Version |
| ------------------- | ------- |
| Java                | 17      |
| Spring Boot         | 3.2     |
| Spring Security     | 6       |
| Spring Data JPA     | ✔       |
| MySQL               | ✔       |
| JWT (jjwt)          | 0.11.5  |
| Swagger (springdoc) | 2.x     |
| Lombok              | ✔       |

---

## 🧠 Architecture Overview

```
com.rizwan.authapi
│
├── config
│   └── OpenApiConfig
│
├── controller
│   ├── AuthController
│   └── UserController
│
├── dto
│   ├── RegisterRequest
│   ├── AuthRequest
│   └── AuthResponse
│
├── entity
│   ├── User
│   └── Role
│
├── exception
│   └── GlobalExceptionHandler
│
├── repository
│   ├── UserRepository
│   └── RoleRepository
│
├── security
│   ├── JwtService
│   ├── JwtAuthenticationFilter
│   ├── SecurityConfig
│   └── CustomUserDetailsService
│
└── service
    ├── AuthService
    └── UserService
```

---

## 🔐 Authentication Flow

1️⃣ User registers → Password encrypted using BCrypt
2️⃣ User logs in → JWT token generated
3️⃣ Client sends token in header:

```
Authorization: Bearer <your_token>
```

4️⃣ `JwtAuthenticationFilter` validates token
5️⃣ Spring Security loads user details
6️⃣ Role-based access enforced using:

```java
@PreAuthorize("hasRole('ADMIN')")
```

---

## 📘 API Endpoints

### 🔑 Authentication

| Method | Endpoint           | Description       |
| ------ | ------------------ | ----------------- |
| POST   | /api/auth/register | Register new user |
| POST   | /api/auth/login    | Authenticate user |

---

### 👤 User APIs

| Method | Endpoint           | Access     |
| ------ | ------------------ | ---------- |
| GET    | /api/users         | ADMIN only |
| GET    | /api/users/profile | USER only  |

---

## 🧪 Example Requests

### 📝 Register

```json
{
  "firstname": "Rizwan",
  "lastname": "Khan",
  "email": "rizwan@gmail.com",
  "password": "password123"
}
```

---

### 🔓 Login

```json
{
  "email": "rizwan@gmail.com",
  "password": "password123"
}
```

---

### 🔐 Access Protected Endpoint

```
GET /api/users/profile
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```

---

## 📸 Screenshots

### 🔹 Swagger UI

![Swagger UI](screenshots/swagger.png)

### 🔹 Register Endpoint

![Register API](screenshots/register1.png)
<img width="1897" height="963" alt="register2" src="https://github.com/user-attachments/assets/5b7ea284-7d29-4258-b101-2ce79249e970" />


### 🔹 JWT Token Response

![Login Response](screenshots/login1.png)
<img width="1902" height="958" alt="login2" src="https://github.com/user-attachments/assets/ce260e52-220c-4dc7-9c01-b05d1328e450" />


### 🔹 Protected Endpoint Access

![Protected API](screenshots/profile.png)

---

## ⚙️ How To Run Locally

### 1️⃣ Clone Repository

```
git clone https://github.com/rizwankhan08/auth-api.git
cd auth-api
```

---

### 2️⃣ Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/authdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Build Project

```
mvn clean package
```

---

### 4️⃣ Run Application

```
java -jar target/authapi-0.0.1-SNAPSHOT.jar
```

---

## 📘 Swagger Documentation

After running the app:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🛡 Security Features Implemented

* Stateless JWT Authentication
* BCrypt Password Encoding
* Custom JWT Filter
* Custom UserDetailsService
* Role-Based Method Security
* Secure Endpoint Configuration
* OpenAPI Bearer Authentication Integration

---

## 💎 Production-Level Practices Used

* DTO Pattern (No direct entity exposure)
* Clean Layered Architecture
* Centralized Exception Handling
* Method-Level Security
* Separation of Concerns
* Environment-Based Configuration Ready
* Swagger Integrated with Security

---

## 🚀 Future Improvements

* Refresh Token Implementation
* Email Verification
* Password Reset Flow
* Account Locking Mechanism
* Dockerization
* Deployment to Render / AWS
* Redis Caching
* Microservice Architecture Split

---

## 👨‍💻 Author

**Rizwan Khan**
🔗 GitHub: [https://github.com/rizwankhan08](https://github.com/rizwankhan08)

---

⭐ If you like this project, consider giving it a star!

---
