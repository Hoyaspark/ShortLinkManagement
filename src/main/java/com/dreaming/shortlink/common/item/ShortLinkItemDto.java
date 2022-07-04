package com.dreaming.shortlink.common.item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ShortLinkItemDto {

    private String shortId;
    private String url;
    private LocalDateTime createdAt;

    @Builder
    public ShortLinkItemDto(String shortId, String url, LocalDateTime createdAt) {
        this.shortId = shortId;
        this.url = url;
        this.createdAt = createdAt;
    }
}
