pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
    }
    post {
        success {
            echo '🎉 Prueba exitosa'
        }
        failure {
            echo '💥 Prueba fallida'
        }
        always {
            echo 'Pipeline terminado.'
        }
    }
}
