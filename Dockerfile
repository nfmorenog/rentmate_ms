FROM java:8

COPY /target/rentmate_anuncios_ms-0.0.1-SNAPSHOT.jar rentmate_anuncios_ms-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","rentmate_anuncios_ms-0.0.1-SNAPSHOT.jar"]