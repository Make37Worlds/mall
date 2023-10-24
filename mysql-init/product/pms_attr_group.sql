/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_attr_group                                        */
/*==============================================================*/
USE product;
drop table if exists pms_attr_group;
create table pms_attr_group
(
   attr_group_id        bigint not null auto_increment  comment '����id',
   attr_group_name      char(20)  comment '����',
   sort                 int  comment '����',
   descript             varchar(255)  comment '����',
   icon                 varchar(255)  comment '��ͼ��',
   catelog_id           bigint  comment '��������id',
   primary key (attr_group_id)
);

alter table pms_attr_group comment '���Է���';

