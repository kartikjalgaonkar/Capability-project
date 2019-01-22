# Capability-project
---

# Table of Content
* [Required softwares](#required_softwares)
* [Software Installation](#software_installation)
* [Using the application](#using-application)


## <a name="required_s oftwares"></a>Required softwares
* [STS](#https://spring.io/tools)
* [Jenkins](https://jenkins.io/)
* [GitHub](https://github.com/)
* [Sonarqube](https://www.sonarqube.org/)
* [PostgreSQL](https://www.postgresql.org/)
* [Docker](https://www.docker.com/)
* [Kubernetes](https://kubernetes.io/)
* [Elasticsearch](https://www.elastic.co/products/elasticsearch)
* [Kafka](https://kafka.apache.org/)
* [Logstash](https://www.elastic.co/products/logstash)
* [Kibana](https://www.elastic.co/products/kibana)
---

## <a name="software_installation"></a>Software Installation

<details>
  
   <summary>Jenkins Installation</summary>
   
* First, we'll add the repository key to the system.
  ```
  $ wget -q -O - https://pkg.jenkins.io/debian/jenkins-ci.org.key | sudo apt-key add -
  ```
* When the key is added, the system will return OK. Next, we'll append the Debian package repository address to the server's sources.list:
  ```
  $ echo deb https://pkg.jenkins.io/debian-stable binary/ | sudo tee /etc/apt/sources.list.d/jenkins.list
  ```
* When both of these are in place, we'll run update so that apt-get will use the new repository:
  ```
  $ sudo apt-get update
  ```
* Finally, we'll install Jenkins and its dependencies, including Java:
  ```
  $ sudo apt-get install jenkins
  ```
* Now that Jenkins and its dependencies are in place, we'll start the Jenkins server.
  ```
  $ sudo systemctl start jenkins
  ```
* By default, Jenkins runs on port 8080, so we'll open that port using ufw:
  ```
  $ sudo ufw allow 8080
  ```
</details>
