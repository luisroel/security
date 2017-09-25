DROP USER IF EXISTS 'sunny_root'@'*';
CREATE USER 'sunny_root'@'*' IDENTIFIED BY 'pa$$w0rd';
GRANT ALL PRIVILEGES ON *.* TO 'sunny_root'@'*';
DROP USER IF EXISTS 'sunny_usr'@'*';
CREATE USER 'sunny_usr'@'*' IDENTIFIED BY 'pa$$w0rd';
GRANT ALL PRIVILEGES ON sunny_prod_db.* TO 'sunny_usr'@'*';
FLUSH PRIVILEGES;
