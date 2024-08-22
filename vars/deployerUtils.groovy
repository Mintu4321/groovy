import groovy.json.JsonSlurper

def call(){
def constants = new utils.aksconstants()
def items = constants.prodEnv.join(',')

println "items: ${items}"
  

}
