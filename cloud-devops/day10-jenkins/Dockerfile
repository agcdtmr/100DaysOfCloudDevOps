FROM jenkins/jenkins:lts
USER root

# Install necessary dependencies
RUN apt-get update && apt-get install -y lsb-release python3-pip curl

# Add Docker’s official GPG key
RUN curl -fsSLo /usr/share/keyrings/docker-archive-keyring.asc \
  https://download.docker.com/linux/debian/gpg

# Add Docker repository
RUN echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.asc] \
  https://download.docker.com/linux/debian $(lsb_release -cs) stable" | tee /etc/apt/sources.list.d/docker.list > /dev/null

# Install Docker CLI
RUN apt-get update && apt-get install -y docker-ce-cli

# Switch back to Jenkins user
USER jenkins

# Install necessary Jenkins plugins
RUN jenkins-plugin-cli --plugins "blueocean docker-workflow"