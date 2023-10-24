/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order_item                                        */
/*==============================================================*/
USE order;
drop table if exists oms_order_item;
create table oms_order_item
(
   id                   bigint not null auto_increment  comment 'id',
   order_id             bigint  comment 'order_id',
   order_sn             char(32)  comment 'order_sn',
   spu_id               bigint  comment 'spu_id',
   spu_name             varchar(255)  comment 'spu_name',
   spu_pic              varchar(500)  comment 'spu_pic',
   spu_brand            varchar(200)  comment 'Ʒ��',
   category_id          bigint  comment '��Ʒ����id',
   sku_id               bigint  comment '��Ʒsku���',
   sku_name             varchar(255)  comment '��Ʒsku����',
   sku_pic              varchar(500)  comment '��ƷskuͼƬ',
   sku_price            decimal(18,4)  comment '��Ʒsku�۸�',
   sku_quantity         int  comment '��Ʒ���������',
   primary key (id)
);

alter table oms_order_item comment '��������Ϣ';

