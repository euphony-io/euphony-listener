# euphony-listener
​
​**version 1.0.0** 🌏 (
[English](https://github.com/euphony-io/euphony-listener/blob/master/README.md), 
[한국어](https://github.com/euphony-io/euphony-listener/blob/master/README_KR.md)
)

## 소개
​
Euphony-Listener는 Speaker로부터 음파를 통해 데이터를 받아 인식하는 기능을 합니다.</br>
스피커가 데이터를 보낼 때 주파수가 발생하게 되는데, Listen 버튼을 누르면 Listener가 데이터를 인식하여 그 결과를 확인할 수 있습니다.</br>
android에서만 동작을 합니다.</br>
​
## Euphony 라이브러리
​
해당 음파 데이터 통신 라이브러리, Euphony의 버전은 안드로이드를 위한 버전입니다.</br>
Euphony는 마이크와 녹음기를 활용하여 다른 단말기(안드로이드, 웹)들과 통신하기 위해 디자인 된 무선 라이브러리를 제공합니다.</br>
​
공식 페이스북 페이지 : https://www.facebook.com/euphonyproject</br>
공식 라이브러리 주소 : https://dev.jbear.co/euphony</br>
​
## 전제 조건
​
앱 모듈의 build.gradle </br>
```gradle
dependencies {
    implementation 'euphony.lib:euphony:0.7.1.6'
}
```
​
**AndroidManifest.xml**
```xml
<uses-permission android:name="android.permission.RECORD_AUDIO" />
```
​
## 빠른 시작
​
### 1. 저장소 클론
​
```bash
$ git clone https://github.com/euphony-io/euphony-listener.git
```
![clone](https://user-images.githubusercontent.com/47289893/128968369-e30bfc36-3c57-418d-b3b2-b8976436493b.png)
​
### 2. 안드로이드 스튜디오에서 열기
​
clone한 프로젝트의 경로를 찾아서 열어준다.</p>
![open](https://user-images.githubusercontent.com/47289893/128968509-21778091-1c48-432d-8c68-856d89c59a07.png)</br>
Trust Project 버튼을 누른다.</p>
![trust](https://user-images.githubusercontent.com/47289893/128968544-78756386-1740-43e7-9f27-78f9322307f8.png)</br>
​
### 3. JDK 설정
​
처음 열 때 JDK location error가 발생할 수 있다.</p>
![set jdk-1](https://user-images.githubusercontent.com/47289893/128968605-e73af820-0ae7-4e8c-997a-1c1cdbef7129.png)</br>
Change JDK location을 클릭하여 Gradle JDK를 지정한다.</p>
![set jdk-2](https://user-images.githubusercontent.com/47289893/128968614-0988ac95-1672-411d-8e9e-336503be69cd.png)</br>
프로젝트를 다시 열면 build가 시작된다.</p>
![build](https://user-images.githubusercontent.com/47289893/128968741-00b1cd80-a9f7-4481-bd1a-ff388141080f.png)</br>
​
### 4. 디바이스 연결
​
기본적으로 디바이스가 없다.</p>
![no device](https://user-images.githubusercontent.com/47289893/128968845-d0868890-cb57-4721-a956-857b871e7393.png)</br>
개발자 모드가 활성화된 디바이스를 연결하면 자동으로 인식된다.</p>
![yes device](https://user-images.githubusercontent.com/47289893/128968864-35b7ae72-6fb8-4bb2-8706-1ec2257faf73.png)</br>
​
### 5. 테스트
​
연결된 디바이스에서 euphony-listener를 동작시킨다.</p>
![run](https://user-images.githubusercontent.com/47289893/128968893-cca8c520-4dcc-41e7-9e04-9d4849143176.png)</br>
![run-build](https://user-images.githubusercontent.com/47289893/128969518-043e50ae-aa45-4d0a-b145-9e7d1176353c.png)</br>
​
#### 스피커
​
[여기](https://dev.jbear.co/euphony/)에서 Speaker demo를 사용할 수 있다. 짧은 텍스트를 입력하고 broadcast 버튼을 누른다.</p>
![speaker](https://user-images.githubusercontent.com/47289893/128968935-b4cd781a-5de0-42cf-a01a-ec87a47f77b6.png)</br>
​
#### 리스너
​
LISTEN 버튼을 누르면 인식이 시작된다.</p>
![device](https://user-images.githubusercontent.com/47289893/128969127-1b7847ec-43c7-42cb-8b6b-a6602f51db7f.png)</br>
​
#### 로그
​
![logcat](https://user-images.githubusercontent.com/47289893/128969052-3b70b562-f4ce-4ba6-98e5-d9be4096ab76.png)</br>
​
## Euphony Listener는 사용하기 매우 쉽습니다.
​
```java
EuRxManager mRxManager = new EuRxManager();
mRxManager.setAcousticSensor(new AcousticSensor() {
    @Override
    public void notify(String letters) {
        // 데이터가 수신되었을 때의 동작
    }
});
mRxManager.listen();  // listening 시작
// listening을 종료하려면 .finish()를 호출
// mRxManager.finish();
```

## 기여
변화와 개선 사항은 언제나 환영합니다! </br>
자유롭게 fork하고 PR을 열어주세요. </br>
여러분의 개선 사항을 특정 branch로 만들고 master로 pull을 요청해주세요.

## 라이센스
Euphony는 Apache 2.0 license를 따릅니다. (https://github.com/designe/Euphony/blob/master/LICENSE)