pipeline {
  environment {
    registry = "janardhan54/boot-with-k8s"
    registryCredential = 'docker-details'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Git Checkout') {
      steps {
               checkout scm 
            }
    }
    
    	stage('Build') { 
            steps {
                sh 'mvn clean package -DskipTests' 
            }
        }
        
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
	
//stage('Deploy to ACS'){
//    steps{
//        withCredentials([azureServicePrincipal('dbb6d63b-41ab-4e71-b9ed-32b3be06eeb8')]) {
//          sh 'echo "logging in" '
//          sh 'az login --service-principal -u c5ceb42a-033d-4dcf-bc2b-b2a7b37bff21 -p xyeBmx1bynF2Z6T+dzCgklfQ+1CuNPI6aY7EdIfE0OI= -t be10e06f-0415-4faf-8faf-d4ccf24c1ede'
//          sh 'az account set -s 1e5fc2e8-f4df-4895-9f77-00e140031cb2'
//          sh 'az aks get-credentials --resource-group ilink --name gajacluster'
//          sh 'kubectl apply -f sample.yaml'
//    }
//  }
//}
   
  }
}

