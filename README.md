## Java Beginner Notes
Uses classes and objects to create data structures
UML for analysis, design and architecture
### Java APIs
- array list, stack, queue,
- java streams apis - use lambda for large data sets
- java persistence api - java database connectivity protocol - database connectivity
### Enterprise
- implement back end web services
- Java EE application Server

## Three tier architecture
Browser > CDN(Page Load)  Executed java script > Back end Server(Rest Call) > Database

Okay, apologies for that! Let's restart with Eclipse as your IDE.

Here's a structured 7-day routine designed to get you started and build confidence with Java basics and Maven, tailored for the Eclipse IDE.

**Prerequisites:**

*   **Computer:** Windows, macOS, or Linux.
*   **Eclipse IDE:** Already installed (Ensure it's the "Eclipse IDE for Java Developers" or "Eclipse IDE for Enterprise Java and Web Developers" package, as these have the best Java/Maven support built-in).
*   **Time Commitment:** Aim for 2-4 hours per day. Consistency is key.
*   **Mindset:** Be patient, curious, and don't be afraid to experiment and make mistakes!

**Software to Confirm/Install (Ideally before Day 1):**

1.  **JDK (Java Development Kit):**
    *   **Recommendation:** Adoptium Temurin (OpenJDK distribution). Download the LTS (Long-Term Support) version (e.g., JDK 17 or 21). Even if Eclipse *seems* to work, having a standalone JDK installed and configured is best practice.
    *   **Resource:** [https://adoptium.net/](https://adoptium.net/)
    *   **Verification:** Open a terminal/command prompt and type `java -version` and `javac -version`. You should see the installed version.
    *   **Eclipse Configuration:** Ensure Eclipse is configured to use this JDK (Window -> Preferences -> Java -> Installed JREs. Add your JDK if it's not listed and set it as default).
2.  **Maven:**
    *   Eclipse typically includes the **m2e (Maven Integration for Eclipse)** plugin, which handles most Maven operations within the IDE.
    *   It's still good practice to have Maven installed separately for command-line use and understanding.
        *   **Resource:** [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
        *   Follow their installation guide to set up `MAVEN_HOME` and add it to your system's `PATH`.
    *   **Verification:** Open a terminal/command prompt and type `mvn -version`.
    *   **Eclipse Configuration:** Usually automatic via m2e. You can check/configure under Window -> Preferences -> Maven -> Installations.

---

**The 7-Day Routine (Eclipse Edition):**

**Day 1: Setup & Java Fundamentals**

*   **Goal:** Get your Eclipse environment confirmed and understand basic Java syntax.
*   **Tasks:**
    1.  **Confirm Setup:** Ensure JDK is installed and configured within Eclipse (check Installed JREs). Ensure the m2e plugin seems active (you should see Maven options later).
    2.  **"Hello, World!" in Eclipse:**
        *   Switch to the "Java" perspective (Window -> Perspective -> Open Perspective -> Java).
        *   Create a simple Java project (File -> New -> Java Project). Name it something like `JavaBasics`.
        *   Inside the `src` folder, create a new Class (Right-click `src` -> New -> Class). Name it `HelloWorld`, check the box to create `public static void main(String[] args)`.
        *   Write `System.out.println("Hello, World!");` inside the `main` method.
        *   Run the program (Right-click the file -> Run As -> Java Application). Observe the output in the Console view. Get comfortable with the Package Explorer, Editor, and Console views.
    3.  **Java Basics:** Learn and practice:
        *   Variables and Data Types (int, double, boolean, String, char)
        *   Basic Operators (+, -, *, /, %, ==, !=, <, >, &&, ||, !)
        *   Console Input/Output (`System.out.println()`, `Scanner` class - remember to import `java.util.Scanner`)
        *   Control Flow: `if`/`else if`/`else` statements.
    *   **Mini-Challenge:** Write a simple program that asks for the user's name and age and prints a greeting including them. Calculate their approximate year of birth. Run it within Eclipse.
*   **Resources:**
    *   [Eclipse Documentation - Basic Tutorial](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2FgettingStarted%2Fqs-BasicTutorial.htm)
    *   [Oracle Java Tutorials - Getting Started](https://docs.oracle.com/javase/tutorial/getStarted/index.html)
    *   [W3Schools Java Tutorial](https://www.w3schools.com/java/) (Quick syntax reference)

**Day 2: More Java Control Flow & Intro to OOP**

*   **Goal:** Understand loops, arrays, and the core idea of Object-Oriented Programming within Eclipse.
*   **Tasks:**
    1.  **Control Flow:** Learn and practice:
        *   Loops: `for`, `while`, `do-while`.
        *   Arrays: Declaring, initializing, and accessing elements. Looping through arrays.
    2.  **Introduction to OOP:**
        *   What are Classes and Objects? (Blueprint vs. Instance)
        *   Define a simple class (Right-click package -> New -> Class, e.g., `Car` or `Dog`) with attributes (fields/variables like `color`, `speed`) and methods (actions like `start()`, `brake()`).
        *   In your `main` method (in another class or the same one), instantiate objects using `new`.
        *   Access fields and call methods using the dot (`.`) operator.
        *   Understand constructors (special methods for object creation).
    *   **Mini-Challenge:** Create a `Book` class with attributes like `title`, `author`, `pages`. Create a few `Book` objects in your `main` method and print their details. Create an array to hold multiple `Book` objects.
*   **Resources:**
    *   [Oracle Java Tutorials - Language Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
    *   [Oracle Java Tutorials - Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
    *   [Baeldung - Intro to OOP in Java](https://www.baeldung.com/java-oop)

**Day 3: OOP Concepts & Methods**

*   **Goal:** Deepen OOP understanding (Encapsulation, Inheritance basics) and work with methods.
*   **Tasks:**
    1.  **Encapsulation:**
        *   Understand `public` and `private` access modifiers.
        *   Implement getters and setters for your class fields. (Eclipse can auto-generate these: Right-click in editor -> Source -> Generate Getters and Setters...).
    2.  **Methods:**
        *   Define methods that take parameters.
        *   Define methods that return values.
        *   Understand method overloading (same name, different parameters).
    3.  **Basic Inheritance:**
        *   Understand the `extends` keyword.
        *   Create a simple parent class and a child class that inherits from it (e.g., `Vehicle` -> `Car`). Use Eclipse's "New Class" wizard, specifying the "Superclass".
        *   Understand how the child class inherits fields and methods. Use `@Override` annotation for methods you redefine.
    *   **Mini-Challenge:** Enhance the `Car` class from Day 2 using encapsulation (use private fields and getters/setters). Add methods like `accelerate(amount)` and `getCurrentSpeed()`. Create a `SportsCar` class that extends `Car` and adds a `turboBoost()` method.
*   **Resources:**
    *   Continue with Oracle and Baeldung OOP tutorials.
    *   [GeeksforGeeks - Java OOPs Concepts](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
    *   Explore Eclipse's Source -> Generate options.

**Day 4: Introduction to Maven & Eclipse Integration (m2e)**

*   **Goal:** Understand what Maven is, why it's used, and how Eclipse integrates with it.
*   **Tasks:**
    1.  **What is Maven?** Understand its purpose: Build automation, dependency management, standard project structure.
    2.  **Core Concepts:**
        *   `pom.xml`: The heart of a Maven project.
        *   Coordinates: `groupId`, `artifactId`, `version`.
        *   Repositories: Where Maven downloads libraries (Maven Central).
        *   Dependencies: Declaring external libraries.
        *   Lifecycles & Goals: (`compile`, `test`, `package`, `install`, `clean`).
        *   Standard Directory Layout: `src/main/java`, `src/main/resources`, `src/test/java`, `src/test/resources`, `target`.
    3.  **Create a Maven Project in Eclipse:**
        *   File -> New -> Other... -> Type "Maven" -> Select "Maven Project".
        *   Check "Create a simple project (skip archetype selection)". Click Next.
        *   Enter `groupId` (e.g., `com.mycompany.app`), `artifactId` (e.g., `my-first-maven-app`), `version` (leave default `0.0.1-SNAPSHOT`), `packaging` (select `jar`). Click Finish.
        *   Explore the generated project structure (notice `src/main/java`, `src/test/java`, and `pom.xml`).
    4.  **Run Basic Goals (within Eclipse):**
        *   Right-click the project -> Run As -> Maven build...
        *   In the "Goals" field, type `compile`. Click Run. Observe the console output.
        *   Right-click the project -> Run As -> Maven clean. Observe the `target` folder disappear.
*   **Resources:**
    *   [Maven - Getting Started Guide](https://maven.apache.org/guides/getting-started/index.html)
    *   [Baeldung - Introduction to Apache Maven](https://www.baeldung.com/maven)
    *   [Eclipse m2e Documentation](https://www.eclipse.org/m2e/) (Browse, get familiar)

**Day 5: Maven Dependencies & Building**

*   **Goal:** Use Maven (via Eclipse) to manage dependencies and build a runnable JAR.
*   **Tasks:**
    1.  **Add a Dependency:**
        *   Find a simple utility library on Maven Central (e.g., Apache Commons Lang 3).
        *   **Resource:** [https://search.maven.org/](https://search.maven.org/)
        *   Open the `pom.xml` file in Eclipse (it has a specialized editor). Go to the "Dependencies" tab, click "Add...", and search for `commons-lang3` (groupId: `org.apache.commons`, artifactId: `commons-lang3`). Select the latest version and click OK. Alternatively, switch to the `pom.xml` source tab and manually add the `<dependency>` snippet inside `<dependencies>`.
        *   Save the `pom.xml`. Eclipse/m2e should automatically download the dependency (check the "Maven Dependencies" library in the Package Explorer). If not, right-click project -> Maven -> Update Project.
    2.  **Use the Dependency:** Create a simple Java class in `src/main/java` that uses a class from the added library (e.g., `import org.apache.commons.lang3.StringUtils;` then use `StringUtils.isEmpty(...)`).
    3.  **Build the Project:** Right-click the project -> Run As -> Maven build... -> Enter `package` in Goals. Click Run.
    4.  **Locate the JAR:** Look inside the `target` directory (you might need to refresh the project in Package Explorer: Right-click project -> Refresh). You should find `my-first-maven-app-0.0.1-SNAPSHOT.jar` (or similar).
    5.  **Run the JAR (Optional Command Line):** Open a terminal/command prompt, navigate to your project's `target` directory, and run: `java -jar your-artifact-id-version.jar`. (Note: For this to work directly, you need a `main` method and might need the `maven-jar-plugin` configured in `pom.xml` to specify the main class).
*   **Resources:**
    *   [Maven - Introduction to the Dependency Mechanism](https://maven.apache.org/guides/introduction/introduction-to-the-dependency-mechanism.html)
    *   [Baeldung - The pom.xml](https://www.baeldung.com/maven-pom-xml-structure)

**Day 6: Java Collections & Basic Testing with Maven/Eclipse**

*   **Goal:** Learn basic Java Collections and how Maven/Eclipse handles testing.
*   **Tasks:**
    1.  **Java Collections Framework (Basics):**
        *   Learn about `List` (specifically `ArrayList`) and `Map` (specifically `HashMap`).
        *   Practice creating, adding, removing, and iterating over Lists and Maps in your Java code.
    2.  **Introduction to Unit Testing with JUnit:**
        *   Understand the purpose of unit tests.
        *   Add the JUnit 5 dependency (e.g., `junit-jupiter-api`) to your `pom.xml` (use the Dependencies tab or edit XML). Make sure the `scope` is `test`.
    3.  **Write a Simple Test in Eclipse:**
        *   Right-click `src/test/java` -> New -> JUnit Test Case. Select "New JUnit Jupiter test". Give it a name (e.g., `MyClassTest`).
        *   Inside the generated test class, write a method annotated with `@Test` (import `org.junit.jupiter.api.Test`).
        *   Use JUnit assertions (`assertEquals`, `assertTrue`, etc. - import `org.junit.jupiter.api.Assertions.*`) to test logic from your `src/main/java` code.
    4.  **Run Tests:**
        *   **Via Eclipse:** Right-click the test file or the `src/test/java` folder -> Run As -> JUnit Test. Observe the JUnit view showing green (pass) or red (fail) bars.
        *   **Via Maven:** Right-click the project -> Run As -> Maven test. Observe the console output.
*   **Resources:**
    *   [Oracle Java Tutorials - Collections](https://docs.oracle.com/javase/tutorial/collections/index.html)
    *   [Baeldung - Introduction to JUnit 5](https://www.baeldung.com/junit-5)
    *   [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
    *   [Eclipse Help - Java Development User Guide (JDT)](https://help.eclipse.org/latest/index.jsp?topic=/org.eclipse.jdt.doc.user/gettingStarted/qs-BasicTutorial_test.htm) (Example of JUnit test creation)

**Day 7: Review, Refactor & Next Steps**

*   **Goal:** Consolidate knowledge, clean up code, and plan future learning.
*   **Tasks:**
    1.  **Review:** Go back through the concepts of each day. Look at the code you wrote in Eclipse. Review the `pom.xml` structure.
    2.  **Refactor:** Can you improve any code? Use Eclipse's refactoring tools (Right-click -> Refactor)? Add Javadoc comments? Apply OOP better?
    3.  **Experiment:** Try adding another dependency. Write more complex tests. Explore different Maven goals via Eclipse's "Run As -> Maven build...". Explore Eclipse Debugger (set breakpoints, step through code).
    4.  **Understand the Big Picture:** Reiterate *why* Maven is useful and how Eclipse's m2e plugin simplifies working with it.
    5.  **Plan Next Steps:**
        *   More Java: Exceptions, File I/O, Generics, Lambdas & Streams (Java 8+).
        *   More Maven: Profiles, Plugins (e.g., `maven-compiler-plugin` settings, `maven-shade-plugin`), Multi-module projects.
        *   Frameworks: Spring Boot (Excellent integration with Eclipse via Spring Tools Suite - STS - plugin or separate download).
        *   Build Tools: Explore Gradle (another build tool, also has Eclipse integration).
*   **Resources:** Your previous code, all the links above, start looking at Spring Boot guides ([https://spring.io/guides](https://spring.io/guides)) and Spring Tools for Eclipse ([https://spring.io/tools](https://spring.io/tools)).

---

**Tips for Success (Eclipse Context):**

*   **Code Along:** Type the code, run it frequently using Eclipse's Run command, use the Debugger.
*   **Experiment:** Change code, see errors in the "Problems" view, fix them. Try different Eclipse settings.
*   **Use Your IDE:** Leverage Eclipse's features: Content Assist (Ctrl+Space), Quick Fix (Ctrl+1), code generation (Source menu), debugging tools, JUnit integration, m2e integration. Explore different Perspectives and Views.
*   **Read Error Messages:** Eclipse's "Problems" view and the Console output are your friends. Google specific error messages.
*   **Ask Questions:** Use Stack Overflow, etc. Mention you are using Eclipse if it's relevant to the problem.
*   **Be Consistent:** Daily practice builds momentum.

Good luck with your Java and Maven journey using Eclipse!
