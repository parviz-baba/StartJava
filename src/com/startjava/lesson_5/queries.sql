-- Вывести всю таблицу jaegers
  SELECT j.model_name AS mn, j.mark, j.launch
  	FROM jaegers AS j;

-- Вывести всех роботов, которые не уничтожены
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j
   WHERE j.status != 'Destroyed';

-- Показать только роботов серий Mark-1 и Mark-4
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j
   WHERE j.mark IN ('Mark-1', 'Mark-4');

-- Показать всех роботов, кроме Mark-1 и Mark-4, отсортировав по убыванию столбца mark
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j
   WHERE j.mark NOT IN ('Mark-1', 'Mark-4')
ORDER BY j.mark DESC;

-- Показать информацию о самом старом роботе
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j
ORDER BY    j.launch ASC
LIMIT 1;

-- Показать информацию о роботе, который уничтожил больше всего kaiju
  SELECT j.model_name AS mn, j.mark, j.launch, j.kaiju_kill
    FROM jaegers AS j
ORDER BY j.kaiju_kill DESC
LIMIT 1;

-- Вывести средний вес роботов, округлив до трёх знаков после запятой
  SELECT ROUND(AVG(j.weight), 3) AS avg_weight
    FROM jaegers AS j;

-- Увеличить количество уничтоженных kaiju для уничтоженных роботов на единицу
  UPDATE jaegers AS j
     SET j.kaiju_kill = j.kaiju_kill + 1
   WHERE j.status = 'Destroyed';

-- Показать обновлённую таблицу
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j;

-- Удалить уничтоженных роботов
DELETE
  	FROM jaegers AS j
   WHERE j.status = 'Destroyed';

-- Показать оставшихся роботов
  SELECT j.model_name AS mn, j.mark, j.launch
    FROM jaegers AS j;