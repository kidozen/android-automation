android-automation
==================

Android automation example using Robotium on kido-android-tasks App

1 – Download Android tasks App
First you need to download Android tasks App, we are going to use this kidozen’s SDK example app in our automation project.
You can download from here https://github.com/kidozen/kido-android-tasks, if you don’t know how to configure it read this http://docs.kidozen.com/android-tasks/.

2 – Download and import the Automation example

- Download the android-automation project.
- Open Eclipse IDE, then import the project.

3 – Download Robotium .jar and add it to Build path

- Download robotium-solo-5.1.jar from here https://code.google.com/p/robotium/wiki/Downloads?tm=2.
- Go to project -> Properties -> Java Build Path -> Add (external) Jar.

4 – Add Android tasks project to Build path

- Go to project -> Properties -> Java Build Path -> Projects Tab -> Add.

5 – Run the project

- Right click on automation project -> Run as “Android JUnit Test” -> Pick a device or emulator.
