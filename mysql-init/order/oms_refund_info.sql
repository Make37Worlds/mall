/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_refund_info                                       */
/*==============================================================*/
USE order;
drop table if exists oms_refund_info;
create table oms_refund_info
(
   id                   bigint not null auto_increment  comment 'id',
   order_return_id      bigint  comment '�˿�Ķ���',
   refund               decimal(18,4)  comment '�˿���',
   refund_sn            varchar(64)  comment '�˿����ˮ��',
   refund_status        tinyint(1)  comment '�˿�״̬',
   refund_channel       tinyint  comment '�˿�����[1-֧������2-΢�ţ�3-������4-���]',
   refund_content       varchar(5000)  comment '',
   primary key (id)
);

alter table oms_refund_info comment '�˿���Ϣ';

