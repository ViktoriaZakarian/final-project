Закарян Виктория Эдиковна

+375259356966

zakarianviktoria@gmail.com

Тестовый автоматизированный фреймворк для сайта книжного интернет-магазина MyBooks

Структура проекта

src/main/java/by.mybooks - содержит основной код страниц веб-приложения и утилитарные классы.
1. Пакет api:

ApiMessage: содержит сообщения для выполнения проверок

LoginRequest: передача данных при отправке api-запросов

2. Пакет domain:

User: Модель пользователя с его данными.

Users: Предназначен для генерации различных пользователей с разными комбинациями логинов и паролей.

3. Пакет driver:

Driver: Управляет взаимодействием с веб-драйвером.

4. Пакет ui (классы в проекте реализуют паттерн Page Object Model):

   4.1 homePage с классами HomePage, HomePageMessage, HomePageXpath

   4.2 login с классами LoginPage, LoginPageMessage, LoginPageXpath

   4.3 searchstring с классами SearchStringPage, SearchStringPageMessage, SearchStringPageXpath

   4.4 steps с классами BasketStep, CatalogStep, LoginStep

6. Пакет util:

Books: содержит константы с названиями книг, используемых в тестах

Util: содержит методы генерации случайных данных 

src/test/java/by.mybooks содержит тесты.
1. Пакет api:

ApiTest: содержит API тесты формы логина

2. Пакет ui:

BaseTest: содержит предварительные настройки запуска и завершения ui-тестов

HomePageTest: содержит UI тесты на проверку открытия ссылок, находящихся на домашней странице

LoginPageTest: содержит UI тесты формы логина

SearchStringPageTest: содержит UI тесты поиска и добавления товара в корзину
