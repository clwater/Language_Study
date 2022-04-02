-- auto-generated definition
create table word
(
    id          int auto_increment
        primary key,
    word        varchar(50)    not null comment '单词',
    translate   varchar(20)    not null comment '翻译',
    eg          varchar(100)   null comment '例句',
    word_src    varchar(10)    null comment '单词来源',
    category    varchar(10)    null comment '单词种类',
    learn_order int default 10 null comment '学习优先基本, 1最高',
    constraint word_column_1_uindex
        unique (id),
    constraint word_word_uindex
        unique (word)
);


