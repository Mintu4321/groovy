import groovy.json.JsonSlurper

def call(){
def constants = new utils.aksconstants()

  for (item in constants.prodEnv){

    println item.join(',')
  }

}
