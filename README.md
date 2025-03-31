# HBV202GAssignment9
A project skeleton for implementing the *Composite* pattern and the *Observer* pattern 
(and some sort of *Template Method* pattern) based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand 
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass9`,  
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `is.hi.hbv202g.ass9.composite`: Your implementation of the *Composite* pattern has to go there. 
    Choose class, interface, and method names so that they fit the provided test cases.
  - `is.hi.hbv202g.ass9.compositeObserved`: Your implementation of the *Composite* pattern that is combined with the 
    *Observable* patterns has to go there. Choose class, interface, and method names so that they fit the provided test cases.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: Your refactoring of the above patterns inspired by the *Template Method* pattern.
- `src/test/java`: (each package contains an `Alltests` class that collects all the test cases for the respective 
  package in one test suite, so that you can execute exactly only the testcase of the package that you are currently implementing),
  - `is.hi.hbv202g.ass9.composite`: Test cases testing a composite implementation.
  - `is.hi.hbv202g.ass9.compositeObserved`: Test cases testing an implementation of a composite where the leafs are 
   observed by the composite implementation.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: The same test cases for testing the refactoring of the 
     above patterns inspired by the *Template Method* pattern.

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, 
  `Tests`, or `TestCase`). As long as you have not finished implementing all packages, it is better to use the IDE to
  run individual test cases or package-level test suites.

## Running the Application

The Maven POM is configured to execute the main method. You can run the application using:

```bash
mvn exec:java -Dexec.mainClass="is.hi.hbv202g.ass9.CompositeMain"
```

## Documentation
Generate the project documentation (including Javadoc) by running:
```bash
mvn site
```
After the site is generated, open target/site/index.html in your browser to view the Javadoc and additional project reports.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Object-Oriented Design Documentation

The final design of the project is documented in detail in the [Design Documentation](design.html) file. This document includes a UML class diagram that captures the classes, methods, attributes, and the essential associations for the package `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`.

### Creating the Design Documentation

1. **Create the Directory and Markdown File:**
  - In your project root, create a directory: `src/site/markdown`.
  - Inside that directory, create a markdown file named, for example, `design.md`.

2. **Add the UML Class Diagram:**
  - In `design.md`, insert an image of your UML class diagram. You can either take a photo of your paper drawing or create a diagram using a tool like UMLet.
  - Use the Markdown image syntax to add your diagram. For example:

    ```markdown
    ![](design-diagram.png)
    ```
    - Ensure that the image file is in the same directory as your `design.md` file or provide the correct path to the image.
3. **Document the Design:**
  - In `design.md`, provide any additional explanations or annotations that clarify the relationships and associations in your UML diagram.
  - Make sure that the diagram reflects all the key associations, as highlighted in Chapter 9, for the Composite, Observer, and Template Method patterns in your final design.

Once completed, the link in your README.md will allow users to easily navigate to and review your design documentation.
