/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_sku_images                                        */
/*==============================================================*/
USE product;
drop table if exists pms_sku_images;
create table pms_sku_images
(
   id                   bigint not null auto_increment  comment 'id',
   sku_id               bigint  comment 'sku_id',
   img_url              varchar(255)  comment 'ͼƬ��ַ',
   img_sort             int  comment '����',
   default_img          int  comment 'Ĭ��ͼ[0 - ����Ĭ��ͼ��1 - ��Ĭ��ͼ]',
   primary key (id)
);

alter table pms_sku_images comment 'skuͼƬ';

