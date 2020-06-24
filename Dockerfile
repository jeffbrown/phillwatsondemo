FROM openjdk:14-alpine
COPY target/phillwatsondemo-*.jar phillwatsondemo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "phillwatsondemo.jar"]