/* Source: Laster, B, 2018, Jenkins 2: Up and Running: Evolve Your Deployment     Pipeline for Next Generation */


/* Branch Management */

node {

   properties([disableConcurrentBuilds()])

   stage ('Compile Stage') {

       sh 'mvn clean compile'  
   }

   stage ('Testing Stage') {
      
        sh 'mvn test'
   }

   stage ('Deployment Stage') {
   
        sh 'mvn deploy'
   }
}


/* PARALLEL PIPELINES */

// Excerpt one

/*
node {
    stage("Parallel Demo") {
        
        def stepsToRun = [:]
        
        for (int i = 1; i < 5; i++) {
            stepsToRun["Step${i}"] = { node{
                echo "start"
                sleep 5
                echo "done"
            }}
        }
        
        parallel stepsToRun
    }
}

// source: Jenkins2: Up and Running
*/


// Excerpt two - eror trying to run parallel jobs without a workspace

/*
node ('worker_node') {
    stage ("Test") {
        parallel(
            master:{ node('master'){
                sh'/opt/gradle-7.2/bin/gradle-D test.single=TestExample1 test'
            }},
            worker1:{ node('worker_node') {
                sh'/opt/gradle-7.2/bin/gradle-D test.single=TestExample2 test'
            }},
        )
    }
}

// source: Jenkins2: Up and Running
*/


// Excerpt three - parallel runs with stash & unstash used to sare files across nodes.

/*
node {
    stages {
        
        stage ('Source') {
            git branch:'test', url:'git@diyv.repos/gradle-greetings'
            stash name:'test-sources', includes:'build.gradle,src/test/'
        }
        
        ...
        
        stage ('Test') {
            // execute required unit tests in parallel
            parallel(
                master:{ node('master') {
                    unstash 'test-sources'
                    sh'/opt/gradle-7.2/bin/gradle-D test.single=TestExample1 test'
                }},
                
                worker1:{ node('worker_node') {
                    unstash 'test-sources'
                    sh'/opt/gradle-7.2/bin/gradle-D test.single=TestExample2 test'
                }},
            )
        }
    }
}

// source: Jenkins2: Up and Running
*/


// Excerpt four

node {
    stage ('Parallel') {
        parallel(
            'group1':{
                timestamps {
                    catchError {
                        sleep 10
                        echo 'Completed group1 processing'
                    }
                }
            },
            
            'group2':{
                sleep 5
                error 'Error in group2 processing'
            },
            
            failFast:true
        )
    }
}


/* Variables in Pipelines */

/**
 * Excerpts five
 * 
 * Sample scripts showing the use of
 * variables in a pipeline.
 */
 

// Excerpt 5
/*
def name;

node {
    
    stage ('checkout') {
        
        def address = "New York"
        
        name = "Sam"
        def welcomeStatement = returnMessage(name)
        echo "${welcomeStatement}"
    }
}

def returnMessage(String name) {
    def nameVar = "Hello ${name}. Welcome to self learning"
    return nameVar
}
*/


/**
 * Excert 6
 * 
 * Illustration how environment variables (both default 
 * and customized) can e used to introduce dynamisn in
 * pipelines via interpolation.
 */
 
/* 
node {
    
    stage ("List env vars") {
        sh "printenv | sort"
    }
    
    stage ("Using env vars") {
        echo "BUILD_NUMBER = ${env.BUILD_NUMBER}"  // using env variables from Groovy Interpreter site
        sh 'echo BUILD_NUMBER = $BUILD_NUMBER'  // Shell enn variable access
    }
    
    stage ("Setting env vars1") {
        env.TEST_VARIABLE = "some test value"
        echo "TEST_VARIABLE = ${env.TEST_VARIABLE}"
    }
    
    stage ("Setting env vars2") {
        withEnv(["ANOTHER_ENV_VAR=here is another value"]) {
            echo "ANOTHER_ENV_VAR = ${env.ANOTHER_ENV_VAR}"
        }
    }
}

*/


/**
 * Excerpt seven
 * 
 * Simple sample script demonstrating the
 * use of variables in conjunction with
 * Closures.
 * 
 * This further enhances the ability to make scripted
 * pipelines more dynamic, and preserve the structure 
 * of the pipeline.
 */
 
/*
def greeter = {println "Hello, ${it}"}

node {
    stage ("Demo1") {
        def flintstones = ["Fred", "Barry"]
        flintstones.each(greeter)
        
        greeter "Wilma"
    }
}
*/


/**
 * Excerpt 8
 *
 * Creation of an instance of
 * an object (using a variable) representing the 
 * integration of Artifactory
 */
 def server = Artiactory.server "Local Artifactory"

