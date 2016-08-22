#Dockerfile
FROM tomcat
MAINTAINER Jonas Eicher <jonaseicher@hotmail.com>
RUN apt-get update
RUN apt-get install -y git
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections
RUN echo "deb http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | tee /etc/apt/sources.list.d/webupd8team-java.list
RUN echo "deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu xenial main" | tee -a /etc/apt/sources.list.d/webupd8team-java.list
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys EEA14886
RUN apt-get update
RUN apt-get install -y oracle-java8-installer
RUN apt-get install -y oracle-java8-set-default
RUN git clone https://github.com/jonaseicher/man-vs-food.git
RUN cd ./man-vs-food && chmod +x gradlew && ./gradlew war
RUN cp ./man-vs-food/build/libs/man-vs-food-*.war /usr/local/tomcat/webapps/
