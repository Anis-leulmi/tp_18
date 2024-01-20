FROM tomcat:latest
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/tp_18-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/tp_18-0.0.1-SNAPSHOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
