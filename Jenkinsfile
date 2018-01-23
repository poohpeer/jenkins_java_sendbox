pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        build 'Bash_runner'
      }
    }
    stage('TestJava') {
      steps {
        build 'mvn'
      }
    }
  }
}