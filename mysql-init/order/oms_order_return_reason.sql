/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order_return_reason                               */
/*==============================================================*/
USE order;
drop table if exists oms_order_return_reason;
create table oms_order_return_reason
(
   id                   bigint not null auto_increment  comment 'id',
   name                 varchar(200)  comment '�˻�ԭ����',
   sort                 int  comment '����',
   status               tinyint(1)  comment '����״̬',
   create_time          datetime  comment 'create_time',
   primary key (id)
);

alter table oms_order_return_reason comment '�˻�ԭ��';

