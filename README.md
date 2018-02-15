# Introduction

Today software needs to be released more often with high quality, so the traditional of software development processes have to change. CI/CD (Continuous Integration/Continuous Deployment) Pipeline is the answer where code check-in by developers can be verified by an automated build, which allowing the development team to detect problems early in the process.

After the code has been successfully built, test automation can also be applied and then artifacts can be deployed to any environments (dev, staging and production).

In this CI/CD Pipeline example, I'll use Jenkins (a popular open source tool to perform CI/CD) to demonstrate the automate build-test-deploy process. If prefer, you can also use other tools such as Bambo, Concourse, QuickBuild, etc. 

# Setup VirtualBox and Vagrant

Since I am a Linux guy, so I like to have my Jenkins running on Linux. Just following the steps bebow to download/install VirtualBox and Vagrant. Then follow the next section to spin-up a virtual Linux server and  installing Jenkins.

- To download/install Vagrant: https://www.vagrantup.com/downloads.html 
- To download/install VirtualBox: https://www.virtualbox.org/wiki/Downloads

# Spin Up an Ubuntu box and ssh to it

To spin up the Ubuntu box, you would need a bash terminal. I use GitBash, but any other tool with bash should work as well. Follow these simple steps:

- Create a directory, let's call it vagrant_jenkins.
- Go to the vagrant_jenkins directory.
- Copy the Vagrantfile to the vagrant_jenkins directory.
- Type "vagrant up"
- Type "vagrant ssh"

# Installing Jenkins

Follow these steps to install Jenkins:

- wget https://pkg.jenkins.io/debian/binary/jenkins_2.95_all.deb
- dpkg -i jenkins_2.95_all.deb
- apt-get update
- apt-get install jenkins

# Login to Jenkins and Create a Pipeline

To login to Jenkins, click on http://localhost:8082/

To create a Jenkins pipeline:

- Click on New Item.
- Enter an item name (e.g. my_pipeline).
- Choose Pipeline and click OK.

Then configure your pipeline as shown below:

![](images/PipelineConfig.png?raw=true)

# Test a Successful Jenkins Build

After you have done configure your pipeline, click "Build Now" and your build output will look something like this:

![](images/BuildSuccess.png?raw=true)

# Test a Failure Jenkins Build

It was great to see a successful build, but you may wonder how a failure build would look like and how to cause the failure to happen.

In this case, it should be an easy thing to do. Let us change something to make the test fail. Try changing 36 to 37 from the UuidGeneratorTest.java to cause the test to fail. Note that uuid length is 36, so change it to any other number will cause the test to fail, e.g.

Assert.assertEquals(37, uuidGenerator.generateUuid().length());

Now build it again, and you will see the build output will look something like this:

![](images/BuildFail.png?raw=true)

