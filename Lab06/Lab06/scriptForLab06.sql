create table MAILS (ID bigint auto_increment primary key,
SENDER_ID bigint not null,
RECEIVER bigint not null,
TOPIC nvarchar(50) not null,
TEXT nvarchar(300) not null,
constraint FK_SENDER foreign key (SENDER_ID) references PERSONS(ID));

ALTER TABLE MAILS ADD COLUMN SENDERDATE date;

INSERT INTO PERSONS (NAME, SURNAME, THIRDNAME,BIRTHDATE) VALUES ('VSEVOLOD', 'TRUSOV', 'SERGEEVICH',
                                                                 '1980-01-01');
INSERT INTO PERSONS (NAME, SURNAME, THIRDNAME,BIRTHDATE) VALUES ('ALEXANDER', 'MATNIKOV', 'ALEXEEVICH',
                                                                 '1980-10-10');

insert into MAILS (SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE) values (1, 2, 'HELLO', 'HELLO WORLD', '2017-01-01');
insert into MAILS (SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE) values (2, 1, 'LONG TEXT', 'HELLO WORLD', '2017-01-01');
SELECT TEXT FROM MAILS WHERE SENDER_ID = 1;