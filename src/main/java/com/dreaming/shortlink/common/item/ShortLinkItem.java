package com.dreaming.shortlink.common.item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ShortLinkItem {

    private String shortId;
    private String url;
    private LocalDateTime createdAt;

    @Builder
    public ShortLinkItem(String shortId, String url, LocalDateTime createdAt){
        this.shortId = shortId;
        this.url = url;
        this.createdAt = createdAt;
    }

}
