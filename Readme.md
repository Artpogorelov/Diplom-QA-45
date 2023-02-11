## Дипломный проект профессии "Тестировщик"

___

### Документация по проекту

1. [План тестирования](https://github.com/Artpogorelov/Diplom-QA-45/blob/main/Plan.md)
2. [Отчет по итогам автоматизированного тестирования]
3. [Отчет по итогам автоматизации](https://github.com/Artpogorelov/Diplom-QA-45/blob/main/Summary.md)

### Запуск приложения

Для запуска приложения необходимо следующее ПО:
* IntelliJ IDEA
* Docker

* склонировать репозиторий на свой ПК командой ```git clone https://github.com/Artpogorelov/Diplom-QA-45```
* В терминале IntelliJ IDEA с помощью команды ```docker-compose up```  разворачиваем контейнер, необходимый для дальнейшей работы (настройки для запуска контейнера прописаны в файле docker-compose.yml)
* в терминале IntelliJ IDEA запустить SUT: с помощью команды ```java -jar .\artifacts\aqa-shop.jar```
* запустить тесты командой ```./gradlew clean test```

    
