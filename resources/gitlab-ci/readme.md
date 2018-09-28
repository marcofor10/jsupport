# GitLab-CI configuration

## Configuration for a JavaFX project using Gradle

Create a file `.gitlab-ci.yml` with the following content:

```yml
image: java:8-jdk

stages:
  - build
  - test
#  - deploy

before_script:
  - apt-get update
  - apt-get install -y openjfx
#  - echo `pwd` # debug
#  - echo "$CI_BUILD_NAME, $CI_BUILD_REF_NAME $CI_BUILD_STAGE" # debug
  - export GRADLE_USER_HOME=`pwd`/.gradle

cache:
  paths:
    - .gradle/wrapper
    - .gradle/caches

build:
  stage: build
  script:
    - ./gradlew assemble
  artifacts:
    paths:
      - build/libs/*.jar
    expire_in: 1 week
  only:
    - master

test:
  stage: test
  script:
    - ./gradlew check

#deploy:
#  stage: deploy
#  script:
#    - ./deploy

after_script:
  - echo "End CI"
```