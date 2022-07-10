package com.dreaming.shortlink.common.item;

import com.dreaming.shortlink.common.domain.ShortLink;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ShortLinkItemDto {

    private String shortId;
    private String url;
    private LocalDateTime createdAt;

    public ShortLinkItemDto(ShortLink entity) {
        this.shortId = entity.getShortId();
        this.url = entity.getUrl();
        this.createdAt = entity.getCreatedAt();
    }

    @Builder
    public ShortLinkItemDto(String shortId, String url, LocalDateTime createdAt) {
        this.shortId = shortId;
        this.url = url;
        this.createdAt = createdAt;
    }

    public ShortLink toEntity() {
        return ShortLink.builder()
                .shortId(shortId)
                .url(url)
                .createdAt(createdAt)
                .build();
    }

}
