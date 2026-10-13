FROM mysql/mysql-server:latest
COPY my.cnf /etc/my.cnf
COPY world.sql /docker-entrypoint-initdb.d
ENV MYSQL_ROOT_PASSWORD password
ENV MYSQL_ROOT_HOST=%