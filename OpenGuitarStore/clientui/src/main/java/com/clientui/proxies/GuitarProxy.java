package com.clientui.proxies;

import com.clientui.beans.GuitarBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "guitar", url = "localhost:9002")
public interface GuitarProxy {

    @GetMapping(value ="/findall")
    GuitarBean findAll();

}
