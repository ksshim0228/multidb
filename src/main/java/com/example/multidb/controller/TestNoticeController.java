package com.example.multidb.controller;

import com.example.multidb.primary.entity.PrimaryTestNoticeEntity;
import com.example.multidb.secondary.entity.SecondaryTestNoticeEntity;
import com.example.multidb.service.PrimaryTestNoticeService;
import com.example.multidb.service.SecondaryTestNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestNoticeController {
    @Autowired private PrimaryTestNoticeService primaryTestNoticeService;
    @Autowired private SecondaryTestNoticeService secondaryTestNoticeService;

    @ResponseBody
    @GetMapping("/notice")
    public String getNotice() {
        List<PrimaryTestNoticeEntity> primary = primaryTestNoticeService.selectTestWorkList();
        List<SecondaryTestNoticeEntity> secondary = secondaryTestNoticeService.selectTestWorkList();

        for(PrimaryTestNoticeEntity entity : primary) {
            System.out.println("primary - " + entity.getTitle());
        }
        for(SecondaryTestNoticeEntity entity : secondary) {
            System.out.println("secondary - " + entity.getTitle());
        }

        return "Success";
    }
}
