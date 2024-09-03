package Jars;

import SingletonClasses.Logging;

public class jar {
    Logging l = Logging.getInstance(); // This is the jar that you are using from the logging class
    // Jar is a bundled code
    // whenever we want to reuse a single peice of code multiple times. Then we must keep that code in the jar.
    // And then from jar, we can use that code multiple times in our codebase
    //jar is the java archive files
    // Steps to create a jar in java
    // 1) Go to File-> Project Structure
    // 2) Go to Artifacts
    // 3) Click + and jar
    // 4) From modules with dependencies
    // 5) Then Build -> build Artifacts -> build



    // Import JAR inside the new Project
    // 1) Inside the new/client project. Go to File-> Project Structure
    // 2) Go to modules -> dependencies
    // 3) Apply then Ok
    // 4) You can use the functions inside the jar


    // Disadvantages of jar
    // 1. For any changes happening in the jar, we need to re-integrate with the new jar.
    // 2. Task in manual, and keeping track of the versions is very tuff.

}
