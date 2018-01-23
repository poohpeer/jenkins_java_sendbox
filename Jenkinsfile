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
  }
}