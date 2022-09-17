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
            steps{
            bat "docker build -t $registry:latest ."
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
        bat "docker rmi $registry:$latest"
      }
    }
  }
}
