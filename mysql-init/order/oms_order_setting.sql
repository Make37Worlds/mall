/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order_setting                                     */
/*==============================================================*/
USE order;
drop table if exists oms_order_setting;
create table oms_order_setting
(
   id                   bigint not null auto_increment  comment 'id',
   flash_order_overtime int  comment '��ɱ������ʱ�ر�ʱ��(��)',
   normal_order_overtime int  comment '����������ʱʱ��(��)',
   confirm_overtime     int  comment '�������Զ�ȷ���ջ�ʱ�䣨�죩',
   finish_overtime      int  comment '�Զ���ɽ���ʱ�䣬���������˻����죩',
   comment_overtime     int  comment '������ɺ��Զ�����ʱ�䣨�죩',
   primary key (id)
);

alter table oms_order_setting comment '����������Ϣ';

