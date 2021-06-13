FROM openjdk:8-jre-alpine

MAINTAINER rodolfoperatello

ENV PROFILE=${PROFILE}

WORKDIR /application/fornecedor/

COPY /build/libs/fornecedor-0.0.1-SNAPSHOT.jar fornecedor.jar

EXPOSE 8081 5433

CMD java -jar fornecedor.jar --spring.profiles.active=${PROFILE}

