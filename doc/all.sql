drop table if exists `test`;

create table `test` (
                        `id` bigint primary key  auto_increment not null comment 'id',
                        `name` varchar(50) not null default '' comment 'name',
                        `password` varchar(50) not null default '' comment 'password'
)auto_increment=1;

drop table if exists `ebook`;

create table `ebook`(
    `id` bigint primary key comment 'id',
    `name` varchar(50) not null  comment '名称',
    `category1_id` bigint comment '分类一',
    `category2_id` bigint comment '分类二',
    `cover` varchar(200) comment '封面',
    `description` varchar(200) comment '描述',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数'
)engine=Innodb default charset=utf8mb4 comment '电子书';

insert into `ebook`(id,name,description) values(1,'SpringBoot教程','SpringBoot教程');
insert into `ebook`(id,name,description) values(2,'Vue教程','Vue教程');
insert into `ebook`(id,name,description) values(3,'React教程','React教程');
insert into `ebook`(id,name,description) values(4,'SSM教程','SSM教程');
insert into `ebook`(id,name,description) values(5,'Mybatis教程','Mybatis教程');