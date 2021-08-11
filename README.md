## Quick Start


### 1. 저장소 클론

```bash
$ git clone https://github.com/euphony-io/euphony-listener.git
```

![clone](https://user-images.githubusercontent.com/47289893/128968369-e30bfc36-3c57-418d-b3b2-b8976436493b.png)


### 2. 안드로이드 스튜디오에서 열기

clone한 프로젝트의 경로를 찾아서 열어준다.

![open](https://user-images.githubusercontent.com/47289893/128968509-21778091-1c48-432d-8c68-856d89c59a07.png)

Trust Project 버튼을 누른다.

![trust](https://user-images.githubusercontent.com/47289893/128968544-78756386-1740-43e7-9f27-78f9322307f8.png)


### 3. JDK 설정

처음 열 때 JDK location error가 발생할 수 있다.

![set jdk-1](https://user-images.githubusercontent.com/47289893/128968605-e73af820-0ae7-4e8c-997a-1c1cdbef7129.png)

Change JDK location을 클릭하여 Gradle JDK를 지정한다.

![set jdk-2](https://user-images.githubusercontent.com/47289893/128968614-0988ac95-1672-411d-8e9e-336503be69cd.png)

프로젝트를 다시 열면 build가 시작된다.

![build](https://user-images.githubusercontent.com/47289893/128968741-00b1cd80-a9f7-4481-bd1a-ff388141080f.png)



### 4. 디바이스 연결

기본적으로 디바이스가 없다.

![no device](https://user-images.githubusercontent.com/47289893/128968845-d0868890-cb57-4721-a956-857b871e7393.png)

개발자 모드가 활성화된 디바이스를 연결하면 자동으로 인식된다.

![yes device](https://user-images.githubusercontent.com/47289893/128968864-35b7ae72-6fb8-4bb2-8706-1ec2257faf73.png)



### 5. 테스트

연결된 디바이스에서 euphony-listener를 동작시킨다.

![run](https://user-images.githubusercontent.com/47289893/128968893-cca8c520-4dcc-41e7-9e04-9d4849143176.png)

![run-build](https://user-images.githubusercontent.com/47289893/128969518-043e50ae-aa45-4d0a-b145-9e7d1176353c.png)

#### Speaker
[여기](https://dev.jbear.co/euphony/)에서 Speaker demo를 사용할 수 있다. 짧은 텍스트를 입력하고 broadcast를 누른다.

![speaker](https://user-images.githubusercontent.com/47289893/128968935-b4cd781a-5de0-42cf-a01a-ec87a47f77b6.png)


#### Listener

LISTEN 버튼을 누르면 인식이 시작된다.

![device](https://user-images.githubusercontent.com/47289893/128969127-1b7847ec-43c7-42cb-8b6b-a6602f51db7f.png)

#### Log

![logcat](https://user-images.githubusercontent.com/47289893/128969052-3b70b562-f4ce-4ba6-98e5-d9be4096ab76.png)

