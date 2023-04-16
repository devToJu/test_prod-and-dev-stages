package com.github.devtoju.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbInfoService {
    private final DbInfoRepo dbInfoRepo;

    public List<DbData> getInfo() {
        return dbInfoRepo.findAll();
    }

    public DbData addDbData(DbData dbInfo) {
        return dbInfoRepo.save(dbInfo);
    }
}
