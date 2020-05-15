# Hello World Rest API

### Building an Image

1. Build a Jar - /target/hello-world-rest-api.jar
2. Setup the Prerequisites for Running the JAR - openjdk:8-jdk-alpine
3. Copy the jar
4. Run the jar

### Docker Commands - Creating Image Manually

- docker run -dit openjdk:8-jdk-alpine
- docker container exec <image-name> ls /tmp
- docker container cp target/hello-world-rest-api.jar <image-name>:/tmp
- docker container exec <image-name> ls /tmp
- docker container commit <image-name> <dockerid>/hello-world-rest-api:manual1
- docker run <dockerid>/hello-world-rest-api:manual1
- docker container ls
- docker container commit --change='CMD ["java","-jar","/tmp/hello-world-rest-api.jar"]' <image-name> in28min/hello-world-rest-api:manual2
- docker run -p 8080:8080 <dockerid>/hello-world-rest-api:manual2
