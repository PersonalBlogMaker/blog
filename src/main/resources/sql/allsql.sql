DROP TABLE IF EXISTS USER;
CREATE TABLE USER(
	id varchar(64) PRIMARY KEY,
	account varchar(255),
	username varchar(255),
	password varchar(255)
)ENGINE INNODB DEFAULT CHARSET=UTF8;

DROP TABLE IF EXISTS CATEGORY;
CREATE TABLE CATEGORY(
	id VARCHAR(64) PRIMARY KEY,
	NAME VARCHAR(255),
	description VARCHAR(255),
	active VARCHAR(64) DEFAULT "0",
	create_by VARCHAR(64),
	create_date DATETIME,
	update_by VARCHAR(64),
	update_date DATETIME
)ENGINE INNODB DEFAULT CHARSET=UTF8;

DROP TABLE IF EXISTS ARTICLE;
CREATE TABLE ARTICLE(
	id VARCHAR(64) PRIMARY KEY,
	content text,
	category_id VARCHAR(64) NOT NULL,
	title VARCHAR(255) NOT NULL,
	keywords VARCHAR(255),
	description VARCHAR(255),
	remark VARCHAR(255),
	weight int DEFAULT 0,
	weight_date datetime,
	hits int DEFAULT 0,
	create_by VARCHAR(64),
	create_date datetime,
	update_by VARCHAR(64),
	update_date datetime,
	active VARCHAR(64) DEFAULT "1"
)ENGINE INNODB DEFAULT CHARSET=UTF8;





CREATE TABLE article
(
	id varchar(64) NOT NULL,
	category_id varchar(64) NOT NULL,
	title varchar(255) NOT NULL,
	keywords varchar(255),
	description varchar(255),
	weight int DEFAULT 0,
	weight_date datetime,
	hits int DEFAULT 0,
	create_by varchar(64),
	create_date datetime,
	update_by varchar(64),
	update_date datetime,
	remarks varchar(255),
	del_flag char(1) DEFAULT '1' NOT NULL,
	PRIMARY KEY (id)
);