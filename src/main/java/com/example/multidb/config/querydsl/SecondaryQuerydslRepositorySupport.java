package com.example.multidb.config.querydsl;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public abstract class SecondaryQuerydslRepositorySupport extends QuerydslRepositorySupport {
    public SecondaryQuerydslRepositorySupport(Class<?> domainClass) {
        super(domainClass);
    }

    @Override
    @PersistenceContext(unitName = "secondaryEntityManager")
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}
