pipeline {
    agent any

    stages {
        stage('Mensaje personalizado') {
            steps {
                echo 'Hola, Jenkins está ejecutando el pipeline correctamente 🚀'
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
