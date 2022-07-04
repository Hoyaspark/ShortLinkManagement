package com.dreaming.shortlink.common.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShortLink {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shortLinkId;

    @Column(unique = true)
    private String shortId;

    @Column(unique = true)
    private String url;

    private LocalDateTime createdAt;  //LocalDateTime > timestamp, LocalDate > date (in DBMS)
}
