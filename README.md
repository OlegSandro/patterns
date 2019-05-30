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