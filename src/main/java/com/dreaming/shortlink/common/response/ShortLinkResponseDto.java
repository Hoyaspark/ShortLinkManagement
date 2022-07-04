package com.dreaming.shortlink.common.response;

import com.dreaming.shortlink.common.item.ShortLinkItem;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ShortLinkResponseDto<T extends ShortLinkItem> {

    private T data;

    @Builder
    public ShortLinkResponseDto(T data) {
        this.data = data;
    }

    public static <T extends ShortLinkItem> ShortLinkResponseDto of(T item) {
        return ShortLinkResponseDto.builder()
                .data(item)
                .build();
    }
}