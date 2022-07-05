package com.dreaming.shortlink.controller;

import com.dreaming.shortlink.common.item.ShortLinkItemDto;
import com.dreaming.shortlink.common.request.ShortLinkRequestDto;
import com.dreaming.shortlink.common.response.ShortLinkResponseDto;
import com.dreaming.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @PostMapping("/short-links")
    public ShortLinkResponseDto shortLinks(@RequestBody ShortLinkRequestDto request) {

        return ShortLinkResponseDto.of(ShortLinkItemDto.builder().build());
    }

    @GetMapping("short-links/{short_id}")
    public ShortLinkResponseDto findShortLink(@PathVariable("short_id") String shortId){

        ShortLinkItemDto item = shortLinkService.findShortLinkById(shortId);
        return ShortLinkResponseDto.of(item);
    }

    @GetMapping("/r/{short_id}")
    public void redirect2ShortLink(@PathVariable("short_id") String shortId,
                                    HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.naver.com");
    }
}
