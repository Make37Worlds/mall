/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member_receive_address                            */
/*==============================================================*/
USE member;
drop table if exists ums_member_receive_address;
create table ums_member_receive_address
(
   id                   bigint not null auto_increment  comment 'id',
   member_id            bigint  comment 'member_id',
   name                 varchar(255)  comment '�ջ�������',
   phone                varchar(64)  comment '�绰',
   post_code            varchar(64)  comment '��������',
   province             varchar(100)  comment 'ʡ��/ֱϽ��',
   city                 varchar(100)  comment '����',
   region               varchar(100)  comment '��',
   detail_address       varchar(255)  comment '��ϸ��ַ(�ֵ�)',
   areacode             varchar(15)  comment 'ʡ��������',
   default_status       tinyint(1)  comment '�Ƿ�Ĭ��',
   primary key (id)
);

alter table ums_member_receive_address comment '��Ա�ջ���ַ';

