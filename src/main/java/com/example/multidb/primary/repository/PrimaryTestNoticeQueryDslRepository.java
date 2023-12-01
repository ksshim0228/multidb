package com.example.multidb.primary.repository;

import com.example.multidb.config.querydsl.PrimaryQuerydslRepositorySupport;
import com.example.multidb.primary.entity.PrimaryTestNoticeEntity;
import com.example.multidb.primary.entity.QPrimaryTestNoticeEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrimaryTestNoticeQueryDslRepository extends PrimaryQuerydslRepositorySupport {
    private final JPAQueryFactory primaryQueryFactory;

    public PrimaryTestNoticeQueryDslRepository(JPAQueryFactory primaryQueryFactory) {
        super(PrimaryTestNoticeEntity.class);
        this.primaryQueryFactory = primaryQueryFactory;
    }

    public List<PrimaryTestNoticeEntity> selectTestNoticeList(){
        QPrimaryTestNoticeEntity testNoticeEntity = QPrimaryTestNoticeEntity.primaryTestNoticeEntity;

        return primaryQueryFactory.select(Projections.fields(
                        PrimaryTestNoticeEntity.class,
                        testNoticeEntity.id,
                        testNoticeEntity.title
                ))
                .from(testNoticeEntity)
                .fetch();
    }
}
