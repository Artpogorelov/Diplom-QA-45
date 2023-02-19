## Дипломный проект профессии "Тестировщик"

___

### Документация по проекту

1. [План тестирования](https://github.com/Artpogorelov/Diplom-QA-45/blob/main/Plan.md)
2. [Отчет по итогам автоматизированного тестирования](https://github.com/Artpogorelov/Diplom-QA-45/blob/main/Report.md)
3. [Отчет по итогам автоматизации](https://github.com/Artpogorelov/Diplom-QA-45/blob/main/Summary.md)

### Запуск приложения

Для запуска приложения необходимо следующее ПО:
* IntelliJ IDEA
* Docker

* склонировать репозиторий на свой ПК командой ```git clone https://github.com/Artpogorelov/Diplom-QA-45```
* В терминале IntelliJ IDEA с помощью команды ```docker-compose up```  разворачиваем контейнер, необходимый для дальнейшей работы (настройки для запуска контейнера 

В новой вкладке терминала запустить тестируемое приложение:
   * Для MySQL: 
   ```
    java -jar ./artifacts/aqa-shop.jar -spring.datasource.url=jdbc:mysql://localhost:3306/app

   ```
   * Для PostgreSQL: 
   ```
    java -jar ./artifacts/aqa-shop.jar -spring.datasource.url=jdbc:postgresql://localhost:5432/app
  
  ```
   ### Запуск тестов
В новой вкладке терминала запустить тесты:
1. Для MySQL: 
   ```
   ./gradlew clean test "-Ddb.url=jdbc:mysql://192.168.99.100:3306/app"
   ```
1. Для PostgreSQL: 
 ```
   ./gradlew clean test "-Ddb.url=jdbc:mysql://192.168.99.100:5432/app"
   ```
  
* запустить отчет командой:
```./gradlew allureServe (запуск и открытие отчета)```

* остановить SUT комбдинацией клавиш ```CTRL+C```

* Остановить контейнеры командой ```docker-compose stop``` и после удалить контейнеры командой
  ```docker-compose down```

    
