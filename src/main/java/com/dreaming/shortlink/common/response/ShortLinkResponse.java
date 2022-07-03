package com.dreaming.shortlink.common.response;

import com.dreaming.shortlink.common.item.ShortLinkItem;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ShortLinkResponse<T extends ShortLinkItem> {

    private T data;

    @Builder
    public ShortLinkResponse(T data){
        this.data = data;
    }

    public static <T extends ShortLinkItem> ShortLinkResponse of(T item){
        return ShortLinkResponse.builder()
                .data(item)
                .build();
    }

}
