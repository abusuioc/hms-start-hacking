# Huawei Mobile Services starter project
Welcome to Huawei's workshop at [HackZurich 2020](https://www.hackzurich.com/) !

You have a bunch of fresh ideas and you aspire to make them possible with the help of the [Huawei Mobile Services](https://developer.huawei.com/consumer/en/hms). We feel your enthusiasm - that's why we prepared this starter project that will allow you to start coding *immediately* and avoid time consuming configuration steps.

### I'm in!

1. fork/clone this project
2. visit the workshop Slack channel [#03_ws05_huawei](https://hackzurich2020.slack.com/archives/C018BLKE30U) 
3. look for the file with secrets ([direct link](https://hackzurich2020.slack.com/archives/C018BLKE30U/p1600176389013300))
4. unzip the file to the project's root
5. start coding!



### What just happened? Am I really ready to go?

Yes!! The starter project is a skeleton app that:

- has all the HMS Kits added as dependencies 
- has all relevant permissions added to the manifest
- is designed to be linked with a test account on [App Gallery](https://consumer.huawei.com/en/mobileservices/appgallery/) so no need to go through the process of creating an account, waiting for approval, enabling various HMS kits, download configuration files and adding a signing certificate fingerprint that authorizes you to use the kits.

The file with secrets is the link between the starter project and the test account. It contains:

- the `agconnect-services.json` configuration file that empowers your project to talk to HMS servers 
- the signing configuration that authorizes your project to access HMS



### But I don't have a Huawei HMS test device ...

There are solutions.

1. If you're participating on-site, ask for a test device at the Huawei booth. Be fast, their number is limited.
2. Temporary install HMS Core on your own device, the latest apk is located [here](https://apkapp.gallery/download/application/apk/7c/7c33bfd98b864c2bbd9efb63b67baaf6/com.huawei.hwid.2009101044.apk).

3. [Cloud Debugging](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/CloudDebugging-introduction) : this requires you to actually own/create a Huawei ID, but once that's done, you can just download the [HMS Toolkit Android Studio plugin](https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/installation-0000001050145206) and access physical devices in the cloud.

### Special needs

If the starter project is too simple for you or maybe you already have a Huawei developer account, following is a list of other sample projects, developed in house by engineers like you - that are maybe more suitable for your specialized tasks:

- ML Kit: https://github.com/joaobiriba/QuickFaceAnalyzer / https://github.com/joaobiriba/QuickHandAnalyzer / https://github.com/joaobiriba/ScanKitDemo 
- AR Engine: https://github.com/ferPrieto/AREngine
- Further HMS Samples: https://github.com/HMS-Core



**Happy hacking!**

(and feel free to reach out to the support developers on the workshop Slack channel [#03_ws05_huawei](https://hackzurich2020.slack.com/archives/C018BLKE30U) )