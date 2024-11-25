-- Подключение к базе данных robots
\c robots

-- Удалить существующую таблицу, если она есть, чтобы создать новую
DROP TABLE IF EXISTS jaegers;

-- Создать таблицу jaegers
CREATE TABLE jaegers (
    jaeger_id  SERIAL       PRIMARY KEY,
    model_name VARCHAR(50)  NOT NULL,
    mark       VARCHAR(50)  NOT NULL,
    height     NUMERIC      NOT NULL,
    weight     NUMERIC      NOT NULL,
    status     VARCHAR(20),
    origin     VARCHAR(50),
    launch     DATE,
    kaiju_kill INTEGER
);

-- Подключение файлов с использованием двух ключей (include и relative)
\ir populate.sql
\ir queries.sql