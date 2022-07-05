package com.dreaming.shortlink.repository;

import com.dreaming.shortlink.common.domain.ShortLink;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ShortLinkRepository {

    private final EntityManager em;

    public ShortLink findOne(String shortId) {
        return em.find(ShortLink.class, shortId);
    }
}