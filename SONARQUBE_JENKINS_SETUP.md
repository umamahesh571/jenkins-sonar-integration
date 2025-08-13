# SonarQube Installation and Jenkins Integration Guide..

## 1. Install SonarQube Server (Ubuntu)

### Prerequisites:
- Minimum 2 GB RAM
- Java 17 installed
- PostgreSQL or embedded DB
- Open ports: 9000 (web), 9092 (backend)

### Install Java 17
```bash
sudo apt update
sudo apt install -y openjdk-17-jdk
```

### Download and Setup SonarQube
```bash
wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-10.5.1.90531.zip
unzip sonarqube-10.5.1.90531.zip
sudo mv sonarqube-* /opt/sonarqube
```

### Create SonarQube user
```bash
sudo useradd -m -d /opt/sonarqube -r -s /bin/bash sonar
sudo chown -R sonar:sonar /opt/sonarqube
```

### Start SonarQube
```bash
sudo -u sonar /opt/sonarqube/bin/linux-x86-64/sonar.sh start
```
Access: http://<server-ip>:9000 (default login: admin/admin)

---

## 2. Configure SonarQube in Jenkins

### 1. Install SonarQube Plugin
- Go to **Jenkins → Manage Jenkins → Plugins**
- Search and install **SonarQube Scanner**

### 2. Configure SonarQube Server
- Go to **Manage Jenkins → Configure System**
- Under **SonarQube servers**, add:
  - Name: SonarQube
  - Server URL: `http://<your-sonarqube-ip>:9000`
  - Add authentication token (generate in Sonar UI under "My Account → Security")

### 3. Install SonarScanner CLI (Optional)
```bash
wget https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-5.0.1.3006-linux.zip
unzip sonar-scanner-*.zip
sudo mv sonar-scanner-* /opt/sonar-scanner
```
Add to PATH in Jenkins or system.

---

## 3. Jenkinsfile Stages (Already Provided)

- **Checkout** → Git clone
- **SonarQube Analysis** → Trigger static analysis and coverage
- **Maven Build** → Compile and test

---

## 4. Ensure Jenkins Maven Job Configuration

- Use `withSonarQubeEnv('SonarQube')` in Jenkinsfile
- Include JaCoCo plugin in `pom.xml` (already included)

--- 

## 5. Expected Output

- Jenkins console will show SonarQube scan
- Sonar dashboard will show:
  - Code Smells
  - Bugs
  - Vulnerabilities
  - Coverage >85% ✅
