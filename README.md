# UAT
Automation of User Acceptance Testing

## Getting Started
We are going to use eclipse as our IDE for development of automation script.

### Installing Java
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
When you run the commands above you’ll be prompted to access the license terms of the software… accept and continue.. Prompt message

Set Oracle JDK8 as default, to do that, install the oracle-java8-set-default package. This will automatically set the JAVA env variable.
```
sudo apt install oracle-java8-set-default
```
The command above will automatically set Java 9 as the default… and that should complete your installation, you can check you java version by running following command.
```
javac -version
```
The command above will automatically set Java 9 as the default… and that should complete your installation, you can check you java version by running following command.

### Installing Eclipse
Now that Java JDK 8 is installed, got and download Eclipse Oxygen IDE package for your systems.. the link below can be used to get it.

Download eclipse from here Eclipse download message

Extract the downloaded package to the /opt directory using the commands below… by default Eclipse package should be downloaded into the ~/Downloads folder of your home directory…

Use the commands below to extract the content in the ~/Downloads folder… The next line launches the installer…
```
tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz
~/Downloads/eclipse-installer/eclipse-inst
```
Select the package IDE you want to install and continue… Select package

Use the onscreen instructions to complete the installer.. Accept the default installation directory and continue
