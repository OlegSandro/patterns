# PatternsProject
Проект, демонстрирующий реализацию основных шаблонов проектирования


---
**Представленные шаблоны проектирования**

---

* Синглтон
* Адаптер
* Фасад
* Команда
* Фабричный метод
* Делегат
* Декоратор
* Строитель
* Наблюдатель

Для тестирования всех вышеуказанных примеров реализации шаблонов проектирования в проекте имеется пакет 
`test` с классом, где присутствует метод `main()`, в котором последовательно демонстрируется использование 
реализованных паттернов на практике. Там же встречается закоментированный код, который тоже несёт смысловую 
нагрузку и примеры альтернативных реализаций.

---
**Синглтон**

---

Шаблон проектирования синглтон реализован в пакете `singleton`.

В пакете `singleton` содержится 1 класс с названием `Earth`, который представляет собой класс-одиночку.


---
**Адаптер**

---

Шаблон проектирования адаптер реализован в пакете `adapter`.

В пакете `adapter` содержится 2 интерфейса `ElectricalDevice` и `ElectronicDevice` и их реализации 
`Lamp` и `Smartphone` соответственно. `Lamp` использует для своей работы переменный ток (класс `AC`), 
а `Smartphone` использует постоянный ток (класс `DC`). Также в пакете имеется розетка (класс `Outlet220V`), 
которую по легенде задания невозможно переделать для того, чтобы к ней могли подсоединяться не только 
реализации интерфейса `ElectricalDevice`, но и `ElectronicDevice`. Поэтому, чтобы подключить имплементации 
интерфейса `ElectronicDevice`, был построен класс адаптера `ChargeAdapter`, чтобы электронные устройства 
могли тоже подключаться к розетке, как и имплементации интерфейса `ElectricalDevice`, но посредством 
применения адаптера, который по сути является преобразователем переменного тока в постоянный.


---
**Фасад**

---

Шаблон проектирования фасад реализован в пакете `facade`.

В пакете `facade` содержится 4 класса. Три их них - `PrimaryAccountingWork`, `SalaryCalculatingWork` и 
`TaxReportsPreparationWork` - представляют собой примеры сделанных бухгалтером конкретных видов работ 
(соответственно проведение первичного бухгалтерского учёта, начисление заработной платы, подготовка 
налоговой ведомости). Четвёртый класс `AccountantWork` по своей сути является фасадным и представляет 
собой проделанную бухгалтером работу в целом, но в то же время все результаты выполнения идентичны тем, 
если бы вызывались все виды работ по отдельности.


---
**Команда**

---

Шаблон проектирования команда реализован в пакете `command`.

В пакете `command` содержатся классы `Maven` и `Programmer`, которые соответственно представляют собой 
реализации таких сущностей, как программа Maven и программист. Чтобы программист мог взаимодействовать 
с программой Maven, ему нужно выполнять команды. Для этого в пакете есть интерфейс `Command` со своими 
реализациями `CleanCommand`, `BuildCommand` и `TomcatRunCommand`.


---
**Фабричный метод**

---

Шаблон проектирования фабричный метода реализован в пакете `factorymethod`.

В пакете `factorymethod` содержится 2 интерфейса `Game` и `GameGenerator`. `Game` имеет свои реализации: 
`EasyLevelGame` и `HardLevelGame` - для представления игры на лёгком уровне и игры на тяжёлом уровне 
соответственно. В то же время интерфейс `GameGenerator` имеет уже свои реализации: `EasyLevelGameGenerator` 
и `HardLevelGameGenerator`. Они служат как фабрики для порождения объектов классов `EasyLevelGame` и 
`HardLevelGame` соответственно.


---
**Делегат**

---

Шаблон проектирования делегат реализован в пакете `delegate`.

В пакете `delegate` содержится интерфейс `DishMaker`, представляющий собой человека, в обязанности которого 
входит приготовление позиций из меню. Таким человеком может быть повар (класс `Cook`), готовящий пищу, и/или
бармен, предоставляющий выпивку. Также в пакете имеется класс `Waiter`, представляющий официанта. Повар или 
бармен предоставляют результаты своих услуг, а официант просто предоставляет результаты их услуг посетителю, 
ничего дополнительно при этом не делая.


---
**Декоратор**

---

Шаблон проектирования декоратор реализован в пакете `decorator`.

В пакете `decorator` содержится интерфейс `EmailService`, представляющий собой сервис электронной почты. Также 
в пакете содержится 2 класса - `EmailServiceImpl` и `EmailServiceImplWithSignatureFunction`. Первый является 
типичной реализацией сервиса электронной почты, а второй его дополненной версией (декоратором). Таким образом, 
первый умеет отправлять простое письмо, а второй тоже умеет отправлять письмо, но дополненное подписью.


---
**Строитель**

---

Шаблон проектирования строитель реализован в пакете `builder`.

В пакете `builder` содержатся интерфейс `FileBuilder`, представляющий собой инициализатора нового файла (класс `File`) 
и 3 его реализации - постройщика XML-файлов (класс `XmlFileBuilder`), постройщика HTML-файлов (класс `HtmlFileBuilder`) 
и постройщика JSP-файлов (класс `JspFileBuilder`). Для создании каждого из представленных типов файлов нужно 
выполнить одинаковые этапы, но для каждого будут разные данные внутри этих этапов. Поэтому, когда пользователь 
(класс `User`) создаёт новый файл, то ему достаточно вызвать только соответствующего построителя, а тот пройдёт через 
все этапы создания соответствующего файла сам, облегчая пользователю работу по конструированию новго файла и оберегая 
его от необязательных сложностей.


---
**Наблюдатель**

---

Шаблон проектирования наблюдатель реализован в пакете `observer`.

В пакете `observer` содержится интерфейс `Observer`, представляющий собой наблюдателя за кем-то наблюдаемым 
(интерфейс `observed`). Они имеют свои реализации - класс `Subscriber` и класс `Subscribed` соответственно. Таким образом, 
есть наблюдаемый объект и есть субъект наблюдателя и когда наблюдаемый произведёт или с ним произойдёт какое-либо событие, 
то об этом наблюдатель обязательно будет оповещён. 