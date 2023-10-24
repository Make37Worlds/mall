/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: sms_sku_bounds                                        */
/*==============================================================*/
USE product;
drop table if exists sms_sku_bounds;
create table sms_sku_bounds
(
   id                   bigint not null auto_increment  comment 'id',
   sku_id               bigint  comment '',
   grow_bounds          decimal(18,4)  comment '�ɳ�����',
   buy_bounds           decimal(18,4)  comment '�������',
   work                 tinyint(1)  comment '�Ż���Ч���[1111���ĸ�״̬λ�����ҵ���;0 - ���Żݣ��ɳ������Ƿ�����;1 - ���Żݣ���������Ƿ�����;2 - ���Żݣ��ɳ������Ƿ�����;3 - ���Żݣ���������Ƿ����͡�״̬λ0�������ͣ�1�����͡�]',
   primary key (id)
);

alter table sms_sku_bounds comment '��Ʒsku��������';

