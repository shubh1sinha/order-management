pipeline{
    agent any
    	environment {
		DOCKERHUB_CREDENTIALS=credentials('docker-cred')
	}

    stages{
        stage("compile"){
            steps{
            sh "mvn clean compile"
            }
        }
        
         stage("package"){
            steps{
            sh "mvn clean package"
            }
        }
        
        stages {

		stage('Build') {

			steps {
				sh 'docker build -t shubh1sinha/order-management:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push shubh1sinha/order-management:latest'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

	}
   
