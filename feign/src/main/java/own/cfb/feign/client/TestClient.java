package own.cfb.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value="client")
public interface TestClient {

    @RequestMapping("/tc")
    public String testExample(@RequestParam("name") String name);
}
