/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_attr_attrgroup_relation                           */
/*==============================================================*/
USE product;
drop table if exists pms_attr_attrgroup_relation;
create table pms_attr_attrgroup_relation
(
   id                   bigint not null auto_increment  comment 'id',
   attr_id              bigint  comment '����id',
   attr_group_id        bigint  comment '���Է���id',
   attr_sort            int  comment '������������',
   primary key (id)
);

alter table pms_attr_attrgroup_relation comment '����&���Է������';

