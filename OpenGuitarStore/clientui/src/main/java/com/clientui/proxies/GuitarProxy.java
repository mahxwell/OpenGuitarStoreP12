package com.clientui.proxies;

import com.clientui.beans.Guitar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "guitar", url = "localhost:9002")
@FeignClient(name = "zuul", url = "localhost:9004")
public interface GuitarProxy {

    @GetMapping(value ="/guitar/findall")
    List<Guitar> findAll();
}
