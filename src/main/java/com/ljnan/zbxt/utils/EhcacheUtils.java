package com.ljnan.zbxt.utils;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * @author lijianan
 * @date 2020-04-21 18:18
 * @description
 */
@Slf4j
public class EhcacheUtils {
    private final static String CACHENAME = "myCache";
    private static Cache cache = null;
    private static CacheManager cacheManager = null;

    public static void initCacheManager() {
        try {
            if (null == cacheManager) {
                cacheManager = CacheManager.getInstance();
            }
        } catch (Exception e) {
            log.error("初始化缓存容器失败", e);
        }
    }

    public static void initCache(String cacheName) {
        try {
            if (null == cacheManager.getCache(cacheName)) {
                cacheManager.addCache(cacheName);
            }
            cache = cacheManager.getCache(cacheName);
        } catch (Exception e) {
            log.error("获取cache单元失败", e);
        }
    }
}
