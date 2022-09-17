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
				withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'dockerpassword', usernameVariable: 'dockeruer')]) {
    						bat 'echo ${dockerpwd} | docker login -u shubh1sinha --password-stdin'
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
   
