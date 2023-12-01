package com.example.multidb.secondary.repository;

import com.example.multidb.secondary.entity.SecondaryTestNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryTestNoticeRepository extends JpaRepository<SecondaryTestNoticeEntity, Long> {
}
