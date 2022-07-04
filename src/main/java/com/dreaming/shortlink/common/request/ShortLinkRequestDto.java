package com.dreaming.shortlink.common.request;

import com.dreaming.shortlink.common.item.ShortLinkItem;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ShortLinkRequestDto {
    private String url;

    @Builder
    public ShortLinkRequestDto(String url) {
        this.url = url;
    }

    public ShortLinkItem toEntity() {
        return ShortLinkItem.builder()
                .url(url)
                .build();
    }
}