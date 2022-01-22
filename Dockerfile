FROM openjdk:17-jdk-alpine

RUN apk update && apk add curl tzdata

RUN mkdir -p -m 0775 /apps/jars
WORKDIR /apps/jars
ADD ./build/libs/RecipeApp-0.0.1-SNAPSHOT.jar /apps/jars/RecipeApp.jar

ENTRYPOINT ["java", "-jar", "/apps/jars/RecipeApp.jar"]