## Building Full-Stack Web Apps with Spring framework

###Lab11: containing the following endpoints:
+ "/": returns a splash page that can navigate you through the web page.
+ "/hello": return Hello World!
+ "/capitalize/{word}": returns the parameter passed in the URL in capital letters.
+ "/albums":returns a list of albums with their title, singer, length, song count and an image.

###Lab12: containing the following endpoints:
+ "/addalbum": inserts an album object into the database using an interface extending the CRUD Repository interface.
**You should have those dependencies installed(put them in the dependencies in the gradle.build file and then reload the gradle):**
    
      dependencies {
      implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
      implementation 'org.springframework.boot:spring-boot-starter-web'
      developmentOnly 'org.springframework.boot:spring-boot-devtools'
      providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'
      testImplementation 'org.springframework.boot:spring-boot-starter-test'
      implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
      runtimeOnly 'org.postgresql:postgresql'
      }

### Setup:
To run this app, you should do the following:
+ Clone the repo from here: [https://github.com/AnasAlRamahi/Songr](https://github.com/AnasAlRamahi/Songr).
+ Build the project through the IDE (e.g. IntelliJ).
+ Now you can open on the localserver:8080 to see the results.
    *As simple as that :)*