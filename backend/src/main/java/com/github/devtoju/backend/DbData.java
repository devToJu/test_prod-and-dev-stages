package com.github.devtoju.backend;

import org.springframework.data.annotation.Id;

public record DbData(
        @Id
        String id,
        String name
) {
}
