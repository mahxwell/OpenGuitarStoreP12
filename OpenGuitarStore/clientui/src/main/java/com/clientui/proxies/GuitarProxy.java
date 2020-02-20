package com.clientui.proxies;

import com.clientui.beans.GuitarBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "guitar", url = "localhost:9002")
@FeignClient(name = "zuul-server", url = "localhost:9004")
public interface GuitarProxy {

    @GetMapping(value ="/guitar/findall")
    GuitarBean findAll();

}
