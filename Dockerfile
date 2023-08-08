FROM gradle:jdk16
COPY ./ ./
RUN gradle build --no-daemon
CMD ["java","-jar","build/libs/postman-1.0.jar"]