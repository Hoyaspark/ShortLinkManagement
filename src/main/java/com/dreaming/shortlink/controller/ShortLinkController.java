package com.dreaming.shortlink.controller;


import com.dreaming.shortlink.common.item.ShortLinkItem;
import com.dreaming.shortlink.common.request.ShortLinkRequest;
import com.dreaming.shortlink.common.response.ShortLinkResponse;
import com.dreaming.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @PostMapping("/short-links")
    public ShortLinkResponse shortLinks(@RequestBody ShortLinkRequest request) {

        return ShortLinkResponse.of(ShortLinkItem.builder().build());
    }

    @GetMapping("/short-links/{short_id}")
    public ShortLinkResponse searchShortLink(@PathVariable("short_id") String shortId){
        return ShortLinkResponse.of(ShortLinkItem.builder().build());
    }

    @GetMapping("/r/{short_id}")
    public void redirectToShortLink(@PathVariable("short_id") String shortId,
                                      HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.naver.com");
    }


}
