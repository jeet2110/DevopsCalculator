pipeline 
{
    agent any 
    stages
    {
        stage('SCM Checkout')
        {
            steps
            {
            git credentialsId: 'git', url: 'https://github.com/jeet2110/DevopsCalculator.git'
            }
        }
        stage('Clean and Compile')
        { 
            steps 
            {
                sh "mvn clean"
                sh "mvn compile"
            }
        }
        stage('Test') 
        { 
            steps
            {
                sh "mvn test"
            }
        }
        stage('Package in JAR') 
        { 
            steps 
            {
                sh "mvn package"
            }
        }
        stage('Build Image') 
        {
      		steps 
      		{
        		script
        		{
          			dockerImage = docker.build "jeet2110/devops_calculator" + ":latest"
        		}
      		}
    	}
    	stage('Push Image') 
    	{
      		steps 
      		{
        		script
        		{
          			docker.withRegistry( '', 'docker-hub' ) {
            		dockerImage.push()
          		}
        		}
      		}
    	}
        
        
    }
    
}
