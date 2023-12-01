package com.example.multidb.secondary.repository;

import com.example.multidb.config.querydsl.SecondaryQuerydslRepositorySupport;
import com.example.multidb.secondary.entity.QSecodeTestNoticeEntity;
import com.example.multidb.secondary.entity.SecondaryTestNoticeEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SecondaryTestNoticeQuerydslRepository extends SecondaryQuerydslRepositorySupport {
    private final JPAQueryFactory secondaryQueryFactory;

    public SecondaryTestNoticeQuerydslRepository(@Qualifier("secondaryQueryFactory") JPAQueryFactory factory) {
        super(SecondaryTestNoticeEntity.class);
        this.secondaryQueryFactory = factory;
    }

    public List<SecondaryTestNoticeEntity> selectTestNoticeList() {
        QSecodeTestNoticeEntity testNoticeEntity = QSecodeTestNoticeEntity.secodeTestNoticeEntity;

        return secondaryQueryFactory.select(Projections.fields(
                        SecondaryTestNoticeEntity.class,
                        testNoticeEntity.id,
                        testNoticeEntity.title
                ))
                .from(testNoticeEntity)
                .fetch();
    }
}
