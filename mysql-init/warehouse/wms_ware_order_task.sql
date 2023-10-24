/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: wms_ware_order_task                                   */
/*==============================================================*/
USE warehouse;
drop table if exists wms_ware_order_task;
create table wms_ware_order_task
(
   id                   bigint not null auto_increment  comment 'id',
   order_id             bigint  comment 'order_id',
   order_sn             varchar(255)  comment 'order_sn',
   consignee            varchar(100)  comment '�ջ���',
   consignee_tel        char(15)  comment '�ջ��˵绰',
   delivery_address     varchar(500)  comment '���͵�ַ',
   order_comment        varchar(200)  comment '������ע',
   payment_way          tinyint(1)  comment '���ʽ�� 1:���߸��� 2:�������',
   task_status          tinyint(2)  comment '����״̬',
   order_body           varchar(255)  comment '��������',
   tracking_no          char(30)  comment '��������',
   create_time          datetime  comment 'create_time',
   ware_id              bigint  comment '�ֿ�id',
   task_comment         varchar(500)  comment '��������ע',
   primary key (id)
);

alter table wms_ware_order_task comment '��湤����';

