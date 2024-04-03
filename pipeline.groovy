def sast(){
  echo "Checkmarx stage"
}
def build(){
  sh "chmod +x -R ${env.WORKSPACE}"
  
}
