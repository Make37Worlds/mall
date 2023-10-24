/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_spu_info_desc                                     */
/*==============================================================*/
USE product;
drop table if exists pms_spu_info_desc;
create table pms_spu_info_desc
(
   spu_id               bigint not null  comment '��Ʒid',
   decript              longtext  comment '��Ʒ����',
   primary key (spu_id)
);

alter table pms_spu_info_desc comment 'spu��Ϣ����';

