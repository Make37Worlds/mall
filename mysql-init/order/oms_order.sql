/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: oms_order                                             */
/*==============================================================*/
USE order;
drop table if exists oms_order;
create table oms_order
(
   id                   bigint not null auto_increment  comment 'id',
   member_id            bigint  comment 'member_id',
   order_sn             char(32)  comment '������',
   create_time          datetime  comment 'create_time',
   member_username      varchar(200)  comment '�û���',
   total_amount         decimal(18,4)  comment '�����ܶ�',
   pay_amount           decimal(18,4)  comment 'Ӧ���ܶ�',
   freight_amount       decimal(18,4)  comment '�˷ѽ��',
   pay_type             tinyint  comment '֧����ʽ��1->֧������2->΢�ţ�3->������ 4->���������',
   source_type          tinyint  comment '������Դ[0->PC������1->app����]',
   status               tinyint  comment '����״̬��0->�����1->��������2->�ѷ�����3->����ɣ�4->�ѹرգ�5->��Ч������',
   delivery_company     varchar(64)  comment '������˾(���ͷ�ʽ)',
   delivery_sn          varchar(64)  comment '��������',
   growth               int  comment '���Ի�õĳɳ�ֵ',
   receiver_name        varchar(100)  comment '�ջ�������',
   receiver_phone       varchar(32)  comment '�ջ��˵绰',
   receiver_post_code   varchar(32)  comment '�ջ����ʱ�',
   receiver_province    varchar(32)  comment 'ʡ��/ֱϽ��',
   receiver_city        varchar(32)  comment '����',
   receiver_region      varchar(32)  comment '��',
   receiver_detail_address varchar(200)  comment '��ϸ��ַ',
   note                 varchar(500)  comment '������ע',
   confirm_status       tinyint  comment 'ȷ���ջ�״̬[0->δȷ�ϣ�1->��ȷ��]',
   delete_status        tinyint  comment 'ɾ��״̬��0->δɾ����1->��ɾ����',
   payment_time         datetime  comment '֧��ʱ��',
   delivery_time        datetime  comment '����ʱ��',
   receive_time         datetime  comment 'ȷ���ջ�ʱ��',
   comment_time         datetime  comment '����ʱ��',
   modify_time          datetime  comment '�޸�ʱ��',
   primary key (id)
);

alter table oms_order comment '����';

