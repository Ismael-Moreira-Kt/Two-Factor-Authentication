# Two-Factor Authentication

This is a Java project that generates QR codes from a provisioning URI for TOTP (Time-Based One-Time Password). <br>
It uses the ZXing library to generate the QR codes and the java-otp library to generate the provisioning URI and TOTP codes.

## Requirements
- Java 17
- Maven

## Installation and Execution
- Clone this repository to your development environment:
```bash
  git clone https://github.com/Ismael-Moreira-Kt/Two-Factor-Authentication
```
- Navigate to the project directory:
```bash
  cd Two-Factor-Authentication/src/
```
- Compile the project:
```bash
  mvn clean package
```
- Run the program (Be careful, the package name may vary):
```bash
  java -jar target/Two-Factor-1.0-SNAPSHOT.jar
```
