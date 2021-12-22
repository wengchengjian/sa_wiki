drop table if exists `test`;

create table `test` (
                        `id` bigint primary key  auto_increment not null comment 'id',
                        `name` varchar(50) not null default '' comment 'name',
                        `password` varchar(50) not null default '' comment 'password'
)auto_increment=1;