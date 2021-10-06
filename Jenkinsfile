node {

   stage ('Compile Stage') {
       withMaven(maven : 'maven_3_6_3') {
           sh 'mvn clean compile'
       }  
   }

   stage ('Testing Stage') {
       withMaven(maven : 'maven_3_6_3') {
           sh 'mvn test'
       }
   }

   stage ('Deployment Stage') {
       withMaven(maven : 'maven_3_6_3') {
           sh 'mvn deploy'
       }
   }
}
