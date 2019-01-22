# Capability-project
---

# Table of Content
* [Required softwares](#required_softwares)
* [Software Installation](#software_installation)
* [Using the application](#using-application)


## <a name="required_s oftwares"></a>Required softwares
* [STS](https://spring.io/tools)
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
* Since systemctl doesn't display output, we'll use its status command to verify that it started successfully:
  ```
  $ sudo systemctl status jenkins
  ```
* If everything went well, the beginning of the output should show that the service is active and configured to start at boot:
  ```
  Output
  ● jenkins.service - LSB: Start Jenkins at boot time
  Loaded: loaded (/etc/init.d/jenkins; bad; vendor preset: enabled)
  Active:active (exited) since Thu 2017-04-20 16:51:13 UTC; 2min 7s ago
    Docs: man:systemd-sysv-generator(8)
  ```
* By default, Jenkins runs on port 8080, so we'll open that port using ufw:
  ```
  $ sudo ufw allow 8080
  ```
* We can see the new rules by checking UFW's status.
  ```
  $ sudo ufw status
  ```
* We should see that traffic is allowed to port 8080 from anywhere:
  ```
  Output
  Status: active

  To                         Action      From
  --                         ------      ----
  OpenSSH                    ALLOW       Anywhere
  8080                       ALLOW       Anywhere
  OpenSSH (v6)               ALLOW       Anywhere (v6)
  8080 (v6)                  ALLOW       Anywhere (v6)
  ```
* Note: If the firewall is inactive, the following commands will make sure that OpenSSH is allowed and then enable it.
  ```
  $ sudo ufw allow OpenSSH
  $ sudo ufw enable
  ```
  
* To set up our installation, we'll visit Jenkins on its default port, 8080, using the server domain name or IP address: http://ip_address_or_domain_name:8080

* We should see "Unlock Jenkins" screen, which displays the location of the initial password
* In the terminal window, we'll use the cat command to display the password:
  ```
  $ sudo cat /var/lib/jenkins/secrets/initialAdminPassword
  ```
* We'll copy the 32-character alphanumeric password from the terminal and paste it into the "Administrator password" field, then click "Continue". The next screen presents the option of installing suggested plugins or selecting specific plugins.
* We'll click the "Install suggested plugins" option, which will immediately begin the installation process.
* When the installation is complete, we'll be prompted to set up the first administrative user. It's possible to skip this step and continue as admin using the initial password we used above, but we'll take a moment to create the user.
* Once the first admin user is in place, you should see a "Jenkins is ready!" confirmation screen.

</details>
