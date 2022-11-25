pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                bat "git clone https://github.com/shubh1sinha/order-management.git"
            }
        }
        stage("compile"){
            steps{
            bat "mvn clean compile"
            }
        }
        
         stage("package"){
            steps{
            bat "mvn clean package"
            }
        }
        
        stage("docker_build"){
            steps{
            bat "docker build -t shubh1sinha/order-management:1.0 ."
            }
        }
		stage('Run') {

			steps {
				bat 'docker run -d -p 8081:8081 shubh1sinha/order-management:1.0'
			}
		}
	}
    }
  