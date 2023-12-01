package com.example.multidb.service;

import com.example.multidb.primary.entity.PrimaryTestNoticeEntity;
import com.example.multidb.primary.repository.PrimaryTestNoticeQueryDslRepository;
import com.example.multidb.primary.repository.PrimaryTestNoticeRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoArgsConstructor
@Transactional
@Service
public class PrimaryTestNoticeService {
    @Autowired private PrimaryTestNoticeRepository primaryTestNoticeRepository;
    @Autowired private PrimaryTestNoticeQueryDslRepository primaryTestNoticeQueryDslRepository;

    public List<PrimaryTestNoticeEntity> selectTestWorkList() {
        PrimaryTestNoticeEntity entity = new PrimaryTestNoticeEntity();
        entity.setTitle("Primary - 제목1");
        primaryTestNoticeRepository.save(entity);

        List<PrimaryTestNoticeEntity> entityList = primaryTestNoticeQueryDslRepository.selectTestNoticeList();
        return entityList;
    }
}
