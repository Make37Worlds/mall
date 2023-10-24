/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2023/10/24 16:27:32                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ums_member                                            */
/*==============================================================*/
USE member;
drop table if exists ums_member;
create table ums_member
(
   id                   bigint not null auto_increment  comment 'id',
   level_id             bigint  comment '会员等级id',
   username             char(64)  comment '用户名',
   password             varchar(64)  comment '密码',
   nickname             varchar(64)  comment '昵称',
   mobile               varchar(20)  comment '手机号码',
   email                varchar(64)  comment '邮箱',
   header               varchar(500)  comment '头像',
   gender               tinyint  comment '性别',
   birth                date  comment '生日',
   city                 varchar(500)  comment '所在城市',
   job                  varchar(255)  comment '职业',
   sign                 varchar(255)  comment '个性签名',
   status               tinyint  comment '启用状态',
   create_time          datetime  comment '注册时间',
   primary key (id)
);

alter table ums_member comment '会员';

