CREATE TABLE IF NOT EXISTS jaegers (
    id SERIAL PRIMARY KEY,
    model_name VARCHAR(50) NOT NULL,
    mark VARCHAR(50) NOT NULL,
    height REAL NOT NULL,
    weight REAL NOT NULL,
    status VARCHAR(20),
    origin VARCHAR(50),
    launch DATE,
    kaiju_kill INTEGER
);

\i D:/git/StartJava/src/com/startjava/lesson_5/populate.sql

\i D:/git/StartJava/src/com/startjava/lesson_5/queries.sql