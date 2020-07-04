DROP TABLE IF EXISTS user;
CREATE TABLE user AS_SELECT * FROM CSVREAD('C:\repositorios\CucumberSpringBoot\src\main\resources\tables\data.sql');