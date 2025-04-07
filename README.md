<h1>포트폴리오</h1>
<img src="/images/image1.png" alt="Image">
<br>
<h1>소개 및 개요</h1>
URL : https://amjunha106.github.io/portfolio/
프로젝트 기간 : 2025-03-14 ~ 진행중<br>
인원 : 개인<br>
주제 : 포트폴리오사이트 만들기<br>
사용언어 : JAVASCRIPT 
<br>

<details>
  <summary>프로젝트 구조</summary>

  <pre>
C:.
│  .gitattributes
│  .gitignore
│  build.gradle
│  gradlew
│  gradlew.bat
│  HELP.md
│  settings.gradle
│
├─.gradle
│  │  file-system.probe
│  │
│  ├─8.13
│  │  │  gc.properties
│  │  │
│  │  ├─checksums
│  │  │      checksums.lock
│  │  │      md5-checksums.bin
│  │  │      sha1-checksums.bin
│  │  │
│  │  ├─executionHistory
│  │  │      executionHistory.bin
│  │  │      executionHistory.lock
│  │  │
│  │  ├─expanded
│  │  ├─fileChanges
│  │  │      last-build.bin
│  │  │
│  │  ├─fileHashes
│  │  │      fileHashes.bin
│  │  │      fileHashes.lock
│  │  │      resourceHashesCache.bin
│  │  │
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  │      buildOutputCleanup.lock
│  │      cache.properties
│  │      outputFiles.bin
│  │
│  └─vcs-1
│          gc.properties
│
├─.idea
│      .gitignore
│      compiler.xml
│      dbnavigator.xml
│      gradle.xml
│      misc.xml
│      workspace.xml
│
├─.vscode
│      settings.json
│
├─bin
│  ├─main
│  │  │  application.properties
│  │  │
│  │  ├─com
│  │  │  └─web
│  │  │      └─portfolio
│  │  │          │  PortfolioApplication.class
│  │  │          │
│  │  │          └─Controller
│  │  │                  HomeController.class
│  │  │
│  │  ├─static
│  │  │  ├─css
│  │  │  └─images
│  │  │          image1.jpg
│  │  │          image10.png
│  │  │          image11.png
│  │  │          image12.png
│  │  │          image13.png
│  │  │          image14.png
│  │  │          image15.png
│  │  │          image16.png
│  │  │          image17.png
│  │  │          image18.png
│  │  │          image19.png
│  │  │          image2.jpg
│  │  │          image20.png
│  │  │          image21.gif
│  │  │          image22.gif
│  │  │          image23.gif
│  │  │          image24.png
│  │  │          image25.gif
│  │  │          image26.gif
│  │  │          image27.gif
│  │  │          image28.gif
│  │  │          image29.gif
│  │  │          image3.jpg
│  │  │          image30.gif
│  │  │          image31.gif
│  │  │          image32.gif
│  │  │          image33.gif
│  │  │          image34.gif
│  │  │          image35.gif
│  │  │          image36.gif
│  │  │          image37.png
│  │  │          image38.png
│  │  │          image39.png
│  │  │          image4.png
│  │  │          image40.png
│  │  │          image41.png
│  │  │          image42.png
│  │  │          image43.png
│  │  │          image44.png
│  │  │          image45.png
│  │  │          image46.png
│  │  │          image5.png
│  │  │          image6.png
│  │  │          image7.png
│  │  │          image8.png
│  │  │          image9.png
│  │  │
│  │  └─templates
│  │          AboutMe.html
│  │          Contact.html
│  │          Home.html
│  │          Portfolio.html
│  │
│  └─test
│      └─com
│          └─web
│              └─portfolio
│                      PortfolioApplicationTests.class
│
├─build
│  ├─classes
│  │  └─java
│  │      ├─main
│  │      │  └─com
│  │      │      └─web
│  │      │          └─portfolio
│  │      │              │  PortfolioApplication.class
│  │      │              │
│  │      │              └─Controller
│  │      │                      HomeController.class
│  │      │
│  │      └─test
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  ├─main
│  │  │  │  application.properties
│  │  │  │
│  │  │  ├─static
│  │  │  │  ├─css
│  │  │  │  └─images
│  │  │  │          image1.jpg
│  │  │  │          image10.png
│  │  │  │          image11.png
│  │  │  │          image12.png
│  │  │  │          image13.png
│  │  │  │          image14.png
│  │  │  │          image15.png
│  │  │  │          image16.png
│  │  │  │          image17.png
│  │  │  │          image18.png
│  │  │  │          image19.png
│  │  │  │          image2.jpg
│  │  │  │          image20.png
│  │  │  │          image21.gif
│  │  │  │          image22.gif
│  │  │  │          image23.gif
│  │  │  │          image24.png
│  │  │  │          image25.gif
│  │  │  │          image26.gif
│  │  │  │          image27.gif
│  │  │  │          image28.gif
│  │  │  │          image29.gif
│  │  │  │          image3.jpg
│  │  │  │          image30.gif
│  │  │  │          image31.gif
│  │  │  │          image32.gif
│  │  │  │          image33.gif
│  │  │  │          image34.gif
│  │  │  │          image35.gif
│  │  │  │          image36.gif
│  │  │  │          image37.png
│  │  │  │          image38.png
│  │  │  │          image39.png
│  │  │  │          image4.png
│  │  │  │          image40.png
│  │  │  │          image41.png
│  │  │  │          image42.png
│  │  │  │          image43.png
│  │  │  │          image44.png
│  │  │  │          image45.png
│  │  │  │          image46.png
│  │  │  │          image5.png
│  │  │  │          image6.png
│  │  │  │          image7.png
│  │  │  │          image8.png
│  │  │  │          image9.png
│  │  │  │
│  │  │  └─templates
│  │  │          AboutMe.html
│  │  │          Contact.html
│  │  │          Home.html
│  │  │          Portfolio.html
│  │  │
│  │  └─test
│  └─tmp
│      └─compileJava
│          │  previous-compilation-data.bin
│          │
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
│                      HomeController.class.uniqueId0
│
├─gradle
│  └─wrapper
│          gradle-wrapper.jar
│          gradle-wrapper.properties
│
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─web
    │  │          └─portfolio
    │  │              │  PortfolioApplication.java
    │  │              │
    │  │              └─Controller
    │  │                      HomeController.java
    │  │
    │  └─resources
    │      │  application.properties
    │      │
    │      ├─static
    │      │  ├─css
    │      │  └─images
    │      │          image1.jpg
    │      │          image10.png
    │      │          image11.png
    │      │          image12.png
    │      │          image13.png
    │      │          image14.png
    │      │          image15.png
    │      │          image16.png
    │      │          image17.png
    │      │          image18.png
    │      │          image19.png
    │      │          image2.jpg
    │      │          image20.png
    │      │          image21.gif
    │      │          image22.gif
    │      │          image23.gif
    │      │          image24.png
    │      │          image25.gif
    │      │          image26.gif
    │      │          image27.gif
    │      │          image28.gif
    │      │          image29.gif
    │      │          image3.jpg
    │      │          image30.gif
    │      │          image31.gif
    │      │          image32.gif
    │      │          image33.gif
    │      │          image34.gif
    │      │          image35.gif
    │      │          image36.gif
    │      │          image37.png
    │      │          image38.png
    │      │          image39.png
    │      │          image4.png
    │      │          image40.png
    │      │          image41.png
    │      │          image42.png
    │      │          image43.png
    │      │          image44.png
    │      │          image45.png
    │      │          image46.png
    │      │          image5.png
    │      │          image6.png
    │      │          image7.png
    │      │          image8.png
    │      │          image9.png
    │      │
    │      └─templates
    │              AboutMe.html
    │              Contact.html
    │              Home.html
    │              Portfolio.html
    │
    └─test
        └─java
            └─com
                └─web
                    └─portfolio
                            PortfolioApplicationTests.java
  </pre>
</details>

<br>

<br/>
<h1>프로젝트 기술스택</h1>
<h2>프론트엔드 (Front-end)</h2>
<ul>
  <li>Thymeleaf : Spring Mvc패턴의 view단으로 사용하기위해 템플릿 역할로 사용하며 html코드를 동적으로 렌더링하기위해 사용하였습니다.</li>
  <li>Javascript : 프로젝트 정보를 클릭시 팝업을 띄우기 위해 사용하였습니다.</li>
  <li>CSS : 웹 페이지의 스타일과 레이아웃을 정하기 위해 사용하였습니다.</li>
</ul>

<br/>
<h1>프로젝트 관리도구</h1>
<h2>파일 관리 (File Management)</h2>
<ul>
  <li>GitHub : 코드를 새로 작성하거나 업데이트하거나 코드가 꼬여서 백업이 필요할 때 사용하였습니다.</li>
</ul>
<br/>
<h1>1. 메인페이지</h1>
<h3>About Me - Portfolio - Contact 순서로 핵심요소 3가지를 정렬하였습니다.</h3>
<img src="/images/image1.png" width="950px" alt="Image">

<h1>2. About Me</h1>
<h3>About Me는 사용가능한 프론트엔드/백엔드/데이터베이스 기술을 정리해놓았습니다.</h3>
<img src="/images/image2.png" width="950px" alt="Image">

<h1>Portfolio</h1>
<h3>Portfolio는 지금까지 진행한 프로젝트의 상세정보와 깃허브리드미를 확인할 수 있는 링크를 걸어두었습니다.</h3>
<img src="/images/image3.png" width="950px" alt="Image">
<img src="/images/image4.png" width="950px" alt="Image">

<h1>Contact</h1>
<h3>Contact은 제 깃허브아이디와 연락가능한 이메일을 기재해두었습니다.</h3>
<img src="/images/image5.png" width="950px" alt="Image">
