-- Вывести всю таблицу jaegers
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
  	FROM jaegers AS j;

-- Вывести всех роботов, которые не уничтожены
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j
   WHERE j.status != 'Destroyed';

-- Показать только роботов серий Mark-1 и Mark-4
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j
   WHERE j.mark IN ('Mark-1', 'Mark-4');

-- Показать всех роботов, кроме Mark-1 и Mark-4, отсортировав по убыванию столбца mark
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j
   WHERE j.mark NOT IN ('Mark-1', 'Mark-4')
ORDER BY j.mark DESC;

-- Показать информацию о самом старом роботе
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j
ORDER BY j.launch ASC
LIMIT 1;

-- Показать информацию о роботе, который уничтожил больше всего kaiju
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j
ORDER BY j.kaiju_kill DESC
LIMIT 1;

-- Вывести средний вес роботов, округлив до трёх знаков после запятой
  SELECT ROUND(CAST(AVG(j.weight) AS NUMERIC), 3) AS avg_weight
	FROM jaegers AS j;

-- Увеличить количество уничтоженных kaiju для уничтоженных роботов на единицу
  UPDATE jaegers
     SET kaiju_kill = kaiju_kill + 1
   WHERE status = 'Destroyed';

-- Показать обновлённую таблицу
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j;

-- Удалить уничтоженных роботов
DELETE
  	FROM jaegers AS j
   WHERE j.status = 'Destroyed';

-- Показать оставшихся роботов
  SELECT j.id, j.model_name AS mn, j.mark, j.height, j.weight, j.status, j.origin, j.launch, j.kaiju_kill AS kk
    FROM jaegers AS j;