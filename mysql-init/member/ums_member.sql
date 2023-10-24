/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member                                            */
/*==============================================================*/
USE member;
drop table if exists ums_member;
create table ums_member
(
   id                   bigint not null auto_increment  comment 'id',
   level_id             bigint  comment '��Ա�ȼ�id',
   username             char(64)  comment '�û���',
   password             varchar(64)  comment '����',
   nickname             varchar(64)  comment '�ǳ�',
   mobile               varchar(20)  comment '�ֻ�����',
   email                varchar(64)  comment '����',
   header               varchar(500)  comment 'ͷ��',
   gender               tinyint  comment '�Ա�',
   birth                date  comment '����',
   city                 varchar(500)  comment '���ڳ���',
   job                  varchar(255)  comment 'ְҵ',
   sign                 varchar(255)  comment '����ǩ��',
   status               tinyint  comment '����״̬',
   create_time          datetime  comment 'ע��ʱ��',
   primary key (id)
);

alter table ums_member comment '��Ա';

