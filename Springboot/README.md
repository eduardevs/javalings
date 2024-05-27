@SpringFramework
start point of the app.



@RestApplication
this comes from spring web dependency which manage all the metadata, to create without all the details a controller in springboot 

@GetMapping(path="");
method to get request



- application.properties : to make the configuration for the app

- test/java/:
where all the test are store and use in the app

the folder where the tests of springboot 


- pom.xml (maven)
intellij is well integrated with Maven.
(find right menu to see more details of maven)

## Apache Maven
build tool:
it helps programmers manage their projects and all the thing they need to build their programs. The dependencies have other depedencies, and maven manage this.
(build, share the paclages, test)

[image1] maven manage all depedencies and build, and test the projects
it pacakges up building it and testing

command :
./mvnw clean compile

### Maven concepts
* maven wrappers
- mvnw [options] [<goals> [<phase>]]
phase : lifecycle, a phase can contain one or more goals,
lyfecycle is the order of things in order to achieve a goal

maven contains 3 phases :
clean : - removed temporary directories and files

default : - where the most useful goals live.

site : where documentation is generated (reports, java docs)

#### clean in detail
mvnw clean
    - pre-clean : hook for before cleaning

    - clean : does the actual cleaning

    - postcl-clean: hook for after cleaning

    target directory is the direc that maven uses where it puts all of the stuff that it processes, reports and vuilt artifacts

    So ./mvnw clean allors to delete target

    [img-maven-2]

    maven default phase is a lyfecycle

    compile : - compiles your code into bytecode
    test : - run unit tests
    package : creates a jar or a war file
    verify : runs checks & integration tests

    each one depend on the others by order

ex : 
./mvnw compile

(we got the target compiled)

./mvnw clean ()for delete

./mvnw test 
to test the compiled files class
we can see the default-compile go before the test

./mvnw package
- we got a jar file with the artifacts (we didnt get this before)

./mvnw verify
we need a maven plugin, we get again a jar file in target


HOW TO USE IT IN A SPRINGBOOT PROJECT ?
main directory

ressources/application.properties

test directory
in test we can create a resources directory too. by defualt we only get java

this is to place configuration files (static files)

maven places the rest in target (compiled classes)

this structure is required to use maven and springboot
[summary-union-improvement]




