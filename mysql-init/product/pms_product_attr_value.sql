/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_product_attr_value                                */
/*==============================================================*/
USE product;
drop table if exists pms_product_attr_value;
create table pms_product_attr_value
(
   id                   bigint not null auto_increment  comment 'id',
   spu_id               bigint  comment '��Ʒid',
   attr_id              bigint  comment '����id',
   attr_name            varchar(200)  comment '������',
   attr_value           varchar(200)  comment '����ֵ',
   attr_sort            int  comment '˳��',
   quick_show           tinyint  comment '����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�',
   primary key (id)
);

alter table pms_product_attr_value comment 'spu����ֵ';

