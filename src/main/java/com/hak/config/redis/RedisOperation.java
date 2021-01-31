package com.hak.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Component
public class RedisOperation {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /***
     * Manipulate ordinary strings
     */
    public void StringSet(String key, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    /***
     * Operation list
     */
    public void ListSet(String key, List<String> values) {
        ListOperations<String, String> listOperations = redisTemplate.opsForList();
        values.forEach(value -> listOperations.leftPush(key, value));
    }

    /***
     * Operation set
     */
    public void SetSet(String key, Set<String> values) {
        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        values.forEach(value -> setOperations.add(key, value));
    }

    /***
     * Get string
     */
    public String StringGet(String key) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    /***
     * List popup element
     */
    public String ListLeftPop(String key) {
        ListOperations<String, String> listOperations = redisTemplate.opsForList();
        return listOperations.leftPop(key, 2, TimeUnit.SECONDS);
    }

    /***
     * Collection popup elements
     */
    public String SetPop(String key) {
        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        return setOperations.pop(key);
    }

}
