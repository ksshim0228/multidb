package com.example.multidb.primary.repository;

import com.example.multidb.primary.entity.PrimaryTestNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryTestNoticeRepository extends JpaRepository<PrimaryTestNoticeEntity, Long> {
}
