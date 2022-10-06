# Huawei Mobile Services starter project for native Android


This project takes care of all the needed configuration so that you can start coding right away using the [Huawei Mobile Services](https://developer.huawei.com/consumer/en/hms) (HMS) SDKs. We mostly use this project during hackathons.

Basically, the starter project is a native Android skeleton app that:

- has the main featured HMS Kits added as dependencies (just comment out those you need)

- has all needed permissions added to the Android manifest

- streamlines the connection to an [App Gallery](https://consumer.huawei.com/en/mobileservices/appgallery/) account which is needed by the HMS SDKs

- when started, does a self test to check if everything is properly configured

  

### I'm in!

1. fork/clone this project

2. ask for the file with secrets `🕵` 

3. unzip the file into the project's *root* directory

4. start coding!

   

### What's this file with secrets about?

It streamlines the connection to a shared App Gallery account so that you don't have to create and configure one yourself. It's basically a zip containing 3 files:

- the`agconnect-services.json` configuration file needed by any HMS SDK

- the signing configuration needed to authenticate the project to App Gallery, for the cloud related functions:

  - a Java keystore (.jks file) containing the signing key

  - the *keystore.properties* file that unlocks the keystore and it's referenced from within *app/build.gradle* 

    

If you're participating in a hackathon, simply ask the Huawei devrel team at the event for the zip file and extract it in the root of the project. Alternatively, you could generate the 3 needed files yourself and thus link the project to your own App Gallery account.



### What if I don't have a Huawei HMS test device?

There are solutions:

1. If you're participating on-site, ask for a test device from the Huawei devrel team at the event 
2. Download and temporary install HMS Core on your own generic Android device from [here](https://appgallery.cloud.huawei.com/appdl/C10132067)
3. [Cloud Debugging](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/CloudDebugging-introduction) : this requires you to actually own/create a Huawei ID, but once that's done, you can just download the [HMS Toolkit Android Studio plugin](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/installation-0000001050145206) and access physical devices in the cloud



### Starter projects for other platforms

- for Flutter: https://github.com/abusuioc/hms-start-hacking-flutter

- for React Native: https://github.com/abusuioc/hms-start-hacking-reactnative 

  

### Various HMS code samples and demos

- https://github.com/HMS-Core 
- https://github.com/Explore-In-HMS/Explore-Hms





Happy hacking! 👨🏻‍💻

