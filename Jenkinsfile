@Library('tasks-sharedlibs') _
import com.demo.Vehicle.groovy
pipeline{
    agent any
    stages{
        stage("Vehicle Class")
        {
            steps{
                sample()
                
                script{
                   def v1 = new Vehicle("Benz","Black")
                    println v1.getName()
                    println v1.getColor()
                }
                
            }
        }
    }
}
