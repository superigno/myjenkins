**Running Jenkins with Maven inside a Docker container**

1. mkdir downloads  

2. mkdir m2deps  

3. Run the ff inside downloads folder to download jdk and maven:
- curl -O http://mirror.cnop.net/jdk/linux/jdk-8u131-linux-x64.tar.gz
- curl -O http://mirror.cnop.net/jdk/linux/jdk-7u76-linux-x64.tar.gz
- curl -O https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.5.0/apache-maven-3.5.0-bin.tar.gz

4. Build myjenkins image:  
`docker build -t myjenkins .`

5. Run docker image:  
`docker pull sonarqube`  
`docker run -p <sonar_port>:9000 --rm --name mysonar sonarqube`  

Or download and run sonarqube from another server and start

6. a Run myjenkins image to create a container:  
`docker run -p 8080:8080  -v $(pwd)/downloads:/var/jenkins_home/downloads -v $(pwd)/jobs:/var/jenkins_home/jobs/ -v $(pwd)/m2deps:/var/jenkins_home/.m2/repository/ --rm --name myjenkins -e SONARQUBE_HOST=http://<sonar_ip_address>:<sonar_port> myjenkins:latest`

   b. Run using docker-compose (using docker-compose.yml):
   
    - Rebuild image using `docker-compose build --no-cache`
    - Run using `docker-compose up`



Reference: https://dzone.com/articles/dockerizing-jenkins-2-setup-and-using-it-along-wit
