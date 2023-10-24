/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_spu_info                                          */
/*==============================================================*/
USE product;
drop table if exists pms_spu_info;
create table pms_spu_info
(
   id                   bigint not null auto_increment  comment '��Ʒid',
   spu_name             varchar(200)  comment '��Ʒ����',
   spu_description      varchar(1000)  comment '��Ʒ����',
   catalog_id           bigint  comment '��������id',
   brand_id             bigint  comment 'Ʒ��id',
   weight               decimal(18,4)  comment '',
   publish_status       tinyint  comment '�ϼ�״̬[0 - �¼ܣ�1 - �ϼ�]',
   create_time          datetime  comment '',
   update_time          datetime  comment '',
   primary key (id)
);

alter table pms_spu_info comment 'spu��Ϣ';

