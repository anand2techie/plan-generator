# Lendico Plan Generator
Repayment Plan Generator with Java 8 and Spring Boot &amp; MVC for Lendico

## Running the project locally

### Installation

Clone this repository:

```sh
$ git clone https://github.com/anand2techie/plan-generator.git
```

Build with Maven

```sh
$ cd <your_git_home>/lendico-plangenerator
$ mvn install
```

### Running the application

Start the Spring Boot application

```sh
$ cd <your_git_home>/lendico-plangenerator
$ java -jar target/lendico-plangenerator-0.0.1-SNAPSHOT.jar
```

### Making a HTTP POST request

Using your favourite HTTP client, run a POST request to the URL:

```
http://localhost:8080/generate-plan
```

As for the JSON payload, start with the example below:

```
{
  "loanAmount": "5000",
  "nominalRate": "5.0",
  "duration": 24,
  "startDate": "2018-01-01T00:00:01Z"
}
```
## It has to go beyond...

Please consider that this code took less than 24 hours to be done, so the unit
tests, security, design patterns, HTTP error handlers and exceptional scenarios handlers, database usage, Spring data JPA, using Swagger etc. need to be way
improved.

Happy coding =] Peace.