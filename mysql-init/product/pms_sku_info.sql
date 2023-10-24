/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_sku_info                                          */
/*==============================================================*/
USE product;
drop table if exists pms_sku_info;
create table pms_sku_info
(
   sku_id               bigint not null auto_increment  comment 'skuId',
   spu_id               bigint  comment 'spuId',
   sku_name             varchar(255)  comment 'sku����',
   sku_desc             varchar(2000)  comment 'sku��������',
   catalog_id           bigint  comment '��������id',
   brand_id             bigint  comment 'Ʒ��id',
   sku_default_img      varchar(255)  comment 'Ĭ��ͼƬ',
   sku_title            varchar(255)  comment '����',
   sku_subtitle         varchar(2000)  comment '������',
   price                decimal(18,4)  comment '�۸�',
   sale_count           bigint  comment '����',
   primary key (sku_id)
);

alter table pms_sku_info comment 'sku��Ϣ';

