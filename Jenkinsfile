pipeline {
  environment {
    registry = "shubh1sinha/order-management"
    registryCredential = 'docker-cred'
    dockerImage = ''
  }
  agent any
  stages {
    stage('package') {
      steps {
        bat "mvn clean package"
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Logout') {
      steps{
        bat "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}
