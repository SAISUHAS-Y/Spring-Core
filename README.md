# 🌱 Spring Core – Foundation Projects

> A structured journey through Spring Core concepts — from IOC basics to layered architecture implementation.

---

## 🧩 About This Repository

This repository contains practical implementations of **Spring Core fundamentals**.  
Each module focuses on a specific concept to build a strong understanding of how Spring manages objects, dependencies, and application structure.

These projects serve as the backbone before moving into **Spring MVC** and **Spring Boot**.

---

## 📂 Modules Included

| Order | Module Name | Focus Area |
|-------|------------|------------|
| 1 | `Spring_DI` | Dependency Injection (XML Based) |
| 2 | `Spring_Application_Context` | Spring Container & Bean Lifecycle |
| 3 | `Spring_Autowiring` | Automatic Dependency Injection |
| 4 | `Spring_Annotation` | Annotation-Based Configuration |
| 5 | `Spring_HalfAnnotation` | XML + Annotation Hybrid Config |
| 6 | `Spring_Layers` | Layered Architecture |
| 7 | `Spring_Player_Project` | Mini End-to-End Implementation |

> ⚠ `.metadata` is IDE-generated and not part of application logic.

---

## 🔍 Concept Journey

### 🔹 Dependency Injection (Spring_DI)
Understanding how Spring removes tight coupling using:
- Constructor Injection
- Setter Injection
- IOC container

---

### 🔹 Spring Container Deep Dive (Spring_Application_Context)
- ApplicationContext vs BeanFactory
- Bean lifecycle management
- Scope handling (Singleton, Prototype)

---

### 🔹 Autowiring (Spring_Autowiring)
- `@Autowired`
- Constructor injection (recommended approach)
- Qualifiers for resolving ambiguity

---

### 🔹 Annotation Configuration (Spring_Annotation)
- `@Component`
- `@Service`
- `@Repository`
- Component scanning

---

### 🔹 Hybrid Configuration (Spring_HalfAnnotation)
- Mixing XML & annotations
- Flexible bean declaration
- Configuration strategies

---

### 🔹 Layered Design (Spring_Layers)
Implementation of:
- Controller layer
- Service layer
- DAO layer
- Clean separation of concerns

---

### 🔹 Mini Project (Spring_Player_Project)
A small structured project demonstrating:
- Real-world object modeling
- Dependency wiring
- Layer interaction
- Complete project structure

---

## 🏛 Architecture Representation
Main Class
↓
Spring Container (IOC)
↓
Service Layer
↓
DAO Layer


---

## ⚙️ Tech Stack

- Java
- Spring Core
- Maven
- Eclipse IDE

---

## 🚀 Running the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/your-repository-name.git

---

## 2️⃣ Import into IDE

- Open **Eclipse** or **IntelliJ IDEA**
- Select: **Import → Existing Maven Project**
- Choose the repository folder

---

## 3️⃣ Execute

- Locate the **main class** inside the module
- Right-click → **Run As → Java Application**
- Observe the console output

---
