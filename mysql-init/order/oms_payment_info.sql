/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_payment_info                                      */
/*==============================================================*/
USE order;
drop table if exists oms_payment_info;
create table oms_payment_info
(
   id                   bigint not null auto_increment  comment 'id',
   order_sn             char(32)  comment '�����ţ�����ҵ��ţ�',
   order_id             bigint  comment '����id',
   alipay_trade_no      varchar(50)  comment '֧����������ˮ��',
   total_amount         decimal(18,4)  comment '֧���ܽ��',
   subject              varchar(200)  comment '��������',
   payment_status       varchar(20)  comment '֧��״̬',
   create_time          datetime  comment '����ʱ��',
   confirm_time         datetime  comment 'ȷ��ʱ��',
   callback_content     varchar(4000)  comment '�ص�����',
   callback_time        datetime  comment '�ص�ʱ��',
   primary key (id)
);

alter table oms_payment_info comment '֧����Ϣ��';

