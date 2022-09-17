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

			steps {
				withCredentials([string(credentialsId: 'shubh1sinha', variable: 'dockerpwd')]) {
					bat 'docker login -u shubh1sinha -p ${dockerpwd}'
				}
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
   
