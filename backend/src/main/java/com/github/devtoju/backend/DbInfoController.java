package com.github.devtoju.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/info")
@RequiredArgsConstructor
public class DbInfoController {
    private final DbInfoService dbInfoService;

    @GetMapping
    public String getInfo() {
        return dbInfoService.getInfo();
    }

    @PostMapping
    public DbData addDbData() {
        var dbInfo = new DbData(UUID.randomUUID().toString(), "local DB");
        return dbInfoService.addDbData(dbInfo);
    }
}
