/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member_statistics_info                            */
/*==============================================================*/
USE member;
drop table if exists ums_member_statistics_info;
create table ums_member_statistics_info
(
   id                   bigint not null auto_increment  comment 'id',
   member_id            bigint  comment '��Աid',
   consume_amount       decimal(18,4)  comment '�ۼ����ѽ��',
   coupon_amount        decimal(18,4)  comment '�ۼ��Żݽ��',
   order_count          int  comment '��������',
   comment_count        int  comment '������',
   return_order_count   int  comment '�˻�����',
   login_count          int  comment '��¼����',
   attend_count         int  comment '��ע����',
   fans_count           int  comment '��˿����',
   collect_product_count int  comment '�ղص���Ʒ����',
   collect_subject_count int  comment '�ղص�ר������',
   collect_comment_count int  comment '�ղص���������',
   invite_friend_count  int  comment '�������������',
   primary key (id)
);

alter table ums_member_statistics_info comment '��Աͳ����Ϣ';

