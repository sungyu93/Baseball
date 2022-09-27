### MariaDB 사용자 생성 및 권한 주기
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';

### DB와 Spring
- DB에는 언더바(_)를 사용한다.
- Spring에는 카멜표기법을 사용한다.

### 테이블 생성
```sql
USE greendb;

create table stadium(
    id int primary KEY auto_increment,
    name varchar(20),
    created_at TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    name varchar(20),
    stadium_id INT,
    created_at TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    name varchar(20),
    position VARCHAR(20),
    team_id INT,
    is_outer BOOLEAN,
    created_at TIMESTAMP
);
```

### 더미데이터 추가
```sql
INSERT INTO stadium(NAME, created_at) VALUES('사직야구장', NOW());
INSERT INTO stadium(NAME, created_at) VALUES('잠실야구장', NOW());
INSERT INTO stadium(NAME, created_at) VALUES('고척야구장', NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('롯데', 1, NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('두산', 2, NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('키움', 3, NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('이대호', '1루수', 1, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('홍길동', '외야수',2, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('장보고', '투수', 3, 0,NOW());
COMMIT;
```

### Tip

#### MariaDB auto commit 해제 하기
```sql
show variables like 'autocommit%';
SET AUTOCOMMIT = FALSE;
```