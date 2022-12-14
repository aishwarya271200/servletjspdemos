DROP DATABASE IF EXISTS bookstore;
CREATE DATABASE bookstore;

USE bookstore;

CREATE TABLE PUBLISHER (
	CODE VARCHAR(4) NOT NULL,
	PUBLISHER_NAME VARCHAR(100) NOT NULL,
	PRIMARY KEY (CODE)
);

CREATE TABLE BOOK (
	ISBN VARCHAR(50) NOT NULL,
	BOOK_NAME VARCHAR(100) NOT NULL,
	PUBLISHER_CODE VARCHAR(4),
	PRIMARY KEY (ISBN),
	FOREIGN KEY (PUBLISHER_CODE) REFERENCES PUBLISHER (CODE)
);

CREATE TABLE CHAPTER (
	BOOK_ISBN VARCHAR(50) NOT NULL,
	CHAPTER_NUM INT NOT NULL,
	TITLE VARCHAR(100) NOT NULL,
	PRIMARY KEY (BOOK_ISBN, CHAPTER_NUM),
	FOREIGN KEY (BOOK_ISBN) REFERENCES BOOK (ISBN)
);


select * 
from book, publisher 
where book.publisher_code = publisher.code
  and book.isbn = 'isbn-000117jd93301';
  
select * 
from book inner join publisher 
on book.publisher_code = publisher.code
  and book.isbn = 'isbn-000117jd93301';  