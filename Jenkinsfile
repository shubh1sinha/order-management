pipeline{
    agent any
    	environment {
		DOCKERHUB_CREDENTIALS=credentials('docker-cred')
	}

    stages{
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
            bat "docker build -t shubh1sinha/order-management:latest ."
            }
        }
		stage('Login') {
			steps{
    						bat 'docker login -u username -p password'
					
				
			}
		}

		stage('Push') {

			steps {
				bat 'docker push shubh1sinha/order-management:latest'
			}
		}

		}

        	post {
		always {
			bat 'docker logout'
		}
	}
	}
   
