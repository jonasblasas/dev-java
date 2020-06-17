FROM debian:buster

RUN apt-get update && \
    apt-get -y install default-jre default-jdk

VOLUME ["/workspace/src"]
WORKDIR /workspace/src