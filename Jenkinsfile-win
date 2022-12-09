pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                bat "git clone https://github.com/shubh1sinha/order-management.git"
            }
        }
        
         stage("package"){
            steps{
            bat "mvn clean package"
            }
        }
		stage('Docker Run') {

			steps {
				bat 'docker-compose up'
			}
		}
	}
    }
  