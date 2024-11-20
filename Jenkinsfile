
pipeline 
{
    agent any
    
    tools{
    	maven 'maven'
        }

    stages 
    {
        stage('Build') 
        {
          
            steps {
                echo 'Build the project'
            }
        }
        
        
        
        stage("Deploy to QA"){
            steps{
                echo("deploy to qa")
            }
        }
        
        
                
        stage('Regression Automation Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/asima24/CartPage.git'
                    sh 'mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml'
                    
                }
            }
        }
                
     
        stage('Publish Allure Reports') {
           steps {
                script {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: '/allure-results']]
                    ])
                }
            }
        }
        
        
        stage('Publish Extent Report'){
            steps{
                     publishHTML([allowMissing: false,
                                  alwaysLinkToLastBuild: false, 
                                  keepAll: true, 
                                  reportDir: 'reports', 
                                  reportFiles: 'TestExecutionReport.html', 
                                  reportName: 'HTML Regression Extent Report', 
                                  reportTitles: ''])
            }
        }
        
       
         
        
    }
}
