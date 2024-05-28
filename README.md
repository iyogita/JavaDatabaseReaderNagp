# Java Database Reader (Nagp)

This Java application reads data from a MySQL database and provides it through a web service.

## Repository and Links

- **Repository URL:** [GitHub Repository](https://github.com/iyogita/JavaDatabaseReaderNagp)
- **Docker Hub URL:** [Docker Hub Repository](https://hub.docker.com/repository/docker/iyogita/demo-app/general)
- **Docker Image URL:** [Docker Image](https://hub.docker.com/layers/iyogita/demo-app/3.0/images/sha256-7664c768de0cdbc1f27d4efb30e44b288a0d3761840a8818449e94327803cce6?context=repo)
- **Service URL:** [http://35.239.191.156/records](http://35.239.191.156/records) (Note: External IP will change as cluster deletion is needed to avoid billing issues)
- **Recording URL:** [Presentation Video](https://nagarro-my.sharepoint.com/:v:/p/yogita_singh/ER4C6iQys-9Gifiu8HzFdxwBY8uPUwuXykuaw1g-jrh2gg?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=HrAhFs)

## Description

The Java Database Reader (Nagp) is a Java-based application designed to read data from a MySQL database. The data is exposed through a RESTful web service, making it accessible via HTTP requests.

Api's :

1. / :(Default Message)
2. /records :(Fetch Records form DB)
3. /fibonacci :(Run a fibonacci of n=100 to increase load)


## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK)
- Docker
- Kubernetes (kubectl)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/iyogita/kubernetesDatabaseReaderNagp.git
   cd kubernetesDatabaseReaderNagp


2. **Build the Docker image:**

    On commit/pr as workflow is setup.

    ```bash
   docker build -t iyogita/demo-app:latest .

2. **Push the Docker image to Docker Hub:**

    On commit/pr as workflow is setup.

    ```bash
   docker push iyogita/demo-app:latest



2. **To run the java application locally:**

   ```bash
   Enable spring.profiles.active=local
   mvn clean install
   java -jar target/<demo-1.0-SNAPSHOT.jar>