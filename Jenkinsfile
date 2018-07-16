pipeline{
agent any 
stages
{
stage('Build ,Test,Package')
{
 steps{
 
 sh 'mvn clean package'
 }

}
stage('Building Docker Image'){
steps{


sh 'docker build -t  shubhamgorlewar/studentapplication:latest .'
}
}

stage('Pushing Image to Docker Hub')
{

steps {
        withCredentials([usernamePassword(credentialsId: 'DockerHub', passwordVariable: 'DockerHubPassword', usernameVariable: 'DockerHubUser')]) {
          sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPassword}"
          sh 'docker push shubhamgorlewar/studentapplication:latest '
        }
}
}

}
}