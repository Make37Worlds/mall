/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: wms_ware_order_task_detail                            */
/*==============================================================*/
USE warehouse;
drop table if exists wms_ware_order_task_detail;
create table wms_ware_order_task_detail
(
   id                   bigint not null auto_increment  comment 'id',
   sku_id               bigint  comment 'sku_id',
   sku_name             varchar(255)  comment 'sku_name',
   sku_num              int  comment '�������',
   task_id              bigint  comment '������id',
   primary key (id)
);

alter table wms_ware_order_task_detail comment '��湤����';

