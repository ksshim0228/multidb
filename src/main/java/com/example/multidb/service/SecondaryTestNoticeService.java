package com.example.multidb.service;

import com.example.multidb.secondary.entity.SecondaryTestNoticeEntity;
import com.example.multidb.secondary.repository.SecondaryTestNoticeQuerydslRepository;
import com.example.multidb.secondary.repository.SecondaryTestNoticeRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoArgsConstructor
@Transactional
@Service
public class SecondaryTestNoticeService {
    @Autowired private SecondaryTestNoticeRepository secondaryTestNoticeRepository;
    @Autowired private SecondaryTestNoticeQuerydslRepository secondaryTestNoticeQuerydslRepository;

    public List<SecondaryTestNoticeEntity> selectTestWorkList() {
        SecondaryTestNoticeEntity entity = new SecondaryTestNoticeEntity();
        entity.setTitle("Secondary - 제목1");
        secondaryTestNoticeRepository.save(entity);

        List<SecondaryTestNoticeEntity> entityList = secondaryTestNoticeQuerydslRepository.selectTestNoticeList();
        return entityList;
    }
}
