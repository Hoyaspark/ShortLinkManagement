package com.dreaming.shortlink.repository;

import com.dreaming.shortlink.common.domain.ShortLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShortLinkRepository extends JpaRepository<ShortLink, Long> {

    // select * from shortlink as sl where sl.shortId = "dklfjdl";
    @Query("SELECT SL FROM ShortLink AS SL WHERE SL.shortId = :shortId")
    Optional<ShortLink> findByShortId(@Param(value = "shortId") String shortId);


}
