select * from member;
select * from bank;
select * from mobile;

select * from tab;
select * from member where id like 'aa';
select * from member where id like ?;
select * from member where name like '%aa%';
drop table mobile;

drop sequence customer_num;
update member set addr = '서울' where id = 'aa';

create sequence customer_num start with 1000;
create table bank(
	customer_num varchar2(20) primary key,
	account_num varchar2(20) not null,
	money varchar2(20) default 0,
	id varchar2(20),
	foreign key(id) references member(id)
	on delete cascade 
);


CREATE TABLE mobile(
customer_num int PRIMARY KEY,
phone_num VARCHAR2(20),
reg_date date,
telecom VARCHAR2(20),
id VARCHAR2(20),
FOREIGN KEY(id) REFERENCES Member(id) ON DELETE CASCADE);

insert into bank(customer_num,account_num,money,id)into(customer_num.nextval, '1234-5678',0,'kim');




select
a.customer_num,
m.id,
m.pass,
m.name,
m.ssn,
m.phone,
m.email,
m.profile,
m.addr,
a.account_num,
a.money,
from member m, bank a
where m.id = a.id;
order by a.customer_num;


select
b.customer_num,
m.id,
m.pass,
m.name,
m.ssn,
m.email,
m.phone,
m.addr,
m.profile,
b.account_num,
b.money
from member m, bank b
where m.id = b.id ;






