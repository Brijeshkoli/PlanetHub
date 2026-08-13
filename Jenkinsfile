pipeline {
    agent {
        label 'Jenkins-Agent'
    }

    tools {
        jdk 'java11'
        maven 'Maven3'
    }

    stages {

        stage('Cleanup Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Checkout from SCM') {
            steps {
                git branch: 'main',
                    credentialsId: 'gethub',
                    url: 'https://github.com/Brijeshkoli/PlanetHub/'
            }
        }

        stage('Build Application') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test Application') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
