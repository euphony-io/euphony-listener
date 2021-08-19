# euphony-listener
​
## Introduction
​
'Euphony-Listener' receives and recognizes data through sound waves from 'Speaker'. </br>
The frequency occurs when the speaker sends data. The Listen button is pressed, 'Listener' recognizes the data and you can check the results. </br>
It only works on android. </br>
​
## Euphony Library
​
Acoustic Data Telecommunication Library. This is for Android version. </br>
Euphony provides a handiness library designed to communicate with other devices(android and web) using mic and recorder. </br>
​
Official Facebook Page : https://www.facebook.com/euphonyproject </br>
Official Library Site : https://dev.jbear.co/euphony </br>
​
## Prerequisite
build.gradle in app module </br>
```java
dependencies {
    implementation 'euphony.lib:euphony:0.7.1.6'
}
```
AndroidManifest.xml
```xml
<uses-permission android:name="android.permission.RECORD_AUDIO" />
```
​
## Quick Start
​
### 1. Repository clone
​
```bash
$ git clone https://github.com/euphony-io/euphony-listener.git
```
![clone](https://user-images.githubusercontent.com/47289893/128968369-e30bfc36-3c57-418d-b3b2-b8976436493b.png)
​
### 2. Open in Android Studio
​
Find the path of the cloned project and open it.</p>
![open](https://user-images.githubusercontent.com/47289893/128968509-21778091-1c48-432d-8c68-856d89c59a07.png)</br>
Press the 'Trust Project' button.</p>
![trust](https://user-images.githubusercontent.com/47289893/128968544-78756386-1740-43e7-9f27-78f9322307f8.png)</br>
​
### 3. JDK settings 
​
JDK location error may occur when opening the file for the first time.</p>
![set jdk-1](https://user-images.githubusercontent.com/47289893/128968605-e73af820-0ae7-4e8c-997a-1c1cdbef7129.png)</br>
Click 'Change JDK location' to specify Gradle JDK.</p>
![set jdk-2](https://user-images.githubusercontent.com/47289893/128968614-0988ac95-1672-411d-8e9e-336503be69cd.png)</br>
When you reopen the project, the build starts.</p>
![build](https://user-images.githubusercontent.com/47289893/128968741-00b1cd80-a9f7-4481-bd1a-ff388141080f.png)</br>
​
### 4. Connect the device
​
By default, there is no device.</p>
![no device](https://user-images.githubusercontent.com/47289893/128968845-d0868890-cb57-4721-a956-857b871e7393.png)</br>
It is automatically recognized when devices with developer mode are connected.</p>
![yes device](https://user-images.githubusercontent.com/47289893/128968864-35b7ae72-6fb8-4bb2-8706-1ec2257faf73.png)</br>
​
### 5. Test
​
Operate 'euphony-listener' app on the connected device.</p>
![run](https://user-images.githubusercontent.com/47289893/128968893-cca8c520-4dcc-41e7-9e04-9d4849143176.png)</br>
![run-build](https://user-images.githubusercontent.com/47289893/128969518-043e50ae-aa45-4d0a-b145-9e7d1176353c.png)</br>
​
#### Speaker
​
Speaker demo is available at [here](https://dev.jbear.co/euphony/). Enter short text and press the 'broadcast' button.</p>
![speaker](https://user-images.githubusercontent.com/47289893/128968935-b4cd781a-5de0-42cf-a01a-ec87a47f77b6.png)</br>
​
#### Listener
​
When the 'LISTEN' button is pressed, recognition begins.</p>
![device](https://user-images.githubusercontent.com/47289893/128969127-1b7847ec-43c7-42cb-8b6b-a6602f51db7f.png)</br>
​
#### Log
​
![logcat](https://user-images.githubusercontent.com/47289893/128969052-3b70b562-f4ce-4ba6-98e5-d9be4096ab76.png)</br>
​
## Euphony Listener is very easy to use
​
```java
EuRxManager mRxManager = new EuRxManager();
mRxManager.setAcousticSensor(new AcousticSensor() {
@Override
    public void notify(String letters) {
        //when data is received
    }
});
mRxManager.listen();  //Listening Start
// if you want to finish listening, call the finish();
// mRxManager.finish();
```
​
## Contributing 
​
Changes and improvements are more than welcome! Feel Free to fork and open a pull request. Please make your changes in a specific branch and request to pull into master.
​
## License
​
Euphony is licensed under the Apache 2.0 license. (https://github.com/designe/Euphony/blob/master/LICENSE)