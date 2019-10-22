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

![Java download message](/src/main/java/Tutorial1/images/5.jpg)

You are then prompted to read and agree with the end user license agreement.

![Java prompt message](/src/main/java/Tutorial1/images/6.jpg)

Depending on which web browser you are using to download Java and depending on its configuration, you may be prompted to either Download or Save the installer file.

If you are using Safari, the Java installer will automatically download to your Downloads folder. You can see its progress in the little "Downloads" icon in the top right. If you click it, it will show more detail.
![Java safari download](/src/main/java/Tutorial1/images/7.jpg)

If you are using Safari, once it has finished downloading you can click the little magnifiying class to "Show in Finder", which will then open the "Downloads" folder.

![Java download finder](/src/main/java/Tutorial1/images/8.jpg)

If you are using a different browser, you'll need to go to your "Downloads" folder using Finder.

Unpack and run the installer
Depending on which web browser you're using and your browser's configuration, your browser may automatically open the ".dmg" file which was just downloaded.

![Java download dmg](/src/main/java/Tutorial1/images/9.jpg)

Install Java

![Java install dmg](/src/main/java/Tutorial1/images/10.jpg)

You are now running the Java installer. Click the "Next" button to proceed.

The installer will then download and install the latest version of Java.

![Java installer running](/src/main/java/Tutorial1/images/11.jpg)

When the installation is finished, you are told that after you click the "Close" button, your browser will open so that you can verify Java is working.

![Java installer finished](/src/main/java/Tutorial1/images/12.jpg)



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
