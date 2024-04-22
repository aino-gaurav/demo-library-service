FROM openjdk:8u252-slim
COPY env-config /app/env-config
COPY target/LibraryService.jar /app
COPY Dockerfile /app/Dockerfile
WORKDIR /app/
CMD ["java", "-jar", "LibraryService.jar", "--deployment.mode=STANDALONE"]
