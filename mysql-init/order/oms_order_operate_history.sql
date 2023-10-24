/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order_operate_history                             */
/*==============================================================*/
USE order;
drop table if exists oms_order_operate_history;
create table oms_order_operate_history
(
   id                   bigint not null auto_increment  comment 'id',
   order_id             bigint  comment '����id',
   operate_man          varchar(100)  comment '������[�û���ϵͳ����̨����Ա]',
   create_time          datetime  comment '����ʱ��',
   order_status         tinyint  comment '����״̬��0->�����1->��������2->�ѷ�����3->����ɣ�4->�ѹرգ�5->��Ч������',
   note                 varchar(500)  comment '��ע',
   primary key (id)
);

alter table oms_order_operate_history comment '����������ʷ��¼';

