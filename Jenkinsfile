pipeline {
  agent any
  stages {
    stage('BuildProject') {
      steps {
        build 'Bash_runner'
      }
    }
    stage('TestJava') {
      steps {
        build 'mvn'
      }
    }
    stage('OneMore') {
      parallel {
        stage('OneMore') {
          steps {
            sh 'echo "Hello world #1"'
          }
        }
        stage('MyMessage') {
          steps {
            echo 'A cool message'
          }
        }
      }
    }
  }
  environment {
    Windows = 'Govno'
  }
}