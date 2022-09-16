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
            bat "docker build -t order-management:latest ."
            }
        }
		stage('Login') {

			steps {
				bat 'docker login env
			}
		}

		stage('Push') {

			steps {
				bat 'docker push order-management:latest'
			}
		}

		}

        	post {
		always {
			sh 'docker logout'
		}
	}
	}
   
