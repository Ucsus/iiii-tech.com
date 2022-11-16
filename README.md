<a href="https://iiii-tech.com" target="_blank"><img src="/images/header.jpg?raw=true"></a>
## Содержание :bookmark_tabs:
🟣 <a href="#stack">Cтек технологий</a></br>
🟣 <a href="#testcases">Реализованные проверки</a></br>
🟣 <a href="#jenkins">Сборка в Jenkins</a></br>
🟣 <a href="#console">Запуск из терминала</a></br>
🟣 <a href="#allure">Allure отчет</a></br>
🟣 <a href="#alluretestops">Allure TestOps</a></br>
🟣 <a href="#jira">Интеграция с Jira</a></br>
🟣 <a href="#telegram">Отчет в Telegram</a></br>
🟣 <a href="#video">Видео прохождения тестов</a>

<a id="stack"></a>
## Cтек технологий :hammer_and_wrench:
<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="/images/logos/Intelij_IDEA.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="/images/logos/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="/images/logos/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="/images/logos/Selenide.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="/images/logos/Selenoid.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="/images/logos/Gradle.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="/images/logos/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="/images/logos/Allure.svg" width="50"/></a>
 <a href="https://qameta.io/"><img alt="Allure TestOps" height="50" src="/images/logos/testops.svg" width="50"/></a>
 <a href="https://www.atlassian.com/software/jira"><img alt="Jira" height="50" src="/images/logos/jira.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="/images/logos/GitHub.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="/images/logos/Telegram.svg" width="50"/></a>
</div>

<a id="testcases"></a>
## Реализованные проверки :mag:
✓ Проверка отображения заголовка сайта</br>
✓ Проверка и заполнение формы "Задать вопрос"</br>
✓ Проверка меню второго уровня</br>
✓ Проверка ссылок соцсетей в подвале</br>
✓ Проверка шэринга материалов

<a id="jenkins"></a>
## Сборка в Jenkins <img alt="Jenkins" height="32" src="/images/logos/Jenkins.svg"/></img></br>
<img src="/images/screens/jenkins.jpg"></br>
### Параметры сборки в Jenkins:
- Browser (браузер, по умолчанию chrome)
- Browser_version (версия браузера, по умолчанию 100)
- Browser_size (размер окна браузера, по умолчанию 1920x1080)
- REMOTE_URL (логин, пароль и адрес удаленного сервера selenoid)

<a id="console"></a>
## Запуск из терминала :desktop_computer:
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${Browser}
-DbrowserVersion=${Browser_version}
-DbrowserSize=${Browser_size}
-Durl=${REMOTE_URL}
```
### Для запуска удаленных тестов необходимо заполнить remote.properties или передать значение:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Запуск тестов с заполненным remote.properties:
```bash
gradle clean test
```

Запуск тестов с незаполненным remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Отчет:
```bash
allure serve build/allure-results
```

<a id="allure"></a>
## Allure отчёт <img alt="Allure" height="32" src="/images/logos/Allure.svg"/></img></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/13/allure/">Обзор</a>
<img src="/images/screens/alluremain.jpg"></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/13/allure/#packages">Тесты</a>
<img src="/images/screens/allurepackages.jpg"></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/13/allure/#graph">Графики</a>
<img src="/images/screens/alluregraphs.jpg"></br>

<a id="alluretestops"></a>
## Allure TestOps <img alt="Allure TestOps" height="32" src="/images/logos/testops.svg"/></img></br>
### Обзор
<img src="/images/screens/alluretestopslaunches.jpg"></br>
### Тесты
<img src="/images/screens/alluretestopstests.jpg"></br>

<a id="jira"></a>
## Интеграция с Jira <img alt="jira" height="32" src="/images/logos/jira.svg"/></img></br>
<img src="/images/screens/jira.jpg"></br>

<a id="telegram"></a>
## Отчет в Telegram <img alt="jira" height="32" src="/images/logos/Telegram.svg"/></img></br>
<img src="/images/screens/telegram.jpg"></br>

<a id="video"></a>
## Видео прохождения тестов :clapper:
https://user-images.githubusercontent.com/7962244/202163328-65371d67-3944-4978-b1e8-e82b5102c220.mp4


