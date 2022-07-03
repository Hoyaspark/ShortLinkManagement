package com.dreaming.shortlink.repository;

import com.dreaming.shortlink.common.item.ShortLinkItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortLinkRepository extends JpaRepository<ShortLinkItem, Long> {

}
