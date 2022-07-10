package com.dreaming.shortlink.controller;

import com.dreaming.shortlink.common.domain.ShortLink;
import com.dreaming.shortlink.common.item.ShortLinkItemDto;
import com.dreaming.shortlink.common.request.ShortLinkRequestDto;
import com.dreaming.shortlink.common.response.ShortLinkResponseDto;
import com.dreaming.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @PostMapping("/short-links")
    public ShortLinkResponseDto shortLinks(@RequestParam("url") String url) {

        return shortLinkService.generateShortId(url);
    }

    @GetMapping("short-links/{short_id}")
    public ShortLinkResponseDto findShortLink(@PathVariable("short_id") String shortId){

        ShortLinkItemDto item = shortLinkService.findShortLinkById(shortId);

        return ShortLinkResponseDto.of(item);
    }

    @GetMapping("/r/{short_id}")
    public String redirect2ShortLink(@PathVariable("short_id") String shortId,
                                    HttpServletResponse response) throws IOException {
        String url = shortLinkService.getUrlByShortId(shortId);

        return "redirect:" + url;
    }
}
