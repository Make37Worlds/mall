/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_spu_images                                        */
/*==============================================================*/
USE product;
drop table if exists pms_spu_images;
create table pms_spu_images
(
   id                   bigint not null auto_increment  comment 'id',
   spu_id               bigint  comment 'spu_id',
   img_name             varchar(200)  comment 'ͼƬ��',
   img_url              varchar(255)  comment 'ͼƬ��ַ',
   img_sort             int  comment '˳��',
   default_img          tinyint  comment '�Ƿ�Ĭ��ͼ',
   primary key (id)
);

alter table pms_spu_images comment 'spuͼƬ';

