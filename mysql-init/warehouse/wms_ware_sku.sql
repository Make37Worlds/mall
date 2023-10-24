/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: wms_ware_sku                                          */
/*==============================================================*/
USE warehouse;
drop table if exists wms_ware_sku;
create table wms_ware_sku
(
   id                   bigint not null auto_increment  comment 'id',
   sku_id               bigint  comment 'sku_id',
   ware_id              bigint  comment '�ֿ�id',
   stock                int  comment '�����',
   sku_name             varchar(200)  comment 'sku_name',
   stock_locked         int  comment '�������',
   primary key (id)
);

alter table wms_ware_sku comment '��Ʒ���';

