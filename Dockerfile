FROM java:8
MAINTAINER xinyu 30540047@qq.com
VOLUME /tmp
ADD target/miscellaneous-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar", "--spring.profiles.active=local", "--server.port=8091"]
