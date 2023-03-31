pipeline {
    agent any
    
    stages {
        stage('Building and create .jar file'){
            steps {
                echo 'Building the .jar file...'
                
                //builds the .jar
                sh 'mvn clean package'
            }
        }
        
        stage('Creating Docker image') {
            steps {
                //Removes any extra docker images
                sh 'sudo docker image prune -f'
                
                //Builds the image of our application
                sh 'sudo docker build -t jkof86/p0reform:latest .'
            }
        }

        stage('Deploying into docker container') {
            steps {
                //Stop all running containers
                sh 'sudo docker rm -f'
                
                //Run latest version of image in a container
                sh 'sudo docker run -p 80:4500 -e url=$url -e user=$user -e pass=$pass jkof86/p0reform:latest'
                
            }
        }
    }
}
