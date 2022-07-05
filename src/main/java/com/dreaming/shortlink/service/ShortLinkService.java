package com.dreaming.shortlink.service;

import com.dreaming.shortlink.common.domain.ShortLink;
import com.dreaming.shortlink.common.item.ShortLinkItemDto;
import com.dreaming.shortlink.repository.ShortLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShortLinkService {

    private final ShortLinkRepository shortLinkRepository;

    public ShortLinkItemDto findOne(String shortId) {
        ShortLink entity = shortLinkRepository.findOne(shortId);

        return new ShortLinkItemDto(entity);
    }
}
