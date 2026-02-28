# Spring-Core Development Patterns

> Auto-generated skill from repository analysis

## Overview

This skill teaches Spring Framework core development patterns focusing on enterprise Java applications with layered architecture. The codebase demonstrates Maven-based project structure with Spring dependency injection, JPA persistence, and MVC architectural patterns. It emphasizes clean separation of concerns across entity, repository, service, and controller layers.

## Coding Conventions

### File Naming
- **Classes**: PascalCase (e.g., `UserController.java`, `OrderService.java`, `ProductRepository.java`)
- **Configuration**: PascalCase with descriptive suffixes (`AppConfig.java`, `DatabaseConfig.java`)
- **Test files**: Follow pattern `*.test.*` (e.g., `UserServiceTest.java`)

### Package Structure
```
com.company.app/
├── entity/          # JPA entities
├── repository/      # Data access layer
├── service/         # Business logic layer
├── controller/      # Web/API layer
└── config/          # Spring configuration
```

### Import Style
- Mix of wildcard and specific imports as needed
- Group imports: Java standard library, third-party, Spring framework, local packages

### Spring Annotations
- Use `@Component`, `@Service`, `@Repository`, `@Controller` for layer identification
- Apply `@Autowired` for dependency injection
- Utilize `@Configuration` for Java-based configuration classes

## Workflows

### Spring Project Creation
**Trigger:** When creating a new Spring application with MVC pattern
**Command:** `/new-spring-project`

1. Generate Maven project structure with `pom.xml` including Spring dependencies
2. Create Eclipse IDE configuration files (`.classpath`, `.project`, `.settings/`)
3. Setup JPA persistence configuration in `META-INF/persistence.xml`
4. Create main application class `App.java` with Spring context initialization
5. Setup Spring configuration (`AppConfig.java` or XML-based)
6. Create entity classes for data model with JPA annotations
7. Implement repository layer extending Spring Data repositories
8. Implement service layer with business logic and `@Transactional` annotations
9. Implement controller layer for HTTP request handling
10. Create corresponding test classes (`AppTest.java`)
11. Generate compiled classes structure in `target/` directory

**Example App.java:**
```java
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

### Spring Configuration Setup
**Trigger:** When configuring Spring container and dependency injection
**Command:** `/setup-spring-config`

1. Create Spring XML configuration files with bean definitions
2. Setup application context configuration with component scanning
3. Configure dependency injection settings and bean relationships
4. Create main application entry point with context loading
5. Setup test configuration with appropriate profiles

**Example AppConfig.java:**
```java
@Configuration
@ComponentScan("com.company.app")
@EnableJpaRepositories("com.company.app.repository")
public class AppConfig {
    
    @Bean
    public DataSource dataSource() {
        // DataSource configuration
    }
}
```

### Maven Build Compilation
**Trigger:** When building or compiling a Maven Spring project
**Command:** `/maven-build`

1. Process source files from `src/main/java` directory
2. Generate compiled `.class` files in `target/classes`
3. Copy resources and configuration files to target directory
4. Generate Maven metadata and properties files
5. Create manifest files for JAR packaging
6. Process and compile test classes to `target/test-classes`

**Target Structure:**
```
target/
├── classes/
│   ├── com/company/app/
│   └── META-INF/
│       ├── MANIFEST.MF
│       └── maven/
└── test-classes/
```

## Testing Patterns

### Test Structure
- Test files follow `*Test.java` naming convention
- Use Spring's `@SpringBootTest` for integration tests
- Apply `@MockBean` for mocking Spring-managed beans
- Utilize `@TestConfiguration` for test-specific configurations

### Example Test Class
```java
@SpringBootTest
class UserServiceTest {
    
    @Autowired
    private UserService userService;
    
    @MockBean
    private UserRepository userRepository;
    
    @Test
    void shouldCreateUser() {
        // Test implementation
    }
}
```

## Commands

| Command | Purpose |
|---------|---------|
| `/new-spring-project` | Create complete Spring project with layered architecture |
| `/setup-spring-config` | Configure Spring container and dependency injection |
| `/maven-build` | Compile and build Maven project structure |
| `/add-entity` | Create JPA entity class with repository |
| `/add-service` | Create service layer with business logic |
| `/add-controller` | Create REST controller with endpoints |