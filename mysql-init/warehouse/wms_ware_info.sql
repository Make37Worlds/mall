/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: wms_ware_info                                         */
/*==============================================================*/
USE warehouse;
drop table if exists wms_ware_info;
create table wms_ware_info
(
   id                   bigint not null auto_increment  comment 'id',
   name                 varchar(255)  comment '�ֿ���',
   address              varchar(255)  comment '�ֿ��ַ',
   areacode             varchar(20)  comment '�������',
   primary key (id)
);

alter table wms_ware_info comment '�ֿ���Ϣ';

