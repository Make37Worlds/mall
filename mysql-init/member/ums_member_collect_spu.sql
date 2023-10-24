/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member_collect_spu                                */
/*==============================================================*/
USE member;
drop table if exists ums_member_collect_spu;
create table ums_member_collect_spu
(
   id                   bigint not null  comment 'id',
   member_id            bigint  comment '��Աid',
   spu_id               bigint  comment 'spu_id',
   spu_name             varchar(500)  comment 'spu_name',
   spu_img              varchar(500)  comment 'spu_img',
   create_time          datetime  comment 'create_time',
   primary key (id)
);

alter table ums_member_collect_spu comment '��Ա�ղص���Ʒ';

