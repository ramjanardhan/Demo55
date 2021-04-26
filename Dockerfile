FROM openjdk:8-jdk-alpine
VOLUME /tmp
copy ./target/BootWithKubernetes-0.0.1-SNAPSHOT.jar BootWithKubernetes.jar
CMD ["java","-jar","BootWithKubernetes.jar"]