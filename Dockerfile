FROM debian

RUN apt-get update
RUN apt install default-jdk -y

RUN apt install -y mariadb-client
RUN apt install -y mariadb-server

RUN apt install -y maven

ADD ./  home/school_panel/

RUN cd /home/school_panel && mvn clean && mvn install

ENTRYPOINT ["java","-Xms1024m", "-Xmx1024m", "-XX:-UseGCOverheadLimit","-Djava.security.egd=file:/dev/./urandom","-jar","/home/school_panel/target/school_panel-0.0.1-SNAPSHOT.jar"]
