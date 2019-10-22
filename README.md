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

![Prompt message](/src/main/java/Tutorial1/images/1.png)

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

![Java download message](/src/main/java/Tutorial1/images/5.png)

You are then prompted to read and agree with the end user license agreement.

![Java prompt message](/src/main/java/Tutorial1/images/6.png)

Depending on which web browser you are using to download Java and depending on its configuration, you may be prompted to either Download or Save the installer file.

If you are using Safari, the Java installer will automatically download to your Downloads folder. You can see its progress in the little "Downloads" icon in the top right. If you click it, it will show more detail.
![Java safari download](/src/main/java/Tutorial1/images/7.png)

If you are using Safari, once it has finished downloading you can click the little magnifiying class to "Show in Finder", which will then open the "Downloads" folder.

![Java download finder](/src/main/java/Tutorial1/images/8.png)

If you are using a different browser, you'll need to go to your "Downloads" folder using Finder.

Unpack and run the installer
Depending on which web browser you're using and your browser's configuration, your browser may automatically open the ".dmg" file which was just downloaded.

![Java download dmg](/src/main/java/Tutorial1/images/9.png)

Install Java

![Java install dmg](/src/main/java/Tutorial1/images/10.png)

You are now running the Java installer. Click the "Next" button to proceed.

The installer will then download and install the latest version of Java.

![Java installer running](/src/main/java/Tutorial1/images/11.png)

When the installation is finished, you are told that after you click the "Close" button, your browser will open so that you can verify Java is working.

![Java installer finished](/src/main/java/Tutorial1/images/12.png)



### Installing Eclipse
Now that Java JDK 8 is installed, got and download Eclipse Oxygen IDE package for your systems.. the link below can be used to get it.

[Download eclipse from here](https://www.eclipse.org/downloads/packages/release/helios/r/eclipse-ide-java-ee-developers)

#### In Ubuntu machine
![Eclipse download message](/src/main/java/Tutorial1/images/2.png)

Extract the downloaded package to the /opt directory using the commands below… by default Eclipse package should be downloaded into the ~/Downloads folder of your home directory…

Use the commands below to extract the content in the ~/Downloads folder… The next line launches the installer…
```
tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz
~/Downloads/eclipse-installer/eclipse-inst
```

Select the package IDE you want to install and continue… Select package

![Select UDE](/src/main/java/Tutorial1/images/3.png)

Use the onscreen instructions to complete the installer.. Accept the default installation directory and continue

![Complete Installation](/src/main/java/Tutorial1/images/4.png)

### Installing TestNG in Eclipse

It is easy to install TestNG, as it comes as a plugin for Eclipse IDE. Prerequisite for installing TestNG is your Internet connection should be up & running during installation of this plugin and Eclipse IDE should be installed in your computer

Steps to follow:
1) Launch the Eclipse IDE and from Help menu, click “Install New Software”.

![Install New Software](/src/main/java/Tutorial1/images/13.png)

2) You will see a dialog window, click “Add” button.

![TestNG](/src/main/java/Tutorial1/images/15.png)

3) Type name as you wish, lets take “TestNG” and type “http://beust.com/eclipse/” as location. Click OK.

![Prev TestNG](/src/main/java/Tutorial1/images/16.png)

4) You come back to the previous window but this time you must see TestNG option in the available software list. Just Click TestNG and press “Next” button.

![Accept TestNG](/src/main/java/Tutorial1/images/17.png)

![Accept TestNG](/src/main/java/Tutorial1/images/18.png)

5) Click “I accept the terms of the license agreement” then click Finish.

![Accept TestNG](/src/main/java/Tutorial1/images/19.png)

6) You may or may not encounter a Security warning, if in case you do just click Install Anyway.

![Accept TestNG](/src/main/java/Tutorial1/images/20.png)

9) You may be required to restart your eclipse

![Accept TestNG](/src/main/java/Tutorial1/images/21.png)

10) After restart, verify if TestNG was indeed successfully installed. Right click on you project and see if TestNG is displayed in the opened menu.

![Check TestNG](/src/main/java/Tutorial1/images/22.png)

### Downloading Chromedriver

Check the Chrome browser version and download the corresponding chromedriver from https://chromedriver.chromium.org/downloads.

For me Chrome browser version is 77.0.3865.120 (Official Build) (64-bit)

![Check TestNG](/src/main/java/Tutorial1/images/23.png)

So I've downloaded It's corresponding chromedriver version 77.

![Check TestNG](/src/main/java/Tutorial1/images/24.png)

I've Downloaded my chromedriver in location "/Users/venkat/Downloads/chromedriver". Get the location of the chromedriver in your machine.

### Cloning the UAT GitHub Repository in your Eclipse

1. Open eclipse and go to Window > Show view > Other

![Other view](/src/main/java/Tutorial1/images/25.png)

2. Select Git hub repository

![GitHub view](/src/main/java/Tutorial1/images/26.png)

3. You could be able to see the git repository view in the left bottom corner of the eclipse. Select clone a repository icon as shown in the image

![GitHub repo view](/src/main/java/Tutorial1/images/27.png)

4. Enter the below values in the dialog box

URI: https://github.com/venkateshwarant/UAT.git

Other values would be automatically filled in the dialogbox as shown in the image

![GitHub repo view](/src/main/java/Tutorial1/images/28.png)

5. Select master branch and click next.

![GitHub repo cloning](/src/main/java/Tutorial1/images/29.png)

6. Give the name of the directory as per your wish.

![GitHub repo cloning](/src/main/java/Tutorial1/images/30.png)

7. You can see the cloned library in your git repository view.

![GitHub repo cloning](/src/main/java/Tutorial1/images/31.png)

### Opening the cloned UserAcceptanceTest GitHub Repository in your Eclipse

1. Goto File > Open projects from file system

![GitHub repo opening](/src/main/java/Tutorial1/images/32.png)

2. Click directory button

![GitHub repo opening](/src/main/java/Tutorial1/images/33.png)

3. Select the cloned folder

![GitHub repo opening](/src/main/java/Tutorial1/images/34.png)

4. You can see the selected folder in the directory tab now. Click finish after that.

![GitHub repo opening](/src/main/java/Tutorial1/images/35.png)

5. Now you can see that your cloned github project is opened in eclipse. But still some errors are there in the repository.

![GitHub repo opening](/src/main/java/Tutorial1/images/36.png)

6. Open TestGoogleSearchEngine.java file and click the error on the Line 15 as shown in the image. Select add TestNG library.

![GitHub repo opening](/src/main/java/Tutorial1/images/37.png)

7. Now you can see the TestNG dependencies are added to your project.

![GitHub repo opening](/src/main/java/Tutorial1/images/38.png)

8. Configure the proper location of chromedriver which we downloaded previously as shown in the figure

![GitHub repo opening](/src/main/java/Tutorial1/images/39.png)

## Tutorial 1
### Run Automation on a static webpage

1. Righ click on the method which you want to run,for instance method "testHelloWorld()". Select Run As > TestNg Test.

![GitHub repo opening](/src/main/java/Tutorial1/images/40.png)

You can see that, While running automation, we test our product (i.e. "HelloWorld.html") for it's content in the field with id "hello".

2. After the automation is complete, in the console we can see the reports of the automation.

![GitHub repo opening](/src/main/java/Tutorial1/images/41.png)

Here we are testing our product, i.e. Hellowworld.html webpage.

![GitHub repo opening](/src/main/java/Tutorial1/images/42.png)

it is rendered in browser as 

![GitHub repo opening](/src/main/java/Tutorial1/images/43.png)


## Tutorial 2

### Run Automation on a dynamic webpage

1. Run each methods separately in TestForms.java and see the results.

This is source code of our product to be tested
![GitHub repo opening](/src/main/java/Tutorial1/images/44.png)

This is how it is rendered in browser.
![GitHub repo opening](/src/main/java/Tutorial1/images/45.png)

