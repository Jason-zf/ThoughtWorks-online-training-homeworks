pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'building...'
                sh './gradlew build'
            }
        }
        stage('Test'){
            steps{
                echo 'testing...'
                sh './gradlew clean test'
            }
        }
    }
}