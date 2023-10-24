/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member_login_log                                  */
/*==============================================================*/
USE member;
drop table if exists ums_member_login_log;
create table ums_member_login_log
(
   id                   bigint not null auto_increment  comment 'id',
   member_id            bigint  comment 'member_id',
   create_time          datetime  comment '����ʱ��',
   ip                   varchar(64)  comment 'ip',
   city                 varchar(64)  comment 'city',
   login_type           tinyint(1)  comment '��¼����[1-web��2-app]',
   primary key (id)
);

alter table ums_member_login_log comment '��Ա��¼��¼';

