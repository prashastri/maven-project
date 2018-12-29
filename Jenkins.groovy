pipeline{
  agent any
  stages{
  stage{steps('Initiate'){steps{echo "Testing..."}}}}
  stage{steps('Build'){steps{echo "Build..."}}}}
  stage{steps('Deploy'){steps{echo "Deploy..."}}}}
  }
