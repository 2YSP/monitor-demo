package cn.sp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequestMapping("/heap/test")
@RestController
public class TestController {

    public static final Map<String, Object> map = new ConcurrentHashMap<>();

    @RequestMapping("")
    public String testHeapUsed() {
        for (int i = 0; i < 10000000; i++) {
            map.put(i + "", new Object());
        }
        return "ok";
    }
}
