create database db2021;

use db2021;

CREATE TABLE `t_user`
(
    `id`                int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username`          varchar(20)  NOT NULL DEFAULT '',
    `sex`          tinyint(2)  NOT NULL DEFAULT 0 COMMENT '0未知，1：男，2：女',
    `deleted`       tinyint(2) NOT NULL DEFAULT 0 COMMENT '1:删除，0：未删除',
    `created_time`      datetime         NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time`      datetime         NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT ='testUser表';