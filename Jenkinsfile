#!groovy

node {

    stage('checkout') {
      checkout scm
    }
    
    stage('build') {
      sh "mvn install -Dmaven.test.skip=true"
    }
    
    stage('test') {
      sh "mvn test"
    }
    
}    
