package com.github.devtoju.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbInfoService {
    private final DbInfoRepo dbInfoRepo;

    public String getInfo() {
        List<DbData> dbData = dbInfoRepo.findAll();
        return dbData.isEmpty() ? "NIX GEFUNDEN" : dbData.get(0).name();
    }

    public DbData addDbData(DbData dbInfo) {
        return dbInfoRepo.save(dbInfo);
    }
}
