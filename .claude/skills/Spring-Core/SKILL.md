# Spring-Core Development Patterns

> Auto-generated skill from repository analysis

## Overview

This skill teaches core Spring Framework development patterns and project structures. The codebase demonstrates multiple approaches to Spring configuration, Maven project organization, and layered architecture implementation. It focuses on creating well-structured Spring modules with proper dependency management, configuration patterns, and architectural layering.

## Coding Conventions

**File Naming:**
- Use PascalCase for Java class files: `AppConfig.java`, `UserService.java`, `CustomerController.java`
- Maven artifacts follow lowercase with hyphens: `spring-core-module`

**Package Structure:**
```java
com.company.projectname/
├── entity/          // Domain models
├── repository/      // Data access layer
├── service/         // Business logic layer
├── controller/      // Presentation layer
└── config/          // Configuration classes
```

**Import Style:**
- Mixed import style with both wildcard and specific imports
- Group imports: Java standard library first, then third-party, then project imports

**Project Structure:**
```
{ModuleName}/
├── .classpath
├── .project
├── .settings/
├── pom.xml
├── src/main/java/
├── src/test/java/
└── target/classes/
```

## Workflows

### Spring Module Creation
**Trigger:** When someone wants to add a new Spring functionality module
**Command:** `/new-spring-module`

1. Create Maven project structure with Eclipse metadata files (`.classpath`, `.project`, `.settings/`)
2. Generate `pom.xml` with appropriate Spring dependencies and Maven configuration
3. Create main Java package structure with entry point `App.java`
4. Add corresponding test structure with `AppTest.java`
5. Build target classes and generate META-INF artifacts
6. Verify compilation and dependency resolution

**Example pom.xml structure:**
```xml
<groupId>com.example</groupId>
<artifactId>spring-module-name</artifactId>
<version>1.0.0</version>
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.x.x</version>
    </dependency>
</dependencies>
```

### Layered Architecture Project
**Trigger:** When someone wants to create a complete Spring application with proper layering
**Command:** `/new-layered-app`

1. Create Maven project structure with standard directory layout
2. Add JPA `persistence.xml` configuration in `META-INF/`
3. Create `AppConfig.java` for Spring Java-based configuration
4. Implement Entity classes with JPA annotations
5. Create Repository layer with data access methods
6. Create Service layer with business logic and `@Service` annotations
7. Create Controller layer with `@Controller` annotations
8. Add main `App.java` entry point to bootstrap application context

**Example layered structure:**
```java
// Entity
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name;
}

// Repository
@Repository
public class UserRepository {
    // Data access methods
}

// Service
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}

// Controller
@Controller
public class UserController {
    @Autowired
    private UserService userService;
}
```

### Spring Configuration Variants
**Trigger:** When someone wants to demonstrate different Spring configuration methods
**Command:** `/new-spring-config-demo`

1. Create base Maven project structure
2. Add configuration files based on approach:
   - XML-based: Create `spring-config.xml` with bean definitions
   - Annotation-based: Create `AppConfig.java` with `@Configuration`
   - Mixed: Combine both XML and annotation approaches
3. Create demo classes with dependency relationships (`@Autowired`, `@Component`)
4. Add `App.java` to demonstrate configuration usage and context loading
5. Build and compile all artifacts
6. Test dependency injection and bean lifecycle

**XML Configuration Example:**
```xml
<beans xmlns="http://www.springframework.org/schema/beans">
    <bean id="demoService" class="com.example.DemoService"/>
    <bean id="demoController" class="com.example.DemoController">
        <property name="demoService" ref="demoService"/>
    </bean>
</beans>
```

**Java Configuration Example:**
```java
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    @Bean
    public DemoService demoService() {
        return new DemoService();
    }
}
```

## Testing Patterns

**Test File Naming:**
- Use pattern `*Test.java` for test classes
- Place tests in `src/test/java/` following same package structure as main code

**Test Structure:**
- Basic JUnit structure with `@Test` annotations
- Focus on integration testing with Spring context loading
- Test dependency injection and bean wiring

## Commands

| Command | Purpose |
|---------|---------|
| `/new-spring-module` | Create a new Spring Framework module with complete Maven structure |
| `/new-layered-app` | Generate Spring application with Controller-Service-Repository layers |
| `/new-spring-config-demo` | Create examples of different Spring configuration approaches |
| `/add-persistence` | Add JPA persistence configuration to existing project |
| `/spring-maven-setup` | Set up Maven dependencies for Spring Framework projects |