package practice;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisBasic {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);
        try (Jedis jedis = pool.getResource()) {
//             Store & Retrieve a simple string
//            jedis.set("foo", "bar");
//            jedis.setnx("foo", "bar");
//            jedis.get("foo");

            for (int i = 0; i < 10; i++) {
                String key = "name-" + i;
                String value = "dummy-" + i;
                jedis.append(key, value);
                System.out.println(jedis.get(key));
            }

        }
    }
}
