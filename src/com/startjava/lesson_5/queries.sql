-- Вывести всю таблицу jaegers
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 ORDER BY j.model_name ASC;

-- Вывести всех роботов, которые не уничтожены
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 WHERE j.status != 'Destroyed'
 ORDER BY j.model_name ASC;

-- Показать только роботов серий Mark-1 и Mark-4
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 WHERE j.mark IN ('Mark-1', 'Mark-4')
 ORDER BY j.model_name ASC;

-- Показать всех роботов, кроме Mark-1 и Mark-4, отсортировав по убыванию столбца mark
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 WHERE j.mark NOT IN ('Mark-1', 'Mark-4')
 ORDER BY j.mark DESC, j.model_name ASC;

-- Показать информацию о самом старом роботе
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 ORDER BY j.launch ASC
 LIMIT 1;

-- Показать информацию о роботе, который уничтожил больше всего kaiju
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 ORDER BY j.kaiju_kill DESC
 LIMIT 1;

-- Вывести средний вес роботов, округлив до трёх знаков после запятой
SELECT ROUND(AVG(j.weight), 3) AS avg_weight
  FROM jaegers AS j;

-- Увеличить количество уничтоженных kaiju для уничтоженных роботов на единицу
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Destroyed';

-- Показать обновлённую таблицу
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 ORDER BY j.model_name ASC;

-- Удалить уничтоженных роботов
DELETE FROM jaegers
 WHERE status = 'Destroyed';

-- Показать оставшихся роботов
SELECT *, j.model_name AS mn, j.kaiju_kill AS kk
  FROM jaegers AS j
 ORDER BY j.model_name ASC;