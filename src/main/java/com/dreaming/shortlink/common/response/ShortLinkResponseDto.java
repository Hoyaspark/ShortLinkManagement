package com.dreaming.shortlink.common.response;

import com.dreaming.shortlink.common.item.ShortLinkItemDto;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ShortLinkResponseDto<T extends ShortLinkItemDto> {

    private T data;

    @Builder
    public ShortLinkResponseDto(T data) {
        this.data = data;
    }

    public static <T extends ShortLinkItemDto> ShortLinkResponseDto of(T item) {
        return ShortLinkResponseDto.builder()
                .data(item)
                .build();
    }
}