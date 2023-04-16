package com.github.devtoju.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/info")
@RequiredArgsConstructor
public class DbInfoController {
    private final DbInfoService dbInfoService;

    @Value("${db.name}")
    String dbName;

    @GetMapping
    public List<DbData> getInfo() {
        return dbInfoService.getInfo();
    }

    @PostMapping
    public DbData addDbData() {
        var dbInfo = new DbData(UUID.randomUUID().toString(), dbName);
        return dbInfoService.addDbData(dbInfo);
    }
}
