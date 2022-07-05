package com.dreaming.shortlink.common.item;

import com.dreaming.shortlink.common.domain.ShortLink;
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
    public ShortLinkItemDto(ShortLink entity) {
        this.shortId = entity.getShortId();
        this.url = entity.getUrl();
        this.createdAt = entity.getCreatedAt();
    }
}
