/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: pms_attr                                              */
/*==============================================================*/
USE product;
drop table if exists pms_attr;
create table pms_attr
(
   attr_id              bigint not null auto_increment  comment '����id',
   attr_name            char(30)  comment '������',
   search_type          tinyint  comment '�Ƿ���Ҫ����[0-����Ҫ��1-��Ҫ]',
   icon                 varchar(255)  comment '����ͼ��',
   value_select         char(255)  comment '��ѡֵ�б�[�ö��ŷָ�]',
   attr_type            tinyint  comment '��������[0-�������ԣ�1-�������ԣ�2-���������������ǻ�������]',
   enable               bigint  comment '����״̬[0 - ���ã�1 - ����]',
   catelog_id           bigint  comment '��������',
   show_desc            tinyint  comment '����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�����sku����Ȼ���Ե���',
   primary key (attr_id)
);

alter table pms_attr comment '��Ʒ����';

