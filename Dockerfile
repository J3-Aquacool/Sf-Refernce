#getting base image from ubuntu
FROM ubuntu
MAINTAINER JHCOOL
RUN apt-get update
CMD ["echo","Hello Docker Image"]

