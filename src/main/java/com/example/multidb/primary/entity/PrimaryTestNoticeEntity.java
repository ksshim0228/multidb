package com.example.multidb.primary.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "TEST_NOTICE")
public class PrimaryTestNoticeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "bigint COMMENT 'ID'")
    private Long id;

    @Column(name = "TITLE", columnDefinition = "varchar(50) COMMENT '제목'")
    private String title;
}
