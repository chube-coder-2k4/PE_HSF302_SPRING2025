# Spring, Spring Boot, and JPA Review Questions

Below are 50 rephrased questions about Spring, Spring Boot, and JPA, with the correct answers **bolded** for review.

---

### Question 1
Which annotation identifies a class for Spring’s component scanning?  
a. @Controller  
b. @Service  
c. **@Component**  
d. @Repository  

---

### Question 2
Which annotation retrieves variables from the URL path in Spring MVC?  
a. @ModelAttribute  
b. @Request  
c. **@PathVariable**  
d. @RequestParam  

---

### Question 3
What is the purpose of the @Table annotation in JPA?  
a. To define a named query for the entity  
b. **To specify the database table name and schema mapping for an entity**  
c. To mark a field as non-persistent  
d. To indicate a one-to-one relationship  

---

### Question 4
What does the @Column annotation specify in a JPA entity?  
a. It denotes a foreign key relationship  
b. **It defines the mapping of a class field to a specific column in the database**  
c. It marks a field as the primary key  
d. It specifies the table name for the entity  

---

### Question 5
What is a key advantage of using the Spring Framework in modern Java applications?  
a. Increased manual coding effort  
b. Restriction to legacy technologies  
c. Exclusive focus on desktop applications  
d. **Enhanced modularity and integration capabilities**  

---

### Question 6
Which annotation designates a class as a configuration class in Spring?  
a. @Controller  
b. **@Configuration**  
c. @Service  
d. @Component  

---

### Question 7
What is the primary objective of Spring Boot?  
a. To replace Spring Framework entirely  
b. **To simplify Spring application development by reducing configuration overhead**  
c. To provide a new programming language  
d. To manage hardware resources  

---

### Question 8
Which annotation injects a value from an external properties file into a Spring bean?  
a. @Inject  
b. @Resource  
c. @Autowired  
d. **@Value**  

---

### Question 9
Which annotation is used to start a Spring Boot application?  
a. @StartSpring  
b. @EnableBoot  
c. @BootApplication  
d. **@SpringBootApplication**  

---

### Question 10
Which annotation defines a named query in JPA?  
a. @DefineQuery  
b. **@NamedQuery**  
c. @CustomQuery  
d. @Query  

---

### Question 11
Which annotation enables task scheduling in a Spring Boot application?  
a. @EnableTasks  
b. @Scheduled  
c. **@EnableScheduling**  
d. @TaskScheduler  

---

### Question 12
What is the main goal of dependency injection in the Spring Framework?  
a. To enforce tight coupling between classes  
b. To automatically generate UI components  
c. **To decouple object creation from business logic**  
d. To handle database connections directly  

---

### Question 13
What does the @Entity annotation indicate in JPA?  
a. It defines a repository for data access  
b. **It marks a class as a JPA entity that maps to a database table**  
c. It indicates a configuration class  
d. It marks a class for dependency injection  

---

### Question 14
What does Inversion of Control (IoC) mean in the context of Spring?  
a. Eliminating the need for dependency injection  
b. Requiring manual instantiation of all objects  
c. Directly coupling classes together  
d. **Delegating object creation and dependency management to the Spring container**  

---

### Question 15
Which annotation marks a class as a Spring-managed bean?  
a. **@Component**  
b. @BeanComponent  
c. @Injectable  
d. @ManagedBean  

---

### Question 16
How does Spring Boot support rapid application development?  
a. By enforcing manual dependency management  
b. By limiting available features  
c. **By simplifying configuration and providing a comprehensive ecosystem of starters and tools**  
d. By requiring extensive XML configuration  

---

### Question 17
Which Spring module handles core dependency injection?  
a. Spring Data  
b. Spring MVC  
c. Spring Security  
d. **Core Container**  

---

### Question 18
How does the Spring Framework improve developer productivity?  
a. By requiring extensive manual configuration  
b. By limiting integration capabilities  
c. **By reducing configuration overhead through features like autoconfiguration and dependency injection**  
d. By enforcing strict coding guidelines  

---

### Question 19
Which Spring feature supports the development of enterprise-level applications?  
a. Its limitation to small-scale projects  
b. **Its comprehensive programming and configuration model**  
c. Its focus on front-end development only  
d. Its exclusive use of XML configuration  

---

### Question 20
What does the @SpringBootApplication annotation include?  
a. It merges @Service and @Repository  
b. **It combines @Configuration, @EnableAutoConfiguration, and @ComponentScan**  
c. It integrates XML configuration with Java code  
d. It automatically creates REST endpoints  

---

### Question 21
What does ORM stand for in the context of JPA?  
a. Online Resource Mapping  
b. **Object-Relational Mapping**  
c. Object-Resource Management  
d. Operational Relational Model  

---

### Question 22
Which JPA annotation maps a Java field to a specific database column?  
a. **@Column**  
b. @JoinColumn  
c. @Id  
d. @Table  

---

### Question 23
Which annotation is typically used to declare a Spring component?  
a. @Service  
b. @Controller  
c. @Repository  
d. **@Component**  

---

### Question 24
Which annotation automatically injects dependent beans in Spring?  
a. @Resource  
b. @Inject  
c. **@Autowired**  
d. @Qualifier  

---

### Question 25
Which principle drives Spring Framework’s design for loose coupling?  
a. Singleton Pattern  
b. Factory Pattern  
c. Model-View-Controller Pattern  
d. **Dependency Inversion Principle**  

---

### Question 26
What is the function of the @Autowired annotation in Spring?  
a. It configures database connections  
b. **It automatically injects dependent beans into a component**  
c. It disables component scanning  
d. It marks a method for asynchronous execution  

---

### Question 27
Which JPA annotation defines a named query?  
a. @CustomQuery  
b. @DefineQuery  
c. @Query  
d. **@NamedQuery**  

---

### Question 28
What does "boilerplate code" mean in Spring applications?  
a. Manual SQL query construction  
b. Code used only for logging purposes  
c. **Repetitive code that is automatically handled by the framework**  
d. Complex business logic that must be written from scratch  

---

### Question 29
Which JPA annotation specifies a one-to-many relationship between entities?  
a. **@OneToMany**  
b. @ManyToMany  
c. @ManyToOne  
d. @OneToOne  

---

### Question 30
Which Spring Boot annotation combines configuration, component scanning, and auto-configuration?  
a. @EnableAutoConfiguration  
b. **@SpringBootApplication**  
c. @Configuration  
d. @ComponentScan  

---

### Question 31
What is the role of Spring’s AOP support?  
a. To configure application servers  
b. To build user interfaces  
c. To manage database transactions  
d. **To modularize cross-cutting concerns such as logging and security**  

---

### Question 32
What is a major integration benefit of the Spring Framework?  
a. Limited integration with external APIs  
b. **Seamless integration with various technologies and frameworks**  
c. Integration only with legacy systems  
d. Exclusive integration with proprietary systems  

---

### Question 33
Which Spring feature simplifies database interactions by minimizing boilerplate code?  
a. Spring Security  
b. Spring Boot  
c. Spring MVC  
d. **Spring Data**  

---

### Question 34
Which JPA annotation marks the primary key of an entity?  
a. @Primary  
b. @Key  
c. **@Id**  
d. @Column  

---

### Question 35
Which annotation resolves ambiguity when multiple beans of the same type exist in Spring?  
a. @Autowired  
b. @Resource  
c. @Component  
d. **@Qualifier**  

---

### Question 36
Which annotation binds external configuration properties to a POJO in Spring Boot?  
a. @Autowired  
b. @Value  
c. @Component  
d. **@ConfigurationProperties**  

---

### Question 37
Which annotation defines a configuration class in Spring?  
a. @ComponentScan  
b. **@Configuration**  
c. @Initialize  
d. @Setup  

---

### Question 38
What does Spring’s modular architecture enable?  
a. Development of monolithic applications only  
b. **Creation of reusable and maintainable code components**  
c. Tight coupling between components  
d. Exclusive reliance on XML configuration  

---

### Question 39
Which Spring MVC annotation binds HTTP request parameters to method arguments?  
a. @PathVariable  
b. @RequestMapping  
c. @ModelAttribute  
d. **@RequestParam**  

---

### Question 40
How does Maven benefit Spring Framework development?  
a. By enforcing strict coding standards  
b. **By streamlining dependency management and build processes**  
c. By replacing the need for an IDE  
d. By automatically generating UI components  

---

### Question 41
Which annotation indicates that a field should not be persisted in the database in JPA?  
a. **@Transient**  
b. @NotPersisted  
c. @Exclude  
d. @Ignore  

---

### Question 42
Which JPA annotation marks a field as non-persistent?  
a. @Exclude  
b. **@Transient**  
c. @Ignore  
d. @NotPersisted  

---

### Question 43
What is the Spring Framework best known for?  
a. **An application development framework for enterprise Java**  
b. A game development engine  
c. A database management system  
d. A front-end JavaScript library  

---

### Question 44
Which annotation declares a bean in a Java configuration class in Spring?  
a. **@Bean**  
b. @Autowired  
c. @Configuration  
d. @Component  

---

### Question 45
How does JPA minimize boilerplate code in data access?  
a. By enforcing manual SQL query writing  
b. By eliminating the need for database transactions  
c. **By using annotations to configure mappings and entity behavior**  
d. By requiring XML configuration for every entity  

---

### Question 46
Which annotation creates a REST controller in Spring MVC?  
a. **@RestController**  
b. @ResponseBody  
c. @Controller  
d. @WebController  

---

### Question 47
What is the primary role of JPA in Java applications?  
a. To manage application security  
b. **To map Java objects to relational database tables and manage data persistence**  
c. To handle network communication  
d. To build user interfaces  

---

### Question 48
Which JPA annotation designates a class as an entity?  
a. @Component  
b. @Id  
c. **@Entity**  
d. @Table  

---

### Question 49
Which JPA annotation identifies a field as the primary key of an entity?  
a. @Entity  
b. **@Id**  
c. @Column  
d. @GeneratedValue  

---

### Question 50
What is the function of the Spring IoC container?  
a. It handles network communications  
b. It serves static web content  
c. **It manages the lifecycle and dependencies of beans**  
d. It compiles Java code at runtime  

---

*Generated on Monday, July 28, 2025, at 01:16 AM +07*
