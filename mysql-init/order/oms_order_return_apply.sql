/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order_return_apply                                */
/*==============================================================*/
USE order;
drop table if exists oms_order_return_apply;
create table oms_order_return_apply
(
   id                   bigint not null auto_increment  comment 'id',
   order_id             bigint  comment 'order_id',
   sku_id               bigint  comment '�˻���Ʒid',
   order_sn             char(32)  comment '�������',
   create_time          datetime  comment '����ʱ��',
   member_username      varchar(64)  comment '��Ա�û���',
   return_amount        decimal(18,4)  comment '�˿���',
   return_name          varchar(100)  comment '�˻�������',
   return_phone         varchar(20)  comment '�˻��˵绰',
   status               tinyint(1)  comment '����״̬[0->������1->�˻��У�2->����ɣ�3->�Ѿܾ�]',
   handle_time          datetime  comment '����ʱ��',
   sku_img              varchar(500)  comment '��ƷͼƬ',
   sku_name             varchar(200)  comment '��Ʒ����',
   sku_brand            varchar(200)  comment '��ƷƷ��',
   sku_attrs_vals       varchar(500)  comment '��Ʒ��������(JSON)',
   sku_count            int  comment '�˻�����',
   sku_price            decimal(18,4)  comment '��Ʒ����',
   sku_real_price       decimal(18,4)  comment '��Ʒʵ��֧������',
   reason               varchar(200)  comment 'ԭ��',
   description��         varchar(500)  comment '����',
   desc_pics            varchar(2000)  comment 'ƾ֤ͼƬ���Զ��Ÿ���',
   handle_note          varchar(500)  comment '����ע',
   handle_man           varchar(200)  comment '������Ա',
   receive_man          varchar(100)  comment '�ջ���',
   receive_time         datetime  comment '�ջ�ʱ��',
   receive_note         varchar(500)  comment '�ջ���ע',
   receive_phone        varchar(20)  comment '�ջ��绰',
   company_address      varchar(500)  comment '��˾�ջ���ַ',
   primary key (id)
);

alter table oms_order_return_apply comment '�����˻�����';

