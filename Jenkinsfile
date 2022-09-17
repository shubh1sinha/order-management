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
				bat 'sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		}

        	post {
		always {
			sh 'docker logout'
		}
	}
	}
   
