***Автоматизировать тесты для приложения: http://the-internet.herokuapp.com/***
- Каждая страница - отдельный класс и тест. 
- Pull request в GIT и ментор в Reviewers.

1) Add/Remove Elements - добавить 2 элемента, удалить элемент, 
проверить количество элементов DELETE
Локаторы xpath:
By.xpath("//button[text()='Add Element']")
By.xpath("//button[text()='Delete']")
2) Checkboxes - проверить, что первый чекбокс unchecked, отметить первый чекбокс, 
проверить что он checked.
Проверить, что второй чекбокс checked, 
сделать unheck, проверить, что он unchecked
Локатор By.cssSelector("[type=checkbox]”)
3) Dropdown - Взять все элементы дроп-дауна и проверить их наличие. 
Выбрать первый, проверить, что он выбран, выбрать второй, проверить, что он выбран
Локатор By.id(“dropdown”)
4) Inputs - Проверить на возможность ввести различные цифровые и 
нецифровые значения, используя Keys.ARROW_UP и Keys.ARROW_DOWN
Локатор By.tagName(“input”)
5) Typos - Проверить соответствие параграфа орфографии
Локатор By.tagName(“p”)

* Sortable Data Tables - Проверить содержимое нескольких (3-5) ячеек таблицы. 
Использовать xpath типа //table//tr[1]//td[1] - получение первой ячейки из первого ряда первой таблицы и так далее
* Hovers - Сделать цепочку из действий: наведение на профиль, проверка имени, 
клик по ссылке, проверка что нет 404 ошибки. Повторить для каждого из профилей. 
Использовать класс Actions и https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
* Notification Messages - кликнуть на кнопку, дождаться появления нотификации, 
проверить соответствие текста ожиданиям