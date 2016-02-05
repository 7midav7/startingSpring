call mvn clean
call mvn install
cd target
java -jar com.epam.spring.core-0.0.1-SNAPSHOT.jar
cd ..