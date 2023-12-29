# spring-boot-h2database-hibernate-with-chuck-norris-jokes
Example usage in an application integrating Spring Boot with Hibernate/JPA using H2 Database
# Instructions:
1. Open your IntelliJ IDEA.
2. Create a new project from version controll by pasting the link below to URL panel to the remote repository
3. LINK: https://github.com/JakubStapf/speak-chuck-norris-jokes.git
4. and then fetch the program using the git->pull method from the local repository.
5. Reload Maven and run "ChuckNorrisJokeApplication"
6. Open your Google Chrome browser and write adress: http://localhost:8080/jokes
7. Then open next site: http://localhost:8080/h2-console/
8. Write this in your login panel"
![image](https://github.com/JakubStapf/spring-boot-h2database-hibernate-with-chuck-norris-jokes/assets/152090738/c634475a-3426-4ff8-aded-affccc64447c)
and then click "connect"
10. Click button "RandomJoke!" on site ttp://localhost:8080/jokes and then on the previus site "h2-console/login" there are saved jokes.

# Description:
This application allows for randomly displayed Chuck Norris jokes on a web page and saves them in a database.

# Technologies/Libraries used:
- JSON to Java class conversion (POJO)
- Implementation of the Chuck Norris Random Jokes API
- Generating Java classes from JSON for an external API
- JSON content parsing library - Jackson
- Class for handling response content from an external API
- Service class for communicating with the external API
- Handling HTTP GET requests using the OkHttp library
- Unit testing for the Service class's run() method using the JUnit library
- Logger for the Service class to log method actions
- Converting JSON/String content to a Java class object - Gson library
- Unit testing for the Service class's convert() method using the JUnit library
- Sprig Boot with H2 Database
- Configuration of Hibernate in Spring Boot, including the use of the @Entity annotation
