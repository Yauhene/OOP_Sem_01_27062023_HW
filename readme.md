1. Основные проблемы, конечно, вызвала моя дремучесть в Java. Достаточно долго пришлось искать и заставлять работать способности плавать, бегать и летать по умолчанию для каждого отдельного класса скотины.
2. Получаются очень длинные массивы аргументов.
3. В принципе расматривалась обработка умений экземпляров на основе названия класса. Так и не смог заставить каждый экземпляр дочерних классов передавать название своего класса в родительский класс. Это сильно сэкономило бы время, можно было бы по названию класса фильтровать способности каждого экземпляра (рудимент от этих экспериментов - поле "creature" в каждом классе). Это вообще возможно - передавать имя подкласса родителю?