# UAT
Automation of User Acceptance Testing

## Getting Started
We are going to use eclipse as our IDE for development of automation script.

### Installing Java
#### In Ubuntu machine
Eclipse requires Java JDK to be installed on the system you want to use… At this time, only Java JDK 8 is fully compatible.. to install JDK, use the steps below:

The easiest way to install Oracle Java JDK 8 on Ubuntu is via a third party PPA… To add that PPA, run the commands below
```
 sudo add-apt-repository ppa:webupd8team/java
```
After running the commands above, you should see a prompt to accept the PPA key onto Ubuntu… accept and continue

Now that the PPA repository has been added to Ubuntu, run the commands below to download Oracle Java 9 installer…. the installer should install the latest Java JDK 9 on your Ubuntu machines.
```
sudo apt update
sudo apt install oracle-java8-installer
```
When you run the commands above you’ll be prompted to access the license terms of the software… accept and continue.. 

![Prompt message](/src/test/java/Tutorial1/images/1.png)

Set Oracle JDK8 as default, to do that, install the oracle-java8-set-default package. This will automatically set the JAVA env variable.
```
sudo apt install oracle-java8-set-default
```
The command above will automatically set Java 9 as the default… and that should complete your installation, you can check you java version by running following command.
```
javac -version
```
The command above will automatically set Java 9 as the default… and that should complete your installation, you can check you java version by running following command.

#### In Mac machine
Visit the Java website and download the installer
To install Java, you first need to download the installer program from Oracle.

Visit the "Download Java" page: https://java.com/download
[here](https://java.com/download)

Click the "Free Java Download" button.

![Java download message](/src/test/java/Tutorial1/images/5.png)

You are then prompted to read and agree with the end user license agreement.

![Java prompt message](/src/test/java/Tutorial1/images/6.png)

Depending on which web browser you are using to download Java and depending on its configuration, you may be prompted to either Download or Save the installer file.

If you are using Safari, the Java installer will automatically download to your Downloads folder. You can see its progress in the little "Downloads" icon in the top right. If you click it, it will show more detail.
![Java safari download](/src/test/java/Tutorial1/images/7.png)

If you are using Safari, once it has finished downloading you can click the little magnifiying class to "Show in Finder", which will then open the "Downloads" folder.

![Java download finder](/src/test/java/Tutorial1/images/8.png)

If you are using a different browser, you'll need to go to your "Downloads" folder using Finder.

Unpack and run the installer
Depending on which web browser you're using and your browser's configuration, your browser may automatically open the ".dmg" file which was just downloaded.

![Java download dmg](/src/test/java/Tutorial1/images/9.png)

Install Java

![Java install dmg](/src/test/java/Tutorial1/images/10.png)

You are now running the Java installer. Click the "Next" button to proceed.

The installer will then download and install the latest version of Java.

![Java installer running](/src/test/java/Tutorial1/images/11.png)

When the installation is finished, you are told that after you click the "Close" button, your browser will open so that you can verify Java is working.

![Java installer finished](/src/test/java/Tutorial1/images/12.png)



### Installing Eclipse
Now that Java JDK 8 is installed, got and download Eclipse Oxygen IDE package for your systems.. the link below can be used to get it.

[Download eclipse from here](https://www.eclipse.org/downloads/packages/release/helios/r/eclipse-ide-java-ee-developers)

#### In Ubuntu machine
![Eclipse download message](/src/test/java/Tutorial1/images/2.png)

Extract the downloaded package to the /opt directory using the commands below… by default Eclipse package should be downloaded into the ~/Downloads folder of your home directory…

Use the commands below to extract the content in the ~/Downloads folder… The next line launches the installer…
```
tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz
~/Downloads/eclipse-installer/eclipse-inst
```

Select the package IDE you want to install and continue… Select package

![Select UDE](/src/test/java/Tutorial1/images/3.png)

Use the onscreen instructions to complete the installer.. Accept the default installation directory and continue

![Complete Installation](/src/test/java/Tutorial1/images/4.png)

### Installing TestNG in Eclipse

It is easy to install TestNG, as it comes as a plugin for Eclipse IDE. Prerequisite for installing TestNG is your Internet connection should be up & running during installation of this plugin and Eclipse IDE should be installed in your computer

Steps to follow:
1) Launch the Eclipse IDE and from Help menu, click “Install New Software”.

![Install New Software](/src/test/java/Tutorial1/images/13.png)

2) You will see a dialog window, click “Add” button.

![TestNG](/src/test/java/Tutorial1/images/15.png)

3) Type name as you wish, lets take “TestNG” and type “http://beust.com/eclipse/” as location. Click OK.

![Prev TestNG](/src/test/java/Tutorial1/images/16.png)

4) You come back to the previous window but this time you must see TestNG option in the available software list. Just Click TestNG and press “Next” button.

![Accept TestNG](/src/test/java/Tutorial1/images/17.png)

![Accept TestNG](/src/test/java/Tutorial1/images/18.png)

5) Click “I accept the terms of the license agreement” then click Finish.

![Accept TestNG](/src/test/java/Tutorial1/images/19.png)

6) You may or may not encounter a Security warning, if in case you do just click Install Anyway.

![Accept TestNG](/src/test/java/Tutorial1/images/20.png)

9) You may be required to restart your eclipse

![Accept TestNG](/src/test/java/Tutorial1/images/21.png)

10) After restart, verify if TestNG was indeed successfully installed. Right click on you project and see if TestNG is displayed in the opened menu.

![Check TestNG](/src/test/java/Tutorial1/images/22.png)

### Downloading Chromedriver

Check the Chrome browser version and download the corresponding chromedriver from https://chromedriver.chromium.org/downloads.

For me Chrome browser version is 77.0.3865.120 (Official Build) (64-bit)

![Check TestNG](/src/test/java/Tutorial1/images/23.png)

So I've downloaded It's corresponding chromedriver version 77.

![Check TestNG](/src/test/java/Tutorial1/images/24.png)

I've Downloaded my chromedriver in location "/Users/venkat/Downloads/chromedriver". Get the location of the chromedriver in your machine.

### Cloning the UAT GitHub Repository in your Eclipse

1. Open eclipse and go to Window > Show view > Other

![Other view](/src/test/java/Tutorial1/images/25.png)

2. Select Git hub repository

![GitHub view](/src/test/java/Tutorial1/images/26.png)

3. You could be able to see the git repository view in the left bottom corner of the eclipse. Select clone a repository icon as shown in the image

![GitHub repo view](/src/test/java/Tutorial1/images/27.png)

4. Enter the below values in the dialog box

URI: https://github.com/venkateshwarant/UAT.git

Other values would be automatically filled in the dialogbox as shown in the image

![GitHub repo view](/src/test/java/Tutorial1/images/28.png)

5. Select master branch and click next.

![GitHub repo cloning](/src/test/java/Tutorial1/images/29.png)

6. Give the name of the directory as per your wish.

![GitHub repo cloning](/src/test/java/Tutorial1/images/30.png)

7. You can see the cloned library in your git repository view.

![GitHub repo cloning](/src/test/java/Tutorial1/images/31.png)

### Opening the cloned UserAcceptanceTest GitHub Repository in your Eclipse

1. Goto File > Open projects from file system

![GitHub repo opening](/src/test/java/Tutorial1/images/32.png)

2. Click directory button

![GitHub repo opening](/src/test/java/Tutorial1/images/33.png)

3. Select the cloned folder

![GitHub repo opening](/src/test/java/Tutorial1/images/34.png)

4. You can see the selected folder in the directory tab now. Click finish after that.

![GitHub repo opening](/src/test/java/Tutorial1/images/35.png)

5. Now you can see that your cloned github project is opened in eclipse. But still some errors are there in the repository.

![GitHub repo opening](/src/test/java/Tutorial1/images/36.png)

6. Open TestGoogleSearchEngine.java file and click the error on the Line 15 as shown in the image. Select add TestNG library.

![GitHub repo opening](/src/test/java/Tutorial1/images/37.png)

7. Now you can see the TestNG dependencies are added to your project.

![GitHub repo opening](/src/test/java/Tutorial1/images/38.png)

8. Configure the proper location of chromedriver which we downloaded previously as shown in the figure

![GitHub repo opening](/src/test/java/Tutorial1/images/39.png)

## Tutorial 1
### Run Automation on a static webpage

1. Righ click on the method which you want to run,for instance method "testHelloWorld()". Select Run As > TestNg Test.

![GitHub repo opening](/src/test/java/Tutorial1/images/40.png)

You can see that, While running automation, we test our product (i.e. "HelloWorld.html") for it's content in the field with id "hello".

2. After the automation is complete, in the console we can see the reports of the automation.

![GitHub repo opening](/src/test/java/Tutorial1/images/41.png)

Here we are testing our product, i.e. Hellowworld.html webpage.

![GitHub repo opening](/src/test/java/Tutorial1/images/42.png)

it is rendered in browser as 

![GitHub repo opening](/src/test/java/Tutorial1/images/43.png)


## Tutorial 2

### Run Automation on a dynamic webpage (without a server)

1. Run each methods separately in TestForms.java and see the results.

This is source code of our product to be tested
![GitHub repo opening](/src/test/java/Tutorial1/images/44.png)

This is how it is rendered in browser.
![GitHub repo opening](/src/test/java/Tutorial1/images/45.png)


## Tutorial 3

### Run Automcation on a dynamic webpage hosted under a server

To host the server, see to the tutorial here on https://github.com/venkateshwarant/DemoDynamicServer

Let's automate the testing of the above webpage, it's URL is http://localhost:8081/DemoDynamicServer/FirstServlet 

The port number is the one which you configured in server.xml.

1. Run each methods separately in TestServerWebpage.java and see the results. 

method testContent-> should always pass
method testTime-> should always fails, since we are asserting the date with some old values


# Running automation via xml file

TestNG has provided the facility to run automation scripts with the help of xml test suites.

for eg., below is a xml script to run all the test methods in class- TestGoogleSearchEngine, TestForms, TestServerWebpage

```
<?xml version="1.0" encoding="UTF-8"?>
<suite name="Group of group Suite" verbose="1">
  <test name="Group of group Test">
    <classes>

         <class name="Tutorial1.TestGoogleSearchEngine" />
         <class name="Tutorial2.TestForms" />
         <class name="Tutorial3.TestServerWebpage" />
    </classes>

  </test>
</suite>
```

Save it in the project directory and to run it, right click the xml file and select run as TestNG test as shown in the image.

![GitHub repo opening](/src/test/java/Tutorial1/images/82.png)

To learn more about writing TestNG.xml follow https://testng.org/doc/documentation-main.html

# Running automation via terminal using Maven.

To run automation via maven, you should install maven in your terminal. 

## Installing maven using homebrew
Follow below steps to install maven in your terminal.

Run following command on Terminal
```
brew update
brew install maven
```
The response will be similar to

```
    ==> Using the sandbox
    ==> Downloading https://www.apache.org/dyn/closer.cgi?path=maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.t
    ==> Best Mirror http://supergsego.com/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.tar.gz
    ######################################################################## 100.0%
    /usr/local/Cellar/maven/3.5.0: 106 files, 9.8MB, built in 15 seconds
```
Check location of mvn
```
which mvn
```

Response would be like => /usr/local/bin/mvn

Check the version using mvn
Note the location of "Maven home"
```
mvn -v
```
 
response would be like => 

Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T17:06:16+02:00)
Maven home: /usr/local/Cellar/maven/3.6.2/libexec
Java version: 13.0.1, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-13.0.1.jdk/Contents/Home
Default locale: en_GB, platform encoding: UTF-8
OS name: "mac os x", version: "10.14.6", arch: "x86_64", family: "mac"

## Running automation

you should add the following lines in the pom.xml to run automation via terminal.

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>Selenium.maven</groupId>
  <artifactId>Selenium.maven.demo</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>
  <name>Selenium.maven.demo</name>
  <url>http://maven.apache.org</url>
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.3.1</version>
</dependency>
  </dependencies>
  <build>
        <!-- Source directory configuration -->
        <sourceDirectory>src</sourceDirectory>
        <plugins>
            <!-- Following plugin executes the testng tests -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.14.1</version>
                <configuration>
                    <!-- Suite testng xml file to consider for test execution -->
                    <suiteXmlFiles>
                        <suiteXmlFile>TestNG.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
            <!-- Compiler plugin configures the java version to be usedfor compiling
                the code -->
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.7</source>
                    <target>1.7</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```
In the above pom.xml, we have mentioned to run TestNG.xml via maven-surefire-plugin.

To run this TestNG.xml using maven from terminal, run the following command in the location where your pom.xml is present.
```
mvn test
```

You will get the logs similar to the below logs.
```
MF0055:Selenium.maven.demo venkat$ mvn test
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for Selenium.maven:Selenium.maven.demo:jar:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 57, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] -----------------< Selenium.maven:Selenium.maven.demo >-----------------
[INFO] Building Selenium.maven.demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Selenium.maven.demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/venkat/eclipse-workspace/Selenium.maven.demo/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Selenium.maven.demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to /Users/venkat/eclipse-workspace/Selenium.maven.demo/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Selenium.maven.demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/venkat/eclipse-workspace/Selenium.maven.demo/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Selenium.maven.demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.14.1:test (default-test) @ Selenium.maven.demo ---
[INFO] Surefire report directory: /Users/venkat/eclipse-workspace/Selenium.maven.demo/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.testng.xml.XMLParser (file:/Users/venkat/.m2/repository/org/testng/testng/6.3.1/testng-6.3.1.jar) to constructor com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl()
WARNING: Please consider reporting this to the maintainers of org.testng.xml.XMLParser
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Starting ChromeDriver 77.0.3865.40 (f484704e052e0b556f8030b65b953dce96503217-refs/branch-heads/3865@{#442}) on port 13930
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1572267931.769][WARNING]: This version of ChromeDriver has not been tested with Chrome version 78.
Oct 28, 2019 2:05:31 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Starting ChromeDriver 77.0.3865.40 (f484704e052e0b556f8030b65b953dce96503217-refs/branch-heads/3865@{#442}) on port 45565
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1572267932.594][WARNING]: This version of ChromeDriver has not been tested with Chrome version 78.
Oct 28, 2019 2:05:32 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Starting ChromeDriver 77.0.3865.40 (f484704e052e0b556f8030b65b953dce96503217-refs/branch-heads/3865@{#442}) on port 16505
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1572267933.647][WARNING]: This version of ChromeDriver has not been tested with Chrome version 78.
Oct 28, 2019 2:05:33 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Tests run: 8, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 33.195 sec <<< FAILURE!
testLastNameField(Tutorial2.TestForms)  Time elapsed: 2.079 sec  <<< FAILURE!
java.lang.AssertionError: expected:<Thamilselvan> but was:<Venkateshwaran>
	at org.testng.Assert.fail(Assert.java:89)
	at org.testng.Assert.failNotEquals(Assert.java:489)
	at org.testng.Assert.assertEquals(Assert.java:118)
	at org.testng.Assert.assertEquals(Assert.java:171)
	at org.testng.Assert.assertEquals(Assert.java:181)
	at Tutorial2.TestForms.testLastNameField(TestForms.java:43)

testTime(Tutorial3.TestServerWebpage)  Time elapsed: 2.039 sec  <<< FAILURE!
java.lang.AssertionError: expected:<Date=Mon Oct 28 14:06:01 CET 2019> but was:<Date=Mon Oct 28 12:29:20 CET 2019>
	at org.testng.Assert.fail(Assert.java:89)
	at org.testng.Assert.failNotEquals(Assert.java:489)
	at org.testng.Assert.assertEquals(Assert.java:118)
	at org.testng.Assert.assertEquals(Assert.java:171)
	at org.testng.Assert.assertEquals(Assert.java:181)
	at Tutorial3.TestServerWebpage.testTime(TestServerWebpage.java:42)


Results :

Failed tests: 
  TestForms.testLastNameField:43 expected:<Thamilselvan> but was:<Venkateshwaran>
  TestServerWebpage.testTime:42 expected:<Date=Mon Oct 28 14:06:01 CET 2019> but was:<Date=Mon Oct 28 12:29:20 CET 2019>

Tests run: 8, Failures: 2, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  34.301 s
[INFO] Finished at: 2019-10-28T14:06:03+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.14.1:test (default-test) on project Selenium.maven.demo: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/venkat/eclipse-workspace/Selenium.maven.demo/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

## Creating Selenium grid
Folow tutorial in https://github.com/venkateshwarant/SeleniumGrid to create a selenium grid and check if the server has started successfully.

## Create a integration server
follow tutorial in https://github.com/venkateshwarant/Creating_Integration_Server to create a integration server with katalon runtime engine

## Creating stage VM
Follow tutorial in https://github.com/venkateshwarant/Creating-Stage-VM to create a stage-vm for our helloworld product
* The product is deployed in the stage-VM for running automation test.

## Integrating test automation with the pipeline
Add the following content in .gitlab-ci.yml

```

image: maven:latest
stages:
  - deploy
  - test
cache:
  paths:
    - target/
test_app:
  stage: test
  script:
    - mvn test
deploy:
    stage: deploy
    tags:
    - stage-vm-shell
    script:
    - pwd
    - ls
    - cp src/main/java/Tutorial1/helloworld.html /home/vagrant/stage
    
```

You can see that, In this pipeline file, we have defined following tasks
* deployed our product in the stage VM
* Started our automation (our automation runs in the remote node), In the automation we have pointed the test case to run on the product which is deployed in the stage vm.

## Parallel execution of test cases
Follow tutorial in https://github.com/venkateshwarant/PerformantContinuousTesting for creating parallel test suites
