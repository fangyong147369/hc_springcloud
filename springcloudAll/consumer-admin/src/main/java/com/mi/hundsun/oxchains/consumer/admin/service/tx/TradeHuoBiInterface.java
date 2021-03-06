package com.mi.hundsun.oxchains.consumer.admin.service.tx;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 火币
 */
@FeignClient("${huobiTradeFeignName}")
public interface TradeHuoBiInterface {
    /**
     * 持仓查询—母账号资产同步
     *
     * @param api_key
     * @param api_secret
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/digiccy/v1/trade/account", method = RequestMethod.GET)
    String account(@RequestParam("api_key") String api_key, @RequestParam("api_secret") String api_secret) throws Exception;
}
