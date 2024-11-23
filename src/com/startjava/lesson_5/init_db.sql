-- Подключение к базе данных robots
\c robots

-- Удалить существующую таблицу, если она есть, чтобы создать новую
DROP TABLE IF EXISTS jaegers;

-- Создать таблицу jaegers, если она ещё не существует
CREATE TABLE IF NOT EXISTS jaegers (
    jaeger_id  SERIAL       PRIMARY KEY,
    model_name VARCHAR(50)  NOT NULL,
    mark       VARCHAR(50)  NOT NULL,
    height     REAL         NOT NULL,
    weight     REAL         NOT NULL,
    status     VARCHAR(20),
    origin     VARCHAR(50),
    launch     DATE,
    kaiju_kill INTEGER
);

-- Включение файла для добавления данных (populate.sql)
\i D:/git/StartJava/src/com/startjava/lesson_5/populate.sql

-- Включение файла для выполнения запросов (queries.sql)
\i D:/git/StartJava/src/com/startjava/lesson_5/queries.sql
