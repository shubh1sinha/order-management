pipeline {
  agent any
  
    stages {      
        stage('Build maven ') {
            steps { 
                    sh 'pwd'      
                    sh 'sudo /home/shusinha5/apache-maven-3.8.6/bin/mvn  clean install package'
            }
        }
         
        stage('Build docker image') {
           steps {
		   
			sh 'sudo docker tag order-management:2.0 shubh1sinha/order-management:2.0'       
            sh 'sudo docker push shubh1sinha/order-management:2.0'
                                      
           }
        }
	  }
    }
}