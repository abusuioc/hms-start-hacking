# Huawei Mobile Services starter project for native Android
Welcome to Huawei's workshop at [HackZurich 2021](https://www.hackzurich.com/) !

You have a bunch of fresh ideas and you aspire to make them possible with the help of the [Huawei Mobile Services](https://developer.huawei.com/consumer/en/hms) (HMS). We feel your enthusiasm - that's why we prepared this starter project that will allow you to start coding *immediately* and avoid time consuming configuration steps.



### I'm in!

1. fork/clone this project
2. visit the workshop Slack channel [#tbd]() 
3. look for the file with secrets ([direct link (tbd)]())
4. unzip the file into the project's *root* directory
5. start coding!



### What just happened? Am I really ready to go?

Yes!! The starter project is a native Android skeleton app that:

- has the main HMS Kits added as dependencies 
- has all relevant permissions added to the Android manifest
- connects to a shared account on [App Gallery](https://consumer.huawei.com/en/mobileservices/appgallery/) which needed by the majority of the HMS Kits
- when started, does a self test to check if everything is properly configured

The file with secrets is the link between the starter project and the shared account. It contains:

- the `agconnect-services.json` configuration file
- the signing configuration needed to authenticate this app to use HMS services



### But I don't have a Huawei HMS test device ...

There are solutions.

1. If you're participating on-site, ask for a test device at the Huawei booth
2. Download and temporary install HMS Core on your own Android device from [here](https://appgallery.cloud.huawei.com/appdl/C10132067)
3. [Cloud Debugging](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/CloudDebugging-introduction) : this requires you to actually own/create a Huawei ID, but once that's done, you can just download the [HMS Toolkit Android Studio plugin](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/installation-0000001050145206) and access physical devices in the cloud



### Starter projects for other platforms

- for Flutter: https://github.com/abusuioc/hms-start-hacking-flutter

- for React Native: https://github.com/abusuioc/hms-start-hacking-reactnative 

  

More HMS code samples:

- https://github.com/HMS-Core 
- https://github.com/Explore-In-HMS/HmsSandbox



**Happy hacking!**