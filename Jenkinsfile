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
    stage('CheckJava') {
      steps {
        waitUntil() {
          build 'mvn'
        }
        
      }
    }
    stage('Messages') {
      steps {
        echo 'XYU'
      }
    }
  }
  environment {
    Windows = 'Govno'
  }
}