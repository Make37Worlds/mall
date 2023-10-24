/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_brand                                             */
/*==============================================================*/
USE product;
drop table if exists pms_brand;
create table pms_brand
(
   brand_id             bigint not null auto_increment  comment 'Ʒ��id',
   name                 char(50)  comment 'Ʒ����',
   logo                 varchar(2000)  comment 'Ʒ��logo��ַ',
   descript             longtext  comment '����',
   show_status          tinyint  comment '��ʾ״̬[0-����ʾ��1-��ʾ]',
   first_letter         char(1)  comment '��������ĸ',
   sort                 int  comment '����',
   primary key (brand_id)
);

alter table pms_brand comment 'Ʒ��';

