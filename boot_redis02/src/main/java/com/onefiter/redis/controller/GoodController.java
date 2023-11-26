package com.onefiter.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


@RestController
public class GoodController
{
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private final Lock lock = new ReentrantLock();
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/buy_goods")
    public String buyGoods() throws InterruptedException {
        /*synchronized (this)
        {
            String number = stringRedisTemplate.opsForValue().get("goods:001");

            int realNumber = number == null ? 0 : Integer.parseInt(number);

            if(realNumber > 0)
            {
                realNumber = realNumber - 1;
                stringRedisTemplate.opsForValue().set("goods:001",String.valueOf(realNumber));
                return "你已经成功秒杀商品，此时还剩余：" + realNumber + "件";
            }
        }*/

        //if (lock.tryLock(2L,TimeUnit.SECONDS))
        if (lock.tryLock()) {
            try {
                String number = stringRedisTemplate.opsForValue().get("goods:001");

                int realNumber = number == null ? 0 : Integer.parseInt(number);

                if (realNumber > 0) {
                    realNumber = realNumber - 1;
                    stringRedisTemplate.opsForValue().set("goods:001", String.valueOf(realNumber));
                    return "你已经成功秒杀商品，此时还剩余：" + realNumber + "件";
                }
            } finally {
                lock.unlock();
            }
        }
        return "商品售罄/活动结束，欢迎下次光临";
    }
}

