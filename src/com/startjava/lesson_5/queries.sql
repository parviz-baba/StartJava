-- Вывести всю таблицу jaegers
SELECT * FROM jaegers;

-- Вывести всех роботов, которые не уничтожены
SELECT * FROM jaegers WHERE status != 'Destroyed';

-- Показать только роботов серий Mark-1 и Mark-4
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4');

-- Показать всех роботов, кроме Mark-1 и Mark-4, отсортировав по убыванию столбца mark
SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4') ORDER BY mark DESC;

-- Показать информацию о самом старом роботе
SELECT * FROM jaegers ORDER BY launch ASC LIMIT 1;

-- Показать информацию о роботе, который уничтожил больше всего kaiju
SELECT model_name, mark, launch, kaiju_kill FROM jaegers ORDER BY kaiju_kill DESC LIMIT 1;

-- Вывести средний вес роботов, округлив до трёх знаков после запятой
SELECT ROUND(AVG(weight), 3) AS avg_weight FROM jaegers;

-- Увеличить количество уничтоженных kaiju для уничтоженных роботов на единицу
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status = 'Destroyed';

-- Показать обновлённую таблицу
SELECT * FROM jaegers;

-- Удалить уничтоженных роботов
DELETE FROM jaegers WHERE status = 'Destroyed';

-- Показать оставшихся роботов
SELECT * FROM jaegers;
