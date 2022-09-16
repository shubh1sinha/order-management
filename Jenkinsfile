pipeline{
    agent any
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
        stage('Push') {

			steps {
			withCredentials([string(credentialsId: 'shubh1sinha', variable: 'dockerpwd')]) {
    // some block
                    bat 'docker login -u shubh1sinha -p ${dockerpwd}'

                    bat 'docker push shubh1sinha/order-management:1.0'
                }
			}
		}
	}
	post {
		always {
			bat 'docker logout'
		}
	}
}
   
