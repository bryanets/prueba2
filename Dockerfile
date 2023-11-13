# Usa la imagen de OpenJDK 21 como base
FROM adoptopenjdk:17-jdk-hotspot

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR construido por tu proyecto Spring en el contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Puerto en el que tu aplicación Spring expone sus servicios
EXPOSE 8080

# Comando para ejecutar tu aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]
