package com.hak.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
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
public class RedisObjectOperation {

    @Autowired
    private RedisTemplate<Object, Object> objectRedisTemplate;

    /***
     * Operation object
     */
    public void ObjectSet(Object key, Object value) {
        ValueOperations<Object, Object> valueOperations = objectRedisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    /***
     * Operation element is a list of objects
     */
    public void ListSet(Object key, List<Object> values) {
        ListOperations<Object, Object> listOperations = objectRedisTemplate.opsForList();
        values.forEach(value -> listOperations.leftPush(key, value));
    }

    /***
     * Operation elements are collections of objects
     */
    public void SetSet(Object key, Set<Object> values) {
        SetOperations<Object, Object> setOperations = objectRedisTemplate.opsForSet();
        values.forEach(value -> setOperations.add(key, value));
    }

    /***
     * Get object
     */
    public Object ObjectGet(Object key) {
        ValueOperations<Object, Object> valueOperations = objectRedisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    /***
     * List popup element
     */
    public Object ListLeftPop(Object key) {
        ListOperations<Object, Object> listOperations = objectRedisTemplate.opsForList();
        return listOperations.leftPop(key, 2, TimeUnit.SECONDS);
    }

    /***
     * Collection popup elements
     */
    public Object SetPop(Object key) {
        SetOperations<Object, Object> setOperations = objectRedisTemplate.opsForSet();
        return setOperations.pop(key);
    }
}
