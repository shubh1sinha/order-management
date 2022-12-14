pipeline {
  agent any
  
    stages {      
        stage('Build maven ') {
            steps { 
                    sh 'pwd'      
                    sh 'sudo /home/ec2-user/apache-maven-3.8.6/bin/mvn  clean install package'
            }
        }
         
        stage('Build docker image') {
           steps {
		   
			sh 'sudo docker tag order-management:2.0 shubh1sinha/order-management:2.0'
			
               script {         
                 docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                   sh 'sudo docker push shubh1sinha/order-management:2.0'
                 }                     
           }
        }
	  }
    }
}